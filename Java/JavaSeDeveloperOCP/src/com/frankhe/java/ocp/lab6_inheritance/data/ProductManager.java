package com.frankhe.java.ocp.lab6_inheritance.data;

import java.math.BigDecimal;
import java.time.LocalDate;

// important: Factory class: class which creates a lot of instance
public class ProductManager {
    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        return new Food(id, name, price, rating, bestBefore);
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating){
        return new Drink(id, name, price, rating);
    }
}
