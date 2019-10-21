package com.codeclan.employeeservice;

import com.codeclan.employeeservice.models.Employee;
import com.codeclan.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createEmployee(){
		Employee john = new Employee("John", 39, 12345, "john@googlemail.com");
		employeeRepository.save(john);
	}

}
