package com.example.testonlineshop.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@FieldDefaults(level = AccessLevel.PUBLIC)
@Entity
public class Products extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pr_Id")
    Long productId;
    String productName;
    BigDecimal price;
    String describeProduct;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private Orders orders;

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
