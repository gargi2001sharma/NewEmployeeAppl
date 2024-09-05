package com.example.entities;

import com.example.Department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EmployeeId;
	

	
	 private String EmployeeName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, Department departmentId) {
		super();
		this.EmployeeId = employeeId;
		this.EmployeeName = employeeName;
		this.DepartmentId = departmentId;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public Department getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(Department departmentId) {
		DepartmentId = departmentId;
	}

	private Department DepartmentId;
	

	

}
