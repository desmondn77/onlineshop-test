package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Products;
import com.example.testonlineshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Products save(Products products) {
        return productRepository.save(products);
    }
    @Override
    public Products update(Products products) {
        Products updateProducts = productRepository.findById(products.getProductId()).orElseThrow(() -> new RuntimeException("not found person"));
        updateProducts.setProductName(products.getProductName());
        updateProducts.setPrice(products.getPrice());
        return productRepository.save(updateProducts);
    }
    @Override
    public void delete(Long productId) {
        productRepository.delete(findById(productId));
    }
    @Override
    public Products findById(Long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found person"));
    }
}
