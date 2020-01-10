package com.microservices.test.serviceDatabaseUpdate.repositories;

import com.microservices.test.serviceDatabaseUpdate.entities.DataForUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateRepository extends JpaRepository<DataForUpdate, Long> {}
