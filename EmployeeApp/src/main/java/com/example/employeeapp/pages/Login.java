package com.example.employeeapp.pages;

import com.example.employeeapp.services.AuthService;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.annotations.Inject;

public class Login {

    @Property
    private String username;

    @Property
    private String password;

    @Inject
    private AuthService authService;

    @InjectComponent("loginForm")
    private Form form;

    void onValidateFromLoginForm() {
        if (username != null && password != null && !authService.authenticate(username, password)) {
            form.recordError("Invalid user name or password.");
        }
    }

    Object onSuccessFromLoginForm() {
        return EmployeeList.class;
    }
}
