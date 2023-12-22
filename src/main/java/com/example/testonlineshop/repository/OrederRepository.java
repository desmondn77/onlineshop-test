package com.example.testonlineshop.repository;

import com.example.testonlineshop.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrederRepository extends CrudRepository<Orders, Long> {
}
