package com.frankhe.java.ocp.lab4_class_design.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * {@code Product} class for demo and lab
 * @author Frank
 * <br>
 *     word
 * </br>
 * @version 1.0
 * {@link DISCOUNT_RATE discount rate}
 *
 */

public class Product {
    private int id;
    private String name;
    private BigDecimal price;   //important, default value is Null
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }
    /**
     * Calculate discount based on a product price and
     * {@link DISCOUNT_RATE discount_rate}
     * @param price
     * @return a {@link java.math.BigDecimal BigDecimal} value of the discount
     */
    public BigDecimal getDiscountRate() {
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }

    /**
     * Set product price
     * @param price
     */
    public void setPrice(final BigDecimal price) {
//        price = BigDecimal.ONE;                   //important, can not assign final again.
        this.price = price;
    }

}
