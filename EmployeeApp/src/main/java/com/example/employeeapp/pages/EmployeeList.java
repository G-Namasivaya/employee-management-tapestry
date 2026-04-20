package com.example.employeeapp.pages;

import com.example.employeeapp.entities.Employee;
import com.example.employeeapp.services.EmployeeService;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;

public class EmployeeList {

    @Inject
    private EmployeeService employeeService;

    @Property
    private List<Employee> employees;

    @Property
    private Employee currentEmployee;

    void setupRender() {
        employees = employeeService.getEmployeeData();
    }
}
