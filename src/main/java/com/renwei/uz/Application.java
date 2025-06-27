package com.renwei.uz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan(basePackages={"com.renwei.uz.controller", "com.renwei.uz.service.impl", "com.renwei.uz.service", "com.renwei.uz.repository",  "com.renwei.uz.constant", "com.renwei.uz.dto", "com.renwei.uz.entity", "com.renwei.uz.vo", "com.renwei.uz.response"})
//@ComponentScan(basePackages = "com.renwei.uz")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//
//    @PostConstruct
//    public void init() {
//        // Setting Spring Boot SetTimeZone
//        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
//    }

}
