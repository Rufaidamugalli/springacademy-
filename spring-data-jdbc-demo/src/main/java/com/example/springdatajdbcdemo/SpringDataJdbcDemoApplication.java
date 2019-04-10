package com.example.springdatajdbcdemo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataJdbcDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcDemoApplication.class, args);
    }

    ApplicationRunner applicationRunner(PetRepository petRepository) {
        return args -> {
			Pet pet1 = Pet.creat("Zuk", LocalDate.of(2014,4 ,30));
            Pet pet2 = Pet.creat("Dymka", LocalDate.of(2015,11 ,30));

            System.out.println(petRepository.save(pet1));
            System.out.println(petRepository.save(pet2));

            System.out.println(petRepository.findByName("Dymka"));

        };
    }

}
