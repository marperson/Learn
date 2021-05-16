package com.frankhe.java.ocp.lab15_module.data;


import com.frankhe.java.ocp.lab14_multithreading.data.ProductManagerException;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

// important: Factory class: class which creates a lot of instance
public class ProductManager {

    private Map<Product, List<Review>> products = new HashMap<>();
    private ResourceFormatter formatter;
    private static final Map<String, ResourceFormatter> formatters = Map.of(
            "en-GB", new ResourceFormatter((Locale.UK)),
            "en-US", new ResourceFormatter(Locale.US),
            "ru-RU", new ResourceFormatter(new Locale("ru", "RU"))
    );
//lab 12
    private static final Logger logger = Logger.getLogger(ProductManager.class.getName());
//    lab 12 ,method 1: use resource bundle, this will come with build, method 2 use properties file, this will not come with build as it's considered as properties
    private final ResourceBundle config = ResourceBundle.getBundle("com.frankhe.java.ocp.lab15_module.data.config");
    private final MessageFormat reviewFormat = new MessageFormat(config.getString("review.data.format"));
    private final MessageFormat productFormat = new MessageFormat(config.getString("product.data.format"));

//lav 13

    private final Path reportFolder = Path.of(config.getString("reports.folder"));
    private final Path dataFolder = Path.of(config.getString("data.folder"));
    private final Path tempFolder = Path.of(config.getString("temp.folder"));


//lab 14
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock writeLock = lock.writeLock();
    private final Lock readLock = lock.readLock();
    private static final ProductManager pm = new ProductManager();
    public static ProductManager getInstance(){
        return pm;
    }
    private ProductManager(){
//        changeLocale(languageTag);
//        lab 13
        loadAllData();
    }
//    lab 14
//public ProductManager(Locale locale) {
//    this(locale.toLanguageTag());
//}
//    public void changeLocale(String languageTag){
//        formatter = formatters.getOrDefault(languageTag, formatters .get("en-GB"));
//    }

    public static Set<String> getSupportedLocals(){
        return formatters.keySet();
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        Product product = null;
        try {
            writeLock.lock();
            product = new Food(id, name, price, rating, bestBefore);
            products.putIfAbsent(product, new ArrayList<>());
        } catch (Exception e) {
            logger.log(Level.INFO, "Error adding product " + e);
            e.printStackTrace();
        }finally {
            writeLock.unlock();
        }
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating){
        Product product = null;
        try{
            writeLock.lock();
            product = new Drink(id, name, price, rating);
            products.putIfAbsent(product, new ArrayList<>());
        } catch (Exception e){
            logger.log(Level.INFO, "Error adding product " + e);
            e.printStackTrace();
        }finally {
            writeLock.unlock();
        }

        return product;
    }

//    lab 13
    public List<Review> loadReviews(Product product){
        List<Review> reviews = null;
        Path file = dataFolder.resolve(MessageFormat.format(config.getString("reviews.data.file"), product.getId()));
        if (Files.notExists(file)){
            reviews = new ArrayList<>();
        } else{
            try {
                reviews = Files.lines(file, Charset.forName("UTF-8"))
                        .map(text -> parseReview_io(text))
                        .filter(review -> review != null)
                        .collect(Collectors.toList());
            } catch (IOException ex) {
                ex.printStackTrace();
                logger.log(Level.SEVERE, "Error loading reviews + ", ex.getMessage());
            }
        }
        return reviews;
    }

    //    lab 13
    private Product loadProduct(Path file) {
        Product product = null;
        try {
            product = parseProduct(Files.lines(dataFolder.resolve(file), Charset.forName("UTF-8")).findFirst().orElseThrow());
//            catch all exceptions
        } catch (Exception ex) {
//        } catch (IOException ex) {
            ex.printStackTrace();
            logger.log(Level.SEVERE, "Error loading Product + ", ex.getMessage());
        }
        return product;
    }

    private void loadAllData(){
        try {
            products = Files.list(dataFolder)
                    .filter(file -> file.getFileName().toString().startsWith("product"))
                    .map(file -> loadProduct(file))
                    .filter(product -> product != null)
                    .collect(Collectors.toMap(product -> product,
                            product -> loadReviews(product)));
        } catch (IOException ex) {
            ex.printStackTrace();
            logger.log(Level.SEVERE, "Error loading all data + ", ex.getMessage());
        }
    }

    private Product reviewProduct(Product product, Rating rating, String comments){

        List <Review> reviews = products.get(product);
        products.remove(product, reviews);
        reviews.add(new Review(rating, comments));

//        int sum = 0;
//        for (Review review: reviews){
//            sum += review.getRating().ordinal();
//        }
//        product = product.applyRating(Rateable.convert(Math.round((float) sum / reviews.size())));

        product = product.applyRating(
                Rateable.convert(
                        (int)Math.round(
                                reviews.stream()
                                        .mapToInt(r -> r.getRating().ordinal())
                                        .average()
                                        .orElse(0)
                        )
                )
        );


        products.put(product, reviews);
        return product;
    }

