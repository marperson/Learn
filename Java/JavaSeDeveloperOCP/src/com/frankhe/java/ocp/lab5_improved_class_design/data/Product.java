package com.frankhe.java.ocp.lab5_improved_class_design.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.frankhe.java.ocp.lab5_improved_class_design.data.Rating.NOT_RATED;

/**
 * {@code Product} class for demo and lab
 * @author Frank
 * <br>
 *     word
 * </br>
 * @version 1.0
 * @version 1.0
 *
 */

public class Product {
    private int id;
    private String name;
    private BigDecimal price;   //important, default value is Null
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    private Rating rating;

    public int getId() {
        return id;
    }
// imporant: Disable all settes to make object immutable,
/*


    public void setId(final int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(final BigDecimal price) {
//        price = BigDecimal.ONE;                   //important, can not assign final again.
        this.price = price;
    }
    */
    /**
     * Calculate discount based on a product price and
     * @return a {@link BigDecimal BigDecimal} value of the discount
     */
    public BigDecimal getDiscountRate() {
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }



    public Rating getRating() {
        return rating;
    }


    public Product() {
        this(0, "no name", BigDecimal.ZERO);    //imporatant default the value to avoid get BiogDecimal nullpointer exception
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);           // imporatant, can import Rating to avoid Rating initial, and use "this" to avoid write redundant code
//        this(id, name, price, Rating.NOT_RATED);
//        this.id = id;
//        this.name = name;
//        this.price = price;
    }

    public Product applyRating(Rating newRating){
        return new Product(id, name, price, newRating);
    }





}
