package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void contextLoads() {
        Map<String,Rental> rentals =  new HashMap<>();
        rentals.put(" ",new Rental(Duration.ofDays(1), 2));
        rentals.put("", new Rental(Duration.ofDays(7), 10));
        Movie movie = new Movie(1, "Matrix", "...",rentals);

        movieRepository.save(movie);

        movie.setTitle("Matrix 2");
        movieRepository.save(movie);

        System.out.println(movieRepository.findAll());
    }

}
