package com.example.testonlineshop.trigger;

import com.example.testonlineshop.model.Employee;
import jakarta.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeTriggers extends Employee {
    private static final Logger log = LoggerFactory.getLogger(Employee.class.getName());

    @PrePersist
    public void logNewUserAttempt() {
        log.info("Attempting to add new user with username: " + employeeName);
    }

    @PreUpdate
    public void PreUserUpdate() {
        log.info("Attempting to update user: " + employeeName + " " + employeeLastname);
    }

    @PostUpdate
    public void PostUserUpdate() {
        log.info("Updated user: " + employeeName + " " + employeeLastname);
    }

    @PreRemove
    public void UserRemovalAttempt() {
        log.info("Attempting to delete user: " + employeeName + " " + employeeLastname);
    }

    @PostLoad
    public void UserLoadAttempt() {
        String fullName;
        log.info(fullName = employeeName + " " + employeeLastname);
    }

    @PostRemove
    public void UserRemoval() {
        log.info("Deleted user: " + employeeName + " " + employeeLastname);
    }
}
