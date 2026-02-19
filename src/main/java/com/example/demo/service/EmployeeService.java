package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public EmployeeService(EmployeeRepository repo) {
		this.repo = repo;
	}


	public Employee saveEmp(Employee emp) {
		return repo.save(emp);
	}

}
