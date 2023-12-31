package com.example.testonlineshop.controller;

import com.example.testonlineshop.model.Employee;
import com.example.testonlineshop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @PutMapping
    public ResponseEntity<Employee> update(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.update(employee));
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> findById(@PathVariable Long employeeId) {
        return ResponseEntity.ok(employeeService.findById(employeeId));
    }


}
