package com.example.testonlineshop.repository;

import com.example.testonlineshop.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Products, Long> {
}
