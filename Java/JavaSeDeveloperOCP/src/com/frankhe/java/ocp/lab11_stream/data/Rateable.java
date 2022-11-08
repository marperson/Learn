package com.frankhe.java.ocp.lab11_stream.data;


import com.frankhe.java.ocp.lab11_stream.data.Rating;

@FunctionalInterface            //important: validate if more than one abstract method
public interface Rateable<T> {
    // Interface can have constants, which including enum
    public static final Rating DEFAULT_RATING = Rating.NOT_RATED;
    T applyRating(Rating rating);

    public default T applyRating(int starts){
        return applyRating(Rateable.convert(starts));

    }


    // Interface can have default, static and private methode with method body
    public default Rating getRating(){
        return DEFAULT_RATING;
    }


    public static Rating convert(int stars){
    // important enum provide method value which consider enum as array: Rating.values()[stars]
        return (stars >= 0 && stars <= 5) ? Rating.values()[stars] : DEFAULT_RATING;

    }
}
