package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Employee;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee update(Employee employee);

    Employee findById(Long employeeId);
}
