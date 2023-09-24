package com.jorge.inheritancepractice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Employee extends Person{
    String role;
    String employeeid;

    public Employee(String name, int age, String role, String employeeid) {
        super(name, age);
        this.role = role;
        this.employeeid = employeeid;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                ", Id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
