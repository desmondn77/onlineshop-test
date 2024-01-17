package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Customers;
import com.example.testonlineshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customers save(Customers customers) {
        return customerRepository.save(customers);
    }

    @Override
    public Customers update(Customers customers) {
        Customers updateCustomer = customerRepository.findById(customers.getCustomerId()).orElseThrow(() -> new RuntimeException("not found person"));
        updateCustomer.setName(customers.getName());
        updateCustomer.setLastname(customers.getLastname());
        updateCustomer.setCity(customers.getCity());
        updateCustomer.setEmail(customers.getEmail());
        return customerRepository.save(updateCustomer);
    }

    @Override
    public void delete(Long customerId) {
        customerRepository.delete(findById(customerId));
    }

    @Override
    public Customers findById(Long customerId) {
        return customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("not found person"));
    }
}
