package com.frankhe.java.ocp.lab14_multithreading;
import com.frankhe.java.ocp.lab14_multithreading.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Important how to build a javadoc

/**
 * {@code Product} class for demo and lab
 * @author Frank
 * <br>
 *     word
 * </br>
 * @version 1.0
 */
public class Shop {
    public static void main(String [] args){
        // important, in the future, if new type other than Food or Drink exist, no need to modify this class if we use product manager
//        product manager use method overload to create new Food or Drink
//        ProductManager pm = new ProductManager(Locale.CANADA_FRENCH);
//        lab 14
        ProductManager pm = ProductManager.getInstance();
        AtomicInteger clientCount = new AtomicInteger();
        Callable<String> client = () -> {
            String clientId = "Client " + clientCount.incrementAndGet();
            String threadName = Thread.currentThread().getName();
            int productId = ThreadLocalRandom.current().nextInt(63) + 101;
            String languageTag = ProductManager.getSupportedLocals()
                    .stream()
                    .skip(ThreadLocalRandom.current().nextInt(3))
                    .findFirst().get();
            StringBuilder log = new StringBuilder();
            log.append(clientId + threadName + "\n-\tstart of log\t-\n");
            log.append(pm.getDiscounts(languageTag)
                    .entrySet()
                    .stream()
                    .map(entry -> entry.getKey() + "\t" + entry.getValue())
                    .collect(Collectors.joining("\n")));

            Product product = pm.reviewProduct(productId, Rating.FOUR_STAR, "Yet another review!");
            log.append((product != null) ? "\nProduct " + productId + " reviewed\n" : "\nProduct " + productId + " not reviewed\n");
            log.append(clientId + " generated report for " + productId + " product");


            log.append("\n-\tend of log\t-\n");
            return log.toString();
        };

        List<Callable<String>> clients = Stream.generate(() -> client).limit(5).collect(Collectors.toList());
        ExecutorService executorService = Executors.newFixedThreadPool(2);  //less than thread number
        try {
            List<Future<String>> results = executorService.invokeAll(clients);
            executorService.shutdown();
            results.stream().forEach(result -> {
                try {
                    System.out.println(result.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                    Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, e);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
            Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, "Error invoking clients " + e);
        }

//        ProductManager pm = new ProductManager("en_GB");


//        ProductManager pm = new ProductManager(Locale.UK);
//        ProductManager pm = new ProductManager(Locale.CHINA);
//        ProductManager pm = new ProductManager(Locale.US);

//        Drink
//        Product p1= new Product (101, "Tea", BigDecimal.valueOf(0.3));
        Product p1 = pm.createProduct (101, "Tea", BigDecimal.valueOf(0.3), Rating.NOT_RATED);
        // important, exception because product is null and findProduct(int id) returns null

//        lab 12: first exception
//        pm.printProductReport(1);
//        pm.printProductReportConsole(101);

//        pm.printProductReport();

//        lab 12: wrong product id
//        p1 = pm.reviewProduct(1, Rating.FOUR_STAR, "Nice cup of tea!");
//        p1 = pm.reviewProduct(101, Rating.FOUR_STAR, "Nice cup of tea!");
//        p1 = pm.reviewProduct(101, Rating.ONE_STAR, "Nice cup of tea - one star!");
//        p1 = pm.reviewProduct(101, Rating.TWO_STAR, "Nice cup of tea - two star!");

//        lab 12
//        pm.parseReview("101,4,new review");
//        pm.parseReview("1,4,another new review");
//        pm.parseReview("1,Xanother new review");
//        pm.parseReview("1,X,another new review");
//        pm.printProductReportConsole(101);
//        pm.printProductReport();

//        pm.changeLocale("ru-RU");
        Product p2= pm.createProduct (102, "Coffee", BigDecimal.valueOf(1), Rating.NOT_RATED);
//        p2 = pm.reviewProduct(102, Rating.ONE_STAR, "Nice coffee!");
//        p2 = pm.reviewProduct(102, Rating.ONE_STAR, "Nice coffee- one star!");
//        p2 = pm.reviewProduct(102, Rating.NOT_RATED, "Bad coffee - no stars!");
//        lab 12
        pm.parseReview("102,1,Nice coffee!");
        pm.parseReview("102,2,Nice coffee- one star!");
        pm.parseReview("102,0,Bad coffee - no stars!");
//        pm.printProductReport(102, "en-GB");
//        pm.printProductReportConsole(102);


        Product p3= pm.createProduct (103, "Cake", BigDecimal.valueOf(2), Rating.NOT_RATED);
//        lab 12
        pm.parseReview("103,5,Nice Cake!");
        pm.parseReview("103,3,Nice cake - Three stars!");
        pm.parseReview("103,2,Nice cup of tea - two star!");
//        pm.printProductReportConsole(103);

//        Product p1= new Drink (101, "Tea", BigDecimal.valueOf(0.3), Rating.TWO_STAR);

//        lab 12
//        pm.parseProduct("D,110,Black tea,1.99,0,2021-12-31");
        LocalDate today = LocalDate.now();
        pm.createProduct(110,"Black tea",BigDecimal.valueOf(1.99),Rating.NOT_RATED, today);
//        pm.parseProduct("F,111,Black cake,1.99,0,2021-12-31");
//        pm.parseProduct("F,112,Black tea,1.99,0, 2021-12-40");
//        pm.printProductReport(110, "en-GB");
//        pm.printProductReport(111);
//        pm.printProductReport(112);
        //important
//        Comparator<Product> ratingSorter = (p_1, p_2) -> p_2.getRating().ordinal() - p_1.getRating().ordinal();
//        pm.printProducts(p -> p.getPrice().floatValue() < 2 , (p_1, p_2) -> p_2.getRating().ordinal() - p_1.getRating().ordinal());
//        or
//        pm.printProducts(ratingSorter);

//        System.out.println("---------");
//        Comparator<Product> priceSorter = (p_1, p_2) -> p_2.getPrice().compareTo(p_1.getPrice());
//        pm.printProducts((p_1, p_2) -> p_2.getPrice().compareTo(p_1.getPrice()));
//        or
//        pm.printProducts(priceSorter);
//        pm.printProducts(priceSorter.thenComparing(ratingSorter).reversed());


       /*
        System.out.println(p1.getName() + " " + p1.getId() + " " + p1.getPrice());

        Product p2 = pm.createProduct(102, "coffee", BigDecimal.valueOf(0.5), Rating.ONE_STAR);
//        Product p2 = new Drink(102, "coffee", BigDecimal.valueOf(0.5), Rating.ONE_STAR);
        System.out.println(p2.getName() + " " + p2.getId() + " " + p2.getPrice() + " " + p2.getDiscountRate());
        System.out.println(p2.getRating().getStars().toString());



//        Food
        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now().plusDays(2));
        System.out.println(p3.getName() + ' ' + p3.getId() + ' ' + p3.getPrice() + ' ' + p3.getDiscountRate());
        System.out.println(p3.getRating().getStars());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Object p4 =  pm.createProduct (104, "Cookie", BigDecimal.valueOf(0.3), Rating.TWO_STAR, LocalDate.now().plusDays(10));
        System.out.println(p4);

        Product p5 = pm.createProduct(105, "Choclate", BigDecimal.valueOf(0.5), Rating.ONE_STAR);
        Product p6 = pm.createProduct(105, "Choclate", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now().plusDays(2));
//        Product p6 = new Food(105, "Choclate", BigDecimal.valueOf(3.99), Rating.TWO_STAR, LocalDate.now().plusDays(2));
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p5.equals(p6));      //important, they are different objects reference, and different class name, one is Food and the other is Drink

        Product p7 = p6;
        System.out.println(p7.equals(p6));      //important, they are same objects reference

        Product p8 = p1.applyRating(Rating.ONE_STAR);
        Product p9 = p3.applyRating(Rating.NOT_RATED);
        System.out.println(p8);
        System.out.println(p9);

        // important: sibling class
//        if copy getbestBefore in Product, but it doesn't have bestBefore variable
//        we can put a date in the variable instead
//        p3.getbestbefore()

        if (p3 instanceof Food){
            LocalDate bestBefore = ((Food)p3).getBestBefore();
            System.out.println(bestBefore);
        }


        System.out.println(p1.getBestBefore());
        System.out.println(p3.getBestBefore());

    */

//        pm.getDiscounts().forEach(
//                (rating, discount) -> System.out.println(rating + "\t"+ discount)
//        );


        pm.dumpData();
        pm.restoreDate();
    }
}
