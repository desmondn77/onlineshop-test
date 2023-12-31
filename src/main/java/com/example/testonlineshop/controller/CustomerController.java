package com.example.testonlineshop.controller;

import com.example.testonlineshop.model.Customers;
import com.example.testonlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class CustomerController {
    @Autowired
    public CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customers> save(@RequestBody Customers customers) {
        return ResponseEntity.ok(customerService.save(customers));
    }

    @PutMapping
    public ResponseEntity<Customers> update(@RequestBody Customers customers) {
        return ResponseEntity.ok(customerService.update(customers));
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customers> findById(@PathVariable Long customerId) {
        return ResponseEntity.ok(customerService.findById(customerId));
    }

}
