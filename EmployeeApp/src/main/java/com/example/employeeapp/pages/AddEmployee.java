package com.example.employeeapp.pages;

import com.example.employeeapp.entities.Employee;
import com.example.employeeapp.services.EmployeeService;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;

public class AddEmployee {

    @Property
    private Employee employee;

    @Inject
    private EmployeeService employeeService;

    @InjectComponent("employeeForm")
    private Form form;

    void onPrepareForRender() {
        if (employee == null) {
            employee = new Employee();
        }
    }

    void onPrepareForSubmit() {
        if (employee == null) {
            employee = new Employee();
        }
    }

    void onValidateFromEmployeeForm() {
        if (employee.getAge() != null && employee.getAge() <= 0) {
            form.recordError("Age must be greater than 0.");
        }
    }

    Object onSuccessFromEmployeeForm() {
        employeeService.save(employee);
        return EmployeeList.class;
    }
}
