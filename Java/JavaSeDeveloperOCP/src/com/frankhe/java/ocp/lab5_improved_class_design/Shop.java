package com.frankhe.java.ocp.lab5_improved_class_design;

import com.frankhe.java.ocp.lab5_improved_class_design.data.Product;
import com.frankhe.java.ocp.lab5_improved_class_design.data.Rating;

import java.math.BigDecimal;
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
        Product p1 = new Product(101, "Tea", BigDecimal.valueOf(4), Rating.NOT_RATED);

//        p1.setId(101);
//        p1.setName("Tea");
        //important, if this value is not set, then this.price will throw NullPointer Exception, this is because of print below, it calls getDiscountRate method
        //If code does something with Id or name, then same nullpoiterException
//        p1.setPrice(BigDecimal.valueOf(1.99));

//        System.out.println(p1.getName() + ' ' + p1.getId() + ' ' + p1.getPrice() + ' ' + p1.getDiscountRate(), p1.getRating().getStars());

        Product p2 = new Product(102, "coffee", BigDecimal.valueOf(45), Rating.ONE_STAR);
//        System.out.println(p2.getName() + ' ' + p2.getId() + ' ' + p2.getPrice() + ' ' + p2.getDiscountRate(), p2.getRating().getStars());

        Product p3 = new Product();
//        System.out.println(p3.getName() + ' ' + p3.getId() + ' ' + p3.getPrice() + ' ' + p3.getDiscountRate(), p3.getRating().getStars());

        Product p4 = p2.applyRating(Rating.TWO_STAR);
//        p2 = p2.applyRating(Rating.TWO_STAR); //impar





    }
}
