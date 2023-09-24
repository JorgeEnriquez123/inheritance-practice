package com.jorge.inheritancepractice.repository;

import com.jorge.inheritancepractice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmployeeid(String employeeId);

}
