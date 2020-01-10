package com.microservices.test.serviceDatabaseCheck.controllers;

import com.microservices.test.serviceDatabaseCheck.entities.DataForCheck;
import com.microservices.test.serviceDatabaseCheck.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/check")
public class CheckDatabaseController {

    @Autowired
    private CheckRepository repository;

    @GetMapping("/getAll")
    public List<DataForCheck> getAll() {
        return repository.findAll();
    }

    @GetMapping("/getById/{id}")
    public Optional<DataForCheck> getById(@RequestParam("id") Long id) {
        return repository.findById(id);
    }
}
