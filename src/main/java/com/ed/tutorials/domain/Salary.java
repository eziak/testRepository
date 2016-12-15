package com.ed.tutorials.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="salaries")
public class Salary {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="id")
	private Employee employee;
	
	@Column(name="from_date")
	private Date fromDate;
	
	@Column(name="to_date")
	private Date toDate;
	
	@Column(name="salary")
	private BigDecimal salary;
	
	protected Salary() {}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	
}
