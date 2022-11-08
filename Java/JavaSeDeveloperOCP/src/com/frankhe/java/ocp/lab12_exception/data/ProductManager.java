package com.frankhe.java.ocp.lab12_exception.data;


import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

// important: Factory class: class which creates a lot of instance
public class ProductManager {

    private Map<Product, List<Review>> products = new HashMap<>();
    private ResourceFormatter formatter;
    private static Map<String, ResourceFormatter> formatters = Map.of(
            "en-GB", new ResourceFormatter((Locale.UK)),
            "en-US", new ResourceFormatter(Locale.US),
            "ru-RU", new ResourceFormatter(new Locale("ru", "RU"))
    );
//lab 12
    private static final Logger logger = Logger.getLogger(ProductManager.class.getName());
//    lab 12 ,method 1: use resource bundle, this will come with build, method 2 use properties file, this will not come with build as it's considered as properties
    ResourceBundle config = ResourceBundle.getBundle("com.frankhe.java.ocp.lab12_exception.data.config");
    private MessageFormat reviewFormat = new MessageFormat(config.getString("review.data.format"));
    private MessageFormat productFormat = new MessageFormat(config.getString("product.data.format"));



    public ProductManager(Locale locale) {
        this(locale.toLanguageTag());
    }

    public ProductManager(String languageTag){
        changeLocale(languageTag);
    }

    public void changeLocale(String languageTag){
        formatter = formatters.getOrDefault(languageTag, formatters .get("en-GB"));
    }

    public static Set<String> getSupportedLocals(){
        return formatters.keySet();
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        Product product = new Food (id, name, price,rating, bestBefore);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating){
        Product product = new Drink(id, name, price, rating);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }



    public Product reviewProduct(Product product, Rating rating, String comments){

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
//        Product result = null;

//        for(Product product:products.keySet()){
//            if (product.getId() ==id){
//                result = product;
//                break;
//            }
//        }
//        return result;


//        lab 12: orElseGet returns null
//        return products.keySet()
//                .stream()
//                .filter(p -> p.getId() == id)
//                .findFirst()
//                .orElseGet(() -> null);


//        lab 12: to expose exception, use get instead of orElseGet null
//        return products.keySet()
//                .stream()
//                .filter(p -> p.getId() == id)
//                .findFirst()
//                .get();

//        lab 12: use orElseThrow
        return products.keySet()
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ProductManagerException(("Produce with id " + id + " not found")));
    }


//    lab 12
    public void printProductReport(int id){
        try {
            printProductReport(findProduct(id));
        } catch (ProductManagerException ex) {
            logger.log(Level.INFO, ex.getMessage());
        }
    }
//lab 12
    public Product reviewProduct(int id, Rating rating, String comments) {
        try {
            return reviewProduct(findProduct(id), rating, comments);
        } catch (ProductManagerException ex) {
            logger.log(Level.INFO, ex.getMessage());
//            logger.log(Level.SEVERE, null, ex);
        }
//        lab 12 add return when surround original return by try catch
        return null;
    }

    public void printProducts(Predicate<Product> filter, Comparator<Product> sorter){
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
//    lab 12
    public void parseProduct(String text){
        try {
            Object[] values = productFormat.parse(text);
            int id = Integer.parseInt((String)values[1]);
            String name = (String)values[2];
            BigDecimal price = BigDecimal.valueOf(Double.parseDouble((String)values[3]));
            Rating rating = Rateable.convert((Integer.parseInt((String)values[4])));

            switch ((String) values[0]) {
                case "D":
                    createProduct(id, name, price, rating);
                    break;
                case "F":
                    LocalDate bestBefore = LocalDate.parse((String)values[5]);
                    createProduct(id, name, price, rating, bestBefore);
//                    no break as it's the last case
            }
        } catch (ParseException | NumberFormatException | DateTimeParseException ex) {
            logger.log(Level.WARNING, "Error parsing product " + text, ex);
        }

    }

    public void printProductReport(Product product){
        List<Review> reviews = products.get(product);
        StringBuilder txt = new StringBuilder();
        txt.append(formatter.formatProduct(product));
        txt.append("\n");
        Collections.sort(reviews);

        if (reviews.isEmpty()) {
            txt.append(formatter.getText("no.review"));
            txt.append("\n");
        } else {
            txt.append(reviews.stream()
                    .map(r -> formatter.formatReview(r) + "\n")
                    .collect(Collectors.joining()));
        }

//        for (Review review: reviews) {
//            if (review == null) {
//                break;
//            }
//            txt.append(formatter.formatReview(review));
//                    txt.append("\n");
//        }
//
//        if (reviews.isEmpty()){
//            txt.append(formatter.getText("no.review"));
//            txt.append("\n");
//        }


        System.out.println(txt);
    }
//    important: new inner class
    private static class ResourceFormatter{
        private Locale locale;
        private ResourceBundle resources;
        private DateTimeFormatter dateFormat;
        private NumberFormat moneyFormat;

        public ResourceFormatter(Locale locale){
            this.locale = locale;
            resources = ResourceBundle.getBundle("com.frankhe.java.ocp.lab12_exception.data.resource", locale);
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


    public Map<String, String> getDiscounts() {

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
    }
}
