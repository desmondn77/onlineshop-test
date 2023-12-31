package com.example.testonlineshop.trigger;

import com.example.testonlineshop.model.Customers;
import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerTriggers extends Customers {
    private static final Logger log = LoggerFactory.getLogger(Customers.class.getName());

    @PrePersist
    public void logNewUserAttempt() {
        log.info("Attempting to add new user with username: " + name);
    }

    @PreUpdate
    public void PreUserUpdate() {
        log.info("Attempting to update user: " + name + " " + lastname);
    }

    @PostUpdate
    public void PostUserUpdate() {
        log.info("Updated user: " + name + " " + lastname);
    }

    @PreRemove
    public void UserRemovalAttempt() {
        log.info("Attempting to delete user: " + name + " " + lastname);
    }

    @PostLoad
    public void UserLoadAttempt() {
        String fullName;
        log.info(fullName = name + " " + lastname);
    }

    @PostRemove
    public void UserRemoval() {
        log.info("Deleted user: " + name + lastname);
    }
}
