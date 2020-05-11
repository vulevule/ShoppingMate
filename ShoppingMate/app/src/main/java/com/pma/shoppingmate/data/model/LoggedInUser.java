package com.pma.shoppingmate.data.model;

public class LoggedInUser {
    private String email;
    private String name;

    public LoggedInUser(String email, String name) {
        this.email = email;
        this.name = name;
    }
    public String getUserId() {
        return email;
    }

    public String getDisplayName() {
        return name;
    }
}
