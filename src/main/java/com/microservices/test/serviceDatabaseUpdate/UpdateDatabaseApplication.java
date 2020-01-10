package com.microservices.test.serviceDatabaseUpdate;

import com.microservices.test.serviceDatabaseUpdate.repositories.UpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(UpdateDatabaseApplication.class)
public class UpdateDatabaseApplication {

    @Autowired
    private UpdateRepository repository;

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "database-update.yml");
        SpringApplication.run(UpdateDatabaseApplication.class, args);
    }
}
