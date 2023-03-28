package com.wolfmediabackend;

import com.wolfmediabackend.service.SongsService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages={"com.wolfmediabackend.mapper"})
@SpringBootApplication
public class SpringMybatisProjectTestApplication implements CommandLineRunner {
    @Autowired
    SongsService songsService;
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisProjectTestApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception{
        System.out.println(songsService.selectAllSongs());;
        System.out.println("hello");

    }
}
