package com.microservices.test.serviceDatabaseUpdate.controllers;

import com.microservices.test.serviceDatabaseUpdate.entities.DataForUpdate;
import com.microservices.test.serviceDatabaseUpdate.repositories.UpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/update")
@PropertySource("classpath:db-config-update.properties")
@SpringBootApplication
@EntityScan("")
public class UpdateDatabaseController {

    @PostMapping("/add")
    public List<DataForUpdate> addData(@RequestBody DataForUpdate dataForUpdate) {
        repository.save(dataForUpdate);
        return repository.findAll();
    }
}
