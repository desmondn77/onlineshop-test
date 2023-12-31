package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Orders;

public interface OrderService {
    //private final Map<Products, Integer> cart = new LinkedHashMap<>();
    Orders save(Orders orders);

    Orders update(Orders orders);

    Orders findById(Long orderId);
}
