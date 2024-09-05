package com.example.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.entities.Salary;
public interface SalaryRepo extends CrudRepository<Salary, Integer>{

}