    //lab 12 add throws exception name as checked exception
    public Product findProduct(int id) throws ProductManagerException {
        try {
            readLock.lock();
//        lab 12: use orElseThrow
            return products.keySet()
                    .stream()
                    .filter(p -> p.getId() == id)
                    .findFirst()
                    .orElseThrow(() -> new ProductManagerException(("Produce with id " + id + " not found")));
        } finally {
            readLock.unlock();
        }
    }



//lab 12
    public Product reviewProduct(int id, Rating rating, String comments) {
        try {
            writeLock.lock();
            return reviewProduct(findProduct(id), rating, comments);
        } catch (ProductManagerException ex) {
            logger.log(Level.INFO, ex.getMessage());
//            logger.log(Level.SEVERE, null, ex);
        }finally {
            writeLock.unlock();
        }
//        lab 12 add return when surround original return by try catch
        return null;
    }

//    lab 14
public void printProducts(Predicate<Product> filter, Comparator<Product> sorter, String languageTag) {
    try {
        readLock.lock();
        ResourceFormatter formatter = formatters.getOrDefault(languageTag, formatters.get("en-GB"));
//        List<Product> productList = new ArrayList<>(products.keySet());
//        productList.sort(sorter);
        StringBuilder txt = new StringBuilder();
        products.keySet()
                .stream()
                .sorted(sorter)
                .filter(filter)
                .forEach(p -> txt.append(formatter.formatProduct(p) + "\n"));
//        for(Product product: productList){
//            txt.append(formatter.formatProduct(product));
//            txt.append("\n");
//        }

        System.out.println(txt);
    } finally {
        readLock.unlock();
    }
}


//    lab 12
    public void parseReview(String text){
        try {
            Object[] values = reviewFormat.parse(text);
            reviewProduct(Integer.parseInt((String)values[0]), Rateable.convert(Integer.parseInt((String)values[1])), (String)values[2]);
//        } catch (ParseException ex) {
        } catch (ParseException | NumberFormatException ex) {
            logger.log(Level.WARNING, "Error parsing review " + text, ex);
            logger.log(Level.WARNING, "Error parsing review " + text);
        }
    }

    //lab 13
    //lab 13
    public Review parseReview_io(String text){
        Review review = null;
        try {
            Object[] values = reviewFormat.parse(text);
            review = new Review( Rateable.convert(Integer.parseInt((String)values[0])), (String)values[1]);
//        } catch (ParseException ex) {
        } catch (ParseException | NumberFormatException ex) {
            logger.log(Level.WARNING, "Error parsing review " + text, ex);
            logger.log(Level.WARNING, "Error parsing review " + text);
        }
        return review;
    }
//    lab 12
//    public void parseProduct(String text){
//        try {
//            Object[] values = productFormat.parse(text);
//            int id = Integer.parseInt((String)values[1]);
//            String name = (String)values[2];
//            BigDecimal price = BigDecimal.valueOf(Double.parseDouble((String)values[3]));
//            Rating rating = Rateable.convert((Integer.parseInt((String)values[4])));
//
//            switch ((String) values[0]) {
//                case "D":
//                    createProduct(id, name, price, rating);
//                    break;
//                case "F":
//                    LocalDate bestBefore = LocalDate.parse((String)values[5]);
//                    createProduct(id, name, price, rating, bestBefore);
////                    no break as it's the last case
//            }
//        } catch (ParseException | NumberFormatException | DateTimeParseException ex) {
//            logger.log(Level.WARNING, "Error parsing product " + text, ex);
//        }
//    }

//    lab 13
    public Product parseProduct(String text){
        Product product = null;
        try {
            Object[] values = productFormat.parse(text);
            int id = Integer.parseInt((String)values[1]);
            String name = (String)values[2];
            BigDecimal price = BigDecimal.valueOf(Double.parseDouble((String)values[3]));
            Rating rating = Rateable.convert((Integer.parseInt((String)values[4])));

            switch ((String) values[0]) {
                case "D":
                    product = new Drink(id, name, price, rating);
                    break;
                case "F":
                    LocalDate bestBefore = LocalDate.parse((String)values[5]);
                    product = new Food(id, name, price, rating, bestBefore);
//                    no break as it's the last case
            }
        } catch (ParseException | NumberFormatException | DateTimeParseException ex) {
            logger.log(Level.WARNING, "Error parsing product " + text, ex);
        }
        return product;
    }

