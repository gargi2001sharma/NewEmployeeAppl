package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int DepartmentId;
	
	private String DepartmentName;
	
	@Override
	public String toString() {
		return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + "]";
	}

	public Department(int deptId, String deptName) {
		super();
		this.DepartmentId = deptId;
		this.DepartmentName = deptName;
	}

	

	public int getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}
