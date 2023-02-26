package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Employee;



public interface Employeerepo extends JpaRepository<Employee,Integer> {

}
