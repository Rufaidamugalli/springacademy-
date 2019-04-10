package com.example.springdatajdbcdemo;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Pet {

    @Id
    private Long id;
    private String name;
    private LocalDate localDate;

    public Pet(Long id, String name, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.localDate = localDate;
    }

   public static Pet creat(String name, LocalDate localDate){
        return new Pet(null,name,localDate);
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
