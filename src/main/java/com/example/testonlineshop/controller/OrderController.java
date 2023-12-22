package com.example.testonlineshop.controller;

import com.example.testonlineshop.model.Orders;
import com.example.testonlineshop.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    public OrderServiceImpl orderService;

    @PostMapping
    public ResponseEntity<Orders> save(@RequestBody Orders orders) {
        return ResponseEntity.ok(orderService.save(orders));
    }

    @PutMapping
    public ResponseEntity<Orders> update(@RequestBody Orders orders) {
        return ResponseEntity.ok(orderService.update(orders));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Orders> findById(@PathVariable Long orderId) {
        return ResponseEntity.ok(orderService.findById(orderId));
    }
}
