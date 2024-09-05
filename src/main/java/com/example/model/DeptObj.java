package com.example.model;
import com.example.entities.*;
import com.example.entities.Employee;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class DeptObj {

	  private Long DepartmentId;
	    private String DepartmentName;
	public DeptObj() {
		// TODO Auto-generated constructor stub
	}

}
