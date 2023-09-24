package com.jorge.inheritancepractice.model;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
