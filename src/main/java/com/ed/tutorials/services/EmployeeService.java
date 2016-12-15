package com.ed.tutorials.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ed.tutorials.domain.Employee;
import com.ed.tutorials.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;


	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
	this.employeeRepository = employeeRepository;
	}
	
	@Transactional
	public Employee addEmployee(String firstName, String lastName, Date birthDate, Date hireDate, String gender) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setBirthDate(birthDate);
		employee.setHireDate(hireDate);
		employee.setGender(gender);
		
		return employeeRepository.save(employee);
	}
	
}
