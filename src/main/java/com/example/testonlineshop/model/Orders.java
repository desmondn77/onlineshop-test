package com.example.testonlineshop.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Orders extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long orderId;
    Long customerId;
    String address;
    Long productId;
    String describe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId", insertable = false, updatable = false)
    private Customers customers;

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Products.class)
    @JoinColumn(name = "productId")
    private Set<Products> productsSet;
}
