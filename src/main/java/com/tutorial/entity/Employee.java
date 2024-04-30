package com.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Owner - Rohit Parihar and Bloggios
 * Author - rohit
 * Project - tutorial
 * Package - com.tutorial.entity
 * Created_on - April 30 - 2024
 * Created_at - 22:56
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String employeeId;

    private String name;
    private String email;
    private long phoneNumber;
    private boolean isEnabled;
    private int age;
}
