package com.jorge.inheritancepractice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Employee extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long employeeId;
    String role;

    public Employee(String name, int age, Long employeeid, String role) {
        super(name, age);
        this.employeeId = employeeid;
        this.role = role;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
