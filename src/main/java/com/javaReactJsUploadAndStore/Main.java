package com.javaReactJsUploadAndStore;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableJpaRepositories
@SpringBootApplication
@EnableTransactionManagement
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

