package com.wolfmediabackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMybatisProjectTestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisProjectTestApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception{
        System.out.println("hello");
    }
}
