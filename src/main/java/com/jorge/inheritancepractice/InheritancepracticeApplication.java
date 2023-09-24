package com.jorge.inheritancepractice;

import com.jorge.inheritancepractice.model.Employee;
import com.jorge.inheritancepractice.model.Person;
import com.jorge.inheritancepractice.repository.ClientRepository;
import com.jorge.inheritancepractice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritancepracticeApplication implements CommandLineRunner {
	@Autowired
	ClientRepository personRepository;
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(InheritancepracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// * Creando un employee
		Employee employee1 = new Employee();

		employee1.setName("Juan");
		employee1.setRole("Manager");
		employee1.setAge(20);

		System.out.println(employeeRepository.save(employee1));

	}
}
