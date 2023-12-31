package com.example.testonlineshop.service;

import com.example.testonlineshop.model.OrderDetails;

public interface OrderDetailsService {
    OrderDetails save(OrderDetails orderDetails);

    OrderDetails update(OrderDetails orderDetails);

    OrderDetails findById(Long orderId);
}
