package com.jorge.inheritancepractice.repository;

import com.jorge.inheritancepractice.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
