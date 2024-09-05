package com.example.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.entities.Employee;


public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
