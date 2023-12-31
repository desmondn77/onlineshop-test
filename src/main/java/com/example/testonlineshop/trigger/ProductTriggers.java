package com.example.testonlineshop.trigger;

import com.example.testonlineshop.model.Products;
import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductTriggers extends Products {
    private static final Logger log = LoggerFactory.getLogger(Products.class.getName());

    @PrePersist
    public void NewProductAttempt() {
        log.info("Attempting to add new product with username: " + productName);
    }

    @PreUpdate
    public void PreProductUpdate() {
        log.info("Attempting to update product: " + productName);
    }

    @PostUpdate
    public void PostProductUpdate() {
        log.info("Updated product: " + productName);
    }

    @PreRemove
    public void ProductRemovalAttempt() {
        log.info("Attempting to delete product: " + productName + "with id:" + productId);
    }

    @PostRemove
    public void ProductRemoval() {
        log.info("Deleted product: " + productName + "with id:" + productId);
    }
}
