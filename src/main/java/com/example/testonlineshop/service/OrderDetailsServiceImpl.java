package com.example.testonlineshop.service;

import com.example.testonlineshop.model.OrderDetails;
import com.example.testonlineshop.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    public OrderDetails save(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }


    @Override
    public OrderDetails update(OrderDetails orderDetails) {
        OrderDetails updateOrderDetails = orderDetailsRepository.findById(orderDetails.getOrderId()).orElseThrow(() -> new RuntimeException("not found person"));
        updateOrderDetails.setAddress(orderDetails.getAddress());
        return orderDetailsRepository.save(updateOrderDetails);
    }


    @Override
    public OrderDetails findById(Long orderId) {
        return orderDetailsRepository.findById(orderId).orElseThrow(() -> new RuntimeException("not found person"));
    }
}
