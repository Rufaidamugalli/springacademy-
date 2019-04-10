package com.example.springdatajdbcdemo;

import org.springframework.data.annotation.Id;

public class Customer {

    @Id
    private Long id;
    private String name;
    private Address adress;

    public Customer(Long id, String name, Address adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public static  Customer creat(String name, Address adress)  {
        return  new Customer(null,"name",adress);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}
