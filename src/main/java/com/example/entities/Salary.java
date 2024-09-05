package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Salary {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Employee EmployeeId;
	
	private String Salary;
	
	
	@Override
	public String toString() {
		return "Salary [EmployeeId=" + EmployeeId + ", Salary=" + Salary + "]";
	}


	public Salary(Employee employeeId, String salary) {
		super();
		this.EmployeeId = employeeId;
		this.Salary = salary;
	}


	public Employee getEmployeeId() {
		return EmployeeId;
	}


	public void setEmployeeId(Employee employeeId) {
		EmployeeId = employeeId;
	}


	public String getSalary() {
		return Salary;
	}


	public void setSalary(String salary) {
		Salary = salary;
	}


	public Salary() {
		// TODO Auto-generated constructor stub
	}

}