    //    lab 12
    public void printProductReport(int id, String languageTag, String client){
        try {
            readLock.lock();
            printProductReport(findProduct(id), languageTag, client);
        } catch (ProductManagerException ex) {
            logger.log(Level.INFO, ex.getMessage());
        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "Can not find file " + e);
            e.printStackTrace();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "IO Exception " + e);
            e.printStackTrace();
        }finally {
            readLock.unlock();
        }
    }

//    public void printProductReportConsole(int id){
//        Product product = null;
//        try {
//            product = findProduct(id);
//            List<Review> reviews = products.get(product);
//            StringBuilder txt = new StringBuilder();
//            txt.append(formatter.formatProduct(product));
//            txt.append("\n");
//            Collections.sort(reviews);
//
//            if (reviews.isEmpty()) {
//                txt.append(formatter.getText("no.review"));
//                txt.append("\n");
//            } else {
//                txt.append(reviews.stream()
//                        .map(r -> formatter.formatReview(r) + "\n")
//                        .collect(Collectors.joining()));
//            }
//            System.out.println(txt);
//        } catch (ProductManagerException e) {
//            e.printStackTrace();
//        }
//
//    }

    private void printProductReport(Product product, String languageTag, String client) throws IOException, FileNotFoundException {
        ResourceFormatter formatter = formatters.getOrDefault(languageTag, formatters.get("en-GB"));
        List<Review> reviews = products.get(product);

//        lab 13
        Path productFile = reportFolder.resolve(MessageFormat.format(config.getString("report.file"), product.getId(), client));

        // Note directory has to be created before
        try (PrintWriter out = new PrintWriter(new OutputStreamWriter(Files.newOutputStream(productFile, StandardOpenOption.CREATE), "UTF-8"))) {
            out.append(formatter.formatProduct(product) + System.lineSeparator());
            if (reviews.isEmpty()) {
                out.append(formatter.getText("no.review") + System.lineSeparator());
                System.out.println("no review!!!");
            } else {
                out.append(reviews.stream()
                        .map(r -> formatter.formatReview(r) + System.lineSeparator())
                        .collect(Collectors.joining()));
            }
        }
    }


//    important: new inner class
    private static class ResourceFormatter{
        private Locale locale;
        private ResourceBundle resources;
        private DateTimeFormatter dateFormat;
        private NumberFormat moneyFormat;

        public ResourceFormatter(Locale locale){
            this.locale = locale;
            resources = ResourceBundle.getBundle("com.frankhe.java.ocp.lab15_module.data.resource", locale);
            dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
        }


        public String formatProduct(Product product){
            return MessageFormat.format(resources.getString("product"),
                    product.getName(),
                    moneyFormat.format(product.getPrice()),
                    product.getRating().getStars(),
                    dateFormat.format(product.getBestBefore()));
        }


        public String formatReview(Review review){
            return MessageFormat.format(resources.getString("review"),
                    review.getRating().getStars(),
                    review.getComments());
        }

        public String getText(String key){
            return resources.getString(key);
        }
    }
//lab 14

    public Map<String, String> getDiscounts(String languageTag) {
        try {
            readLock.lock();
            ResourceFormatter formatter = formatters.getOrDefault(languageTag, formatters.get("en-GB"));
            return products.keySet()
                    .stream()
                    .collect(
                            Collectors.groupingBy(
                                    product -> product.getRating().getStars(),
                                    Collectors.collectingAndThen(
                                            Collectors.summingDouble(
                                                    product -> product.getDiscountRate().doubleValue()),
                                            discount -> formatter.moneyFormat.format(discount)
                                    )
                            )
                    );
        }finally {
            readLock.unlock();
        }

    }


    //    lab 13 Serialazable
    public void dumpData() {

        try {
            if (Files.notExists(tempFolder)) {
                Files.createDirectories(tempFolder);
            }

            Path tempFile = tempFolder.resolve((MessageFormat.format(config.getString("temp.file"), 1)));
//            Path tempFile = tempFolder.resolve((MessageFormat.format(config.getString("temp.file"), Instant.now())));
            try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(tempFile, StandardOpenOption.CREATE))) {
                out.writeObject(products);
                products = new HashMap<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Error dumping data " + e);
        }
    }

//    annotation to remove the waring
//    @SuppressWarnings("unchecked")
    public void restoreDate(){
        try {
            Path tempFile = Files.list(tempFolder)
                    .filter(path -> path.getFileName().toString().endsWith("tmp"))
                    .findFirst().orElseThrow();
            try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(tempFile, StandardOpenOption.DELETE_ON_CLOSE))){
                products = (HashMap)in.readObject();
            }
//        wider exception than IO as deserialization could have classnotfound if code changes
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Error restoring data "+ e.getMessage(), e);
        }
    }
}

