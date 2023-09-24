package com.jorge.inheritancepractice.repository;

import com.jorge.inheritancepractice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
