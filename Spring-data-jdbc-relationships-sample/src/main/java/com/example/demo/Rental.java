package com.example.demo;

import java.time.Duration;

public class Rental {
    private Duration duration;
    private Integer price;

    public Rental(Duration duration, Integer price) {
        this.duration = duration;
        this.price = price;
    }
}
