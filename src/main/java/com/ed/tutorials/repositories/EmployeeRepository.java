package com.ed.tutorials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ed.tutorials.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	Employee save(Employee employee);
	
	Employee findbyLastName (Employee lastName);
}
