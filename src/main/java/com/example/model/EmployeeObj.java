package com.example.model;
import com.example.entities.Employee;
import com.example.entities.Department;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class EmployeeObj {

	public EmployeeObj() {
		 private Long EmployeeId;
		    private String EmployeeName;
		    private DeptObj department;
		    private SalaryObj salary;
		// TODO Auto-generated constructor stub
	}

}
