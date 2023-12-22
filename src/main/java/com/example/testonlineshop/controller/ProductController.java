package com.example.testonlineshop.controller;

import com.example.testonlineshop.model.Products;
import com.example.testonlineshop.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    public ProductServiceImpl productService;

    @PostMapping
    public ResponseEntity<Products> save(@RequestBody Products products) {
        return ResponseEntity.ok(productService.save(products));
    }

    @PutMapping
    public ResponseEntity<Products> update(@RequestBody Products products) {
        return ResponseEntity.ok(productService.update(products));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Products> findById(@PathVariable Long productId) {
        return ResponseEntity.ok(productService.findById(productId));
    }
}
