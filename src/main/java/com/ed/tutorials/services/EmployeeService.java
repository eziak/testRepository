package com.ed.tutorials.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ed.tutorials.repositories.EmployeeRepository;
import com.ed.tutorials.domain.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	//public Employee addEmployee(String firstName, String lastName, Date birthDate, Date hireDate, String gender) {
	@Transactional
	public List<Employee> findEmployee ()	{
		/*Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setBirthDate(birthDate);
		employee.setHireDate(hireDate);
		employee.setGender(gender);*/
		
		return employeeRepository.findByLastName("bi");
	}
	
}
