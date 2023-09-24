package com.jorge.inheritancepractice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Client extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long clientId;
    String type;

    public Client(String name, int age, Long clientId, String type) {
        super(name, age);
        this.clientId = clientId;
        this.type = type;
    }

    public Client() {
    }
}
