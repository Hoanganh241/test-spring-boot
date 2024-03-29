package com.example.springboottest.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationSeeder implements CommandLineRunner {


    @Autowired
    ProductSeeder productSeeder;


    @Override
    public void run(String... args) {
        productSeeder.generate();

    }
}

