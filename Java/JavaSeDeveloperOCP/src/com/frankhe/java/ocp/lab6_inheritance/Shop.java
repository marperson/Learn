package com.frankhe.java.ocp.lab6_inheritance;

import com.frankhe.java.ocp.lab6_inheritance.data.*;

import java.math.BigDecimal;
import java.time.LocalDate;
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
        ProductManager pm = new ProductManager();

//        Drink
//        Product p1= new Product (101, "Tea", BigDecimal.valueOf(0.3));
        Product p1= pm.createProduct (101, "Tea", BigDecimal.valueOf(0.3), Rating.TWO_STAR);
//        Product p1= new Drink (101, "Tea", BigDecimal.valueOf(0.3), Rating.TWO_STAR);
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








    }
}
