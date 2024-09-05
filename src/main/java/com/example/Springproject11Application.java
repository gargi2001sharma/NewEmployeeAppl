package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.dao.DeptRepo;
import com.example.dao.UserRepo;
import com.example.entities.User;

@SpringBootApplication
public class Springproject11Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springproject11Application.class, args);
	
		DeptRepo deptRepo = context.getBean(DeptRepo.class); 
		
		//User user = new User();
		//user.setName("ggg");
		
		//User user1 = userRepo.save(user);
		
		/*
		 * Department dept1 = new Department(0, null); dept1.setDepartmentName("abc");
		 * 
		 * User user2 = new User(); user2.setName("xyz");
		 * 
		 * List<User> users = List.of(user1,user2); Iterable<User> result =
		 * userRepo.saveAll(users);
		 * 
		 * result.forEach(user ->{ System.out.println(user); });
		 */
		
		System.out.println("done");
		
	}

}