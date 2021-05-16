package com.frankhe.java.ocp.lab11_stream;
import com.frankhe.java.ocp.lab11_stream.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Locale;
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
        ProductManager pm = new ProductManager("en_GB");


//        ProductManager pm = new ProductManager(Locale.UK);
//        ProductManager pm = new ProductManager(Locale.CHINA);
//        ProductManager pm = new ProductManager(Locale.US);

//        Drink
//        Product p1= new Product (101, "Tea", BigDecimal.valueOf(0.3));
        Product p1 = pm.createProduct (101, "Tea", BigDecimal.valueOf(0.3), Rating.NOT_RATED);
//        pm.printProductReport(101);
//        pm.printProductReport();

        p1 = pm.reviewProduct(101, Rating.FOUR_STAR, "Nice cup of tea!");
        p1 = pm.reviewProduct(101, Rating.ONE_STAR, "Nice cup of tea - one star!");
        p1 = pm.reviewProduct(101, Rating.TWO_STAR, "Nice cup of tea - two star!");
//        pm.printProductReport(101);
//        pm.printProductReport();

        pm.changeLocale("ru-RU");
        Product p2= pm.createProduct (102, "Coffee", BigDecimal.valueOf(1), Rating.NOT_RATED);
//        pm.printProductReport(102);
        p2 = pm.reviewProduct(102, Rating.ONE_STAR, "Nice coffee!");
        p2 = pm.reviewProduct(102, Rating.ONE_STAR, "Nice coffee- one star!");
        p2 = pm.reviewProduct(102, Rating.NOT_RATED, "Bad coffee - no stars!");
//        pm.printProductReport(102);


        Product p3= pm.createProduct (103, "Cake", BigDecimal.valueOf(2), Rating.NOT_RATED);
//        pm.printProductReport(103);
        p3 = pm.reviewProduct(103, Rating.FIVE_STAR, "Nice Cake!");
        p3 = pm.reviewProduct(103, Rating.THREE_STAR, "Nice cake - Three stars!");
        p3 = pm.reviewProduct(103, Rating.TWO_STAR, "Nice cup of tea - two star!");
//        pm.printProductReport(103);
//        Product p1= new Drink (101, "Tea", BigDecimal.valueOf(0.3), Rating.TWO_STAR);


        //important
        Comparator<Product> ratingSorter = (p_1, p_2) -> p_2.getRating().ordinal() - p_1.getRating().ordinal();
        pm.printProducts(p -> p.getPrice().floatValue() < 2 , (p_1, p_2) -> p_2.getRating().ordinal() - p_1.getRating().ordinal());
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

        pm.getDiscounts().forEach(
                (rating, discount) -> System.out.println(rating + "\t"+ discount)
        );






    }
}
