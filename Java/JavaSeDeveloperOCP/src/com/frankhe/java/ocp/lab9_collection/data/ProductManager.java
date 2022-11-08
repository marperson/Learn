package com.frankhe.java.ocp.lab9_collection.data;


import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

// important: Factory class: class which creates a lot of instance
public class ProductManager {

    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;


    private Map<Product, List<Review>> products = new HashMap<>();

//    private Product product;
    // Change single review to an array
//    private Review[] reviews = new Review[5];
    //    private Review review;

    public ProductManager(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("com.frankhe.java.ocp.lab9_collection.data.resource", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        Product product = new Food (id, name, price,rating, bestBefore);

        // imporatant, putIfAbsent method , we don't want to update existing one, so we put this as security
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating){
        Product product = new Drink(id, name, price, rating);
        products.putIfAbsent(product, new ArrayList<>());
        return product;
    }


    public Product reviewProduct(int id, Rating rating, String comments){
        return reviewProduct(findProduct(id), rating, comments);
    }

    public Product reviewProduct(Product product, Rating rating, String comments){


        //important
//        review = new Review(rating, comments);
//        this.product = product.applyRating(rating);
//        if (reviews[reviews.length - 1] != null){
//            reviews = Arrays.copyOf(reviews, reviews.length + 5);
//        }

        List <Review> reviews = products.get(product);
        //remove product and recreate it
        products.remove(product, reviews);
        reviews.add(new Review(rating, comments));

        int sum = 0;
        for (Review review: reviews){
            sum += review.getRating().ordinal();
        }

//        int sum = 0 , i = 0;
//        boolean reviewed = false;
//        while (i < reviews.length && !reviewed){
//            if (reviews[i] == null){
//                reviews[i] = new Review(rating, comments);
//                reviewed = true;
//            }
//            sum += reviews[i].getRating().ordinal();
//            i++;
//        }

        product = product.applyRating(Rateable.convert(Math.round((float) sum / reviews.size())));
        products.put(product, reviews);
//        this.product = product.applyRating(Rateable.convert(Math.round((float) sum / i)));

        return product;
    }


    public Product findProduct(int id){
        Product result = null;

        for(Product product:products.keySet()){
            if (product.getId() ==id){
                result = product;
                break;
            }
        }
            return result;
    }

    public void printProductReport(int id){
        printProductReport(findProduct(id));
    }

    public void printProductReport(Product product){
        List<Review> reviews = products.get(product);
        StringBuilder txt = new StringBuilder();

        txt.append(MessageFormat.format(resources.getString("product"),
                product.getName(),
                moneyFormat.format(product.getPrice()),
                product.getRating().getStars(),
                dateFormat.format(product.getBestBefore())));

        txt.append("\n");
//        if (review != null) {
//            txt.append(MessageFormat.format(resources.getString("review"),
//                    review.getRating().getStars(),
//                    review.getComments()));
//        } else {
//            txt.append(resources.getString("no.review"));
//        }


        // imporatant
        Collections.sort(reviews);
        for (Review review: reviews) {
            if (review == null) {
                break;
            }
            txt.append(MessageFormat.format(resources.getString("review"),
                    review.getRating().getStars(),
                    review.getComments()));
                    txt.append("\n");
        }

        if (reviews.isEmpty()){
//        if (reviews[0] == null){
            txt.append(resources.getString("no.review"));
            txt.append("\n");
        }

        System.out.println(txt);


    }
}
