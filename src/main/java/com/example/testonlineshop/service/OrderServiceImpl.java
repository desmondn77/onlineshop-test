package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Orders;
import com.example.testonlineshop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    //@Autowired
    //private ProductRepository productRepository;

    //private final Map<Products, Integer> cart = new LinkedHashMap<>();
    @Override
    public Orders save(Orders orders) {
        return orderRepository.save(orders);
    }

    @Override
    public Orders update(Orders orders) {
        Orders updateOrders = orderRepository.findById(orders.getOrderId()).orElseThrow(() -> new RuntimeException("not found person"));
        updateOrders.setAddress(orders.getAddress());
        updateOrders.setDescribe(orders.getDescribe());
        return orderRepository.save(updateOrders);
    }

    @Override
    public Orders findById(Long orderId) {
        return orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("not found person"));
    }

}
