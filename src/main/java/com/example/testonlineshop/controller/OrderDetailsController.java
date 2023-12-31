package com.example.testonlineshop.controller;

import com.example.testonlineshop.model.OrderDetails;
import com.example.testonlineshop.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {
    @Autowired
    public OrderDetailsService orderDetailsService;

    @PostMapping
    public ResponseEntity<OrderDetails> save(@RequestBody OrderDetails orderDetails) {
        return ResponseEntity.ok(orderDetailsService.save(orderDetails));
    }

    @PutMapping
    public ResponseEntity<OrderDetails> update(@RequestBody OrderDetails orderDetails) {
        return ResponseEntity.ok(orderDetailsService.update(orderDetails));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<OrderDetails> findById(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderDetailsService.findById(orderId));
    }
}
