package com.frankhe.java.ocp.lab4_class_design;

import com.frankhe.java.ocp.lab4_class_design.data.Product;

import java.math.BigDecimal;
//Important how to build a javadoc
/**
 * {@code Product} class for demo and lab
 * @author Frank
 * <br>
 *     word
 * </br>
 * @version 1.0
 * {@link com.frankhe.java.ocp.lab4_class_design.data.Product.DISCOUNT_RATE discount rate}
 */
public class Shop {
    public static void main(String [] args){
        Product p1 = new Product();

        p1.setId(101);
        p1.setName("Tea");
        //important, if this value is not set, then this.price will throw NullPointer Exception, this is because of print below, it calls getDiscountRate method
        //If code does something with Id or name, then same nullpoiterException
        p1.setPrice(BigDecimal.valueOf(1.99));



        System.out.println(p1.getName() + ' ' + p1.getId() + ' ' + p1.getPrice() + ' ' + p1.getDiscountRate());

    }
}
