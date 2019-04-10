package com.example.springdatajdbcdemo;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet,Long> {
    @Query("select * from Pet where name = :name" )
    List<Pet> findByName(@Param("name") String name);
}
