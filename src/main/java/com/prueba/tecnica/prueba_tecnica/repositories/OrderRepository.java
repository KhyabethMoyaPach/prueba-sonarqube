package com.prueba.tecnica.prueba_tecnica.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.prueba_tecnica.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    Optional<Order> findByActiveTrue();
}
