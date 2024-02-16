package com.example.EmployeeData.service;

import com.example.EmployeeData.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee save(Employee employee);

    Employee findById(int theId);

    void deleteById(int theId);
}
