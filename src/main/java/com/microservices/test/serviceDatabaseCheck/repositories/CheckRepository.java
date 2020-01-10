package com.microservices.test.serviceDatabaseCheck.repositories;

import com.microservices.test.serviceDatabaseCheck.entities.DataForCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends JpaRepository<DataForCheck, Long> {}
