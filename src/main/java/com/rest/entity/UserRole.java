package com.rest.entity;

public enum UserRole {
    ADMIN("Admin"), CUSTOMER("Customer");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
