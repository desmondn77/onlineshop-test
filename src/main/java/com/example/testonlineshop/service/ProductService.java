package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Products;

public interface ProductService {
    Products save(Products products);

    Products update(Products products);

    void delete(Long productId);

    Products findById(Long productId);
}
