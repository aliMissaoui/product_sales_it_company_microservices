package com.example.clientservice.repository;

import com.example.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    // Find clients by name
    List<Client> findByName(String name);

    // Find clients with a sales greater than a specified amount
    @Query("SELECT c FROM Client c WHERE c.sales > :salesAmount")
    List<Client> findBySalesGreaterThan(double salesAmount);
}
