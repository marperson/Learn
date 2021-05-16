package com.frankhe.java.ocp.lab15_module.data;


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

import static com.frankhe.java.ocp.lab15_module.data.Rating.NOT_RATED;

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

public abstract class Product implements Rateable<Product>, Serializable {
//public abstract class Product implements Rateable{
    private int id;
    private String name;
    private BigDecimal price;   //important, default value is Null
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    // important: if i comment default contructor out, code doesn't compile
    //    remove public keyword, then only accessable from same packge, then Shop can't access, use productManager
    Product() {
//    public Product() {
        this(0, "no name", BigDecimal.ZERO);    //imporatant default the value to avoid get BiogDecimal nullpointer exception
    }

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    Product(int id, String name, BigDecimal price) {
        this(id, name, price, NOT_RATED);           // imporatant, can import Rating to avoid Rating initial, and use "this" to avoid write redundant code
//        this(id, name, price, Rating.NOT_RATED);
//        this.id = id;
//        this.name = name;
//        this.price = price;
    }


    private Rating rating;

    public int getId() {
        return id;
    }

    public BigDecimal getDiscountRate() {
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }


    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public Rating getRating() {
        return rating;
    }
    //Important, no method body, even the {}
//    public abstract Product applyRating(Rating newRating);
//    public Product applyRating(Rating newRating){
//        return new Product(id, name, price, newRating);
//    }


    //important, override toString and use it in the main
    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", bestBefore=" + getBestBefore();

    }

    //important, rewrite equal method by using intellij generator


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Product){          // important ,Food and Drink are different but same reference type
//        if (o != null && getClass() ==o.getClass()){
            final Product other = (Product) o;
            return this.id == other.id ;//&& Objects.equals(this.name, other.name);
//            return this.id == other.id && Objects.equals(this.name, other.name);
        }
        return false;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return id == product.id && name.equals(product.name) && price.equals(product.price) && rating == product.rating;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, price, rating);
//    }


    public LocalDate getBestBefore(){
//        bestBefore doesn't exist in Product
//        return bestBefore;
        return LocalDate.now();
    }
}
