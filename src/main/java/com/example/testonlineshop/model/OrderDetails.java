package com.example.testonlineshop.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetails extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long orderId;
    String address;
    Long productId;
    String describeOrder;
    @OneToMany(fetch = FetchType.LAZY, targetEntity = Products.class)
    @JoinColumn(name = "productId")
    private Set<Products> productsSet;
}

// OrderDetails is <Redundency> in this entity but I hold that(OrderDetails) to have more relations and train DB more than! :))
// So OrederDetails can summary in <Orders> table

