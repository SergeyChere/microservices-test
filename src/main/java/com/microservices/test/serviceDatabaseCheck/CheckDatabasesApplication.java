package com.microservices.test.serviceDatabaseCheck;

import com.microservices.test.serviceDatabaseCheck.controllers.CheckDatabaseController;
import com.microservices.test.serviceDatabaseCheck.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(CheckDatabaseController.class)
public class CheckDatabasesApplication {

    @Autowired
    private CheckRepository repository;

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "database-check");
        SpringApplication.run(CheckDatabasesApplication.class, args);
    }
}
