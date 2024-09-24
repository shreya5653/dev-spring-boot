package com.my_backend_project.cruddemo.dao;

import com.my_backend_project.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    // that's it ... no need to write any code LOL!
}
