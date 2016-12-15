package com.ed.tutorials.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="hire_date")
	private Date hireDate;
	
	@Column(name="gender")
	private String gender;
	
	@ManyToMany
	@JoinTable(name="departments_managers")
	private Set<Department> department;
	
	@ManyToMany
	@JoinTable(name="projects_employees")
	private Set<Project> project;
	
	@OneToMany(mappedBy="Employees")
	private Set<Salary> salary;
	
	@OneToMany(mappedBy="Employees")
	private Set<Title> title;
	
	public Employee() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<Department> getDepartment() {
		return department;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	public Set<Salary> getSalary() {
		return salary;
	}

	public void setSalary(Set<Salary> salary) {
		this.salary = salary;
	}

	public Set<Title> getTitle() {
		return title;
	}

	public void setTitle(Set<Title> title) {
		this.title = title;
	}

	public void setDepartments(Set<Department> department) {
		this.department = department;
	}
	
}
