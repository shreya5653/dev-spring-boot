package com.my_backend_project.cruddemo.service;

import com.my_backend_project.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save (Employee theEmployee);

    void deleteById(int theId);
}
