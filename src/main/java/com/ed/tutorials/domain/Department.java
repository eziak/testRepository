package com.ed.tutorials.domain;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="departments")
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;

	@ManyToMany(mappedBy="employees")
	private Set<Employee> employee;
	
	protected Department() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployees(Set<Employee> employee) {
		this.employee = employee;
	}
	
}
