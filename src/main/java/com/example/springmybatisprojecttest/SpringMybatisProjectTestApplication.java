package com.example.springmybatisprojecttest;

import com.example.springmybatisprojecttest.service.SongsInfoService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMybatisProjectTestApplication implements CommandLineRunner {
    @Autowired
    private SongsInfoService songsInfoService;
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisProjectTestApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception{
        System.out.println(songsInfoService.selectAllSongsInfo());
        System.out.println("hello");
    }
}
