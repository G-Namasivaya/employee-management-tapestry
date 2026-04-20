package com.example.employeeapp.pages;

import com.example.employeeapp.entities.Employee;
import com.example.employeeapp.services.EmployeeService;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

public class EmployeeDetail {

    @Property
    private Employee employee;

    @Inject
    private EmployeeService employeeService;

    void onActivate(Long employeeId) {
        employee = employeeService.getById(employeeId);
    }
}
