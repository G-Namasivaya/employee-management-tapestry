package com.example.employeeapp.services;

public class AuthServiceImpl implements AuthService {

    @Override
    public boolean authenticate(String username, String password) {
        // Hardcoded Values
        return "admin".equals(username) && "admin".equals(password);
    }
}
