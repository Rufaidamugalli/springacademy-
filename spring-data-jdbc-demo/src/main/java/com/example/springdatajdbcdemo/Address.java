package com.example.springdatajdbcdemo;

import org.springframework.data.annotation.Id;

public class Address {
    @Id
    private Long id;
    private String adressLine;

    public Address(Long id, String adressLine) {
        this.id = id;
        this.adressLine = adressLine;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", adressLine='" + adressLine + '\'' +
                '}';
    }
}
