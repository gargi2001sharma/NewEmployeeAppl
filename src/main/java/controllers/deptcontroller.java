package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Department;

@RestController
public class deptcontroller {
	@GetMapping("/Department")
	
	public Department getDepartment()
	{
		Department department = new Department();
		department.setDepartmentId(123);
		department.setDepartmentName("accounts");
		return department;
	}
	public deptcontroller() {
		// TODO Auto-generated constructor stub
	}

}
