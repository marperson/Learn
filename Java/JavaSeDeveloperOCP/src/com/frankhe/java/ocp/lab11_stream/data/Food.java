package com.frankhe.java.ocp.lab11_stream.data;


import com.frankhe.java.ocp.lab11_stream.data.Product;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product {
    private LocalDate bestBefore;

    //    remove public keyword, then only accessable from same packge, then Shop can't access, use productManager
    Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
//    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    @Override
    public String toString() {
//        return "Food{" +
//                "bestBefore=" + bestBefore +
//                '}';
        return super.toString() + ", " + bestBefore;
    }

    @Override
    public BigDecimal getDiscountRate() {
//        return super.getDiscountRate();
        return ( bestBefore.isEqual(LocalDate.now()) ? super.getDiscountRate() : BigDecimal.ZERO);

    }


    // important, getId is from Product parent class
    @Override
    public Product applyRating(Rating newRating) {
        return new Food(getId(), getName(), getPrice(), newRating, bestBefore);
    }
}
