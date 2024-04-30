package com.tutorial.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - tutorial
 * Package - com.tutorial.entity
 * Created_on - April 30 - 2024
 * Created_at - 22:12
 */

@Entity
public class UserTable {

    @Id
    private int id;

    @Column(length = 5000, name = "rohit")
    private String name;
    private String email;
    private String password;
    private boolean isEnabled;

    // No Argument Constructor
    public UserTable() {
    }

    // All Argument Constructor
    public UserTable(int id, String name, String email, String password, boolean isEnabled) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
