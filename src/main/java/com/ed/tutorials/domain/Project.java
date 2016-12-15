package com.ed.tutorials.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="projects")
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany(mappedBy="employees")
	private Set<Employee> employee;
	
	@Column(name="name")
	private String name;
	
	@Column(name="project_manager")
	private Long projectManager;
	
	@Column(name="from_date")
	private Date fromDate;
	
	@Column(name="to_date")
	private Date toDate;
	
	protected Project(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(Long projectManager) {
		this.projectManager = projectManager;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	
	
}
