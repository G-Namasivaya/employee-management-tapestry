package com.example.employeeapp.dao;

import com.example.employeeapp.entities.Employee;
import java.util.List;

public interface EmployeeDao {
    void save(Employee employee);
    List<Employee> getEmployeeData();
    Employee getById(Long id);
}
