package com.frankhe.java.ocp.lab8_array_loop.data;


public enum Rating {
    NOT_RATED("on star"),
    ONE_STAR("one star"),
    TWO_STAR("two stars"),
    THREE_STAR("three stars"),
    FOUR_STAR("four stars"),
    FIVE_STAR("five stars");
    private String stars;

    Rating(String stars) {
        this.stars = stars;
    }

    public String getStars() {
        return stars;
    }
}
