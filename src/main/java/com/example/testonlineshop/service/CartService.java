package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Products;

import java.math.BigDecimal;
import java.util.Map;

// CartController with other relation service's (CartService) about : List of selected products to buy

public interface CartService {

    void addProduct(Products product);

    void removeProduct(Products product);

    void clearProducts();

    Map<Products, Integer> productsInCart();

    BigDecimal totalPrice();

    void cartCheckout();
}
