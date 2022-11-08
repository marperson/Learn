package com.frankhe.java.ocp.lab11_stream.data;


import java.util.Objects;

public class Review implements Comparable<Review>{
//public class Review {
    private Rating rating;
    private String comments;

    public Review(Rating rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

    public Rating getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", comments='" + comments + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return rating == review.rating && Objects.equals(comments, review.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, comments);
    }

    //Important comparable interface
    @Override
    public int compareTo(Review other){
//        if positive, a1 > a2 and
        return other.rating.ordinal() - this.rating.ordinal();

    }
}
