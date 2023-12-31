package com.example.testonlineshop.model;

import com.example.testonlineshop.trigger.CustomerTriggers;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.antlr.v4.runtime.misc.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PUBLIC)
@Data
@Entity
public class Customers extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id", nullable = false)
    Long customerId;
    @NotNull
    String name;
    @NotNull
    String lastname;
    String city;
    String email;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId")
    private Set<Orders> ordersSet;
    @Override
    public int hashCode() {
       return Objects.hash(customerId);
    }
}
