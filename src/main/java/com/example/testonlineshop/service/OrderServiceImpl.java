package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Orders;
import com.example.testonlineshop.model.Products;
import com.example.testonlineshop.repository.OrederRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class OrderServiceImpl {
    public Products product;
    @Autowired
    private OrederRepository orederRepository;
    private final Map<Products, Integer> cart = new LinkedHashMap<>();

    public Orders save(Orders orders) {
        return orederRepository.save(orders);
    }

    public Orders update(Orders orders) {
        Orders updateOrders = orederRepository.findById(orders.getOrderId()).orElseThrow(() -> new RuntimeException("not found person"));
        updateOrders.setAddress(orders.getAddress());
        return orederRepository.save(updateOrders);
    }

    public Orders findById(Long orderId) {
        return orederRepository.findById(orderId).orElseThrow(() -> new RuntimeException("not found person"));
    }

}
