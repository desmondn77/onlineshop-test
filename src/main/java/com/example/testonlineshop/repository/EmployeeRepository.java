package com.example.testonlineshop.repository;

import com.example.testonlineshop.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
