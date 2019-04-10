package com.example.demo;

import org.springframework.data.annotation.Id;

import java.util.Map;
import java.util.Set;

public class Movie {
    @Id
    private long id;
    private String title;
    private String description;
    private Map<String, Rental> rental;

    Movie(long id, String title, String description, Map<String, Rental> rental) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rental = rental;
    }

    public void addRental(String key, Rental rental) {
        this.rental.put(key, rental);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rental=" + rental +
                '}';
    }
}
