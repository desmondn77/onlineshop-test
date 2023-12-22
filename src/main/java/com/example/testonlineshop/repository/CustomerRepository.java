package com.example.testonlineshop.repository;

import com.example.testonlineshop.model.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Long> {
}
