package com.yourteam.app.userregistrationtestfinalproject.model;

public class User {
    private final String email;

    public User(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}