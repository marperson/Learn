package com.frankhe.java.ocp.lab9_collection.data;

import com.frankhe.java.ocp.lab9_collection.data.Product;

import java.math.BigDecimal;
import java.time.LocalTime;

public final class Drink extends Product  {

//    remove public keyword, then only accessable from same packge, then Shop can't access, use productManager
    Drink(int id, String name, BigDecimal price, Rating rating) {
//    public Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    @Override
    public BigDecimal getDiscountRate() {
//        return super.getDiscountRate();
        LocalTime now = LocalTime.now();
        return ( now.isAfter(LocalTime.of(17, 30))
                && now.isBefore(LocalTime.of(18, 30)))
                ? super.getDiscountRate() : BigDecimal.ZERO;
    }


    //important, abastrac Product methode override, getId is from Produce method
    @Override
    public Product applyRating (Rating newRating) {
        return new Drink(getId(), getName(), getPrice(), newRating);
    }

}
