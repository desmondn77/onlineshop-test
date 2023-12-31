package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Customers;

public interface CustomerService {
    Customers save(Customers customers);

    Customers update(Customers customers);

    void delete(Long customerId);

    Customers findById(Long customerId);
}
