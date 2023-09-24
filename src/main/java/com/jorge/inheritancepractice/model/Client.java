package com.jorge.inheritancepractice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Client extends Person{
    String type;

    public Client(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public Client(String type) {
        this.type = type;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "type='" + type + '\'' +
                ", Id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
