package com.example.testonlineshop.repository;

import com.example.testonlineshop.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Long> {
}
