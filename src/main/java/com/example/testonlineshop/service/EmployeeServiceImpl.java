package com.example.testonlineshop.service;

import com.example.testonlineshop.model.Employee;
import com.example.testonlineshop.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        Employee updateEmployee = employeeRepository.findById(employee.getEmployeeId()).orElseThrow(() -> new RuntimeException("not found person"));
        updateEmployee.setEmployeeName(employee.getEmployeeName());
        updateEmployee.setEmployeeLastname(employee.getEmployeeLastname());
        updateEmployee.setWork(employee.getWork());
        return employeeRepository.save(updateEmployee);
    }

    @Override
    public Employee findById(Long employeeId) {
        return employeeRepository.findById(employeeId).orElseThrow(() -> new RuntimeException("not found person"));
    }
}
