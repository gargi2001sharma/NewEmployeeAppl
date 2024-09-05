package com.example.dao;
import org.springframework.data.repository.CrudRepository;

import com.example.entities.Department;


public interface DeptRepo extends CrudRepository<Department, Integer> {

}
