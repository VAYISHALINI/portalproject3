package com.example.demo.service;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Models.Employee;
import com.example.demo.repositories.Employeerepo;


	@Service
	public class ApiService {
	@Autowired
	Employeerepo repository;
    
	public Optional<Employee> getemployee(int id){
		return repository.findById(id);
	}

	
}
