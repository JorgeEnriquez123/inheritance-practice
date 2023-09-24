package com.jorge.inheritancepractice.repository;

import com.jorge.inheritancepractice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
