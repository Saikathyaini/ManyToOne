package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.DeptRepository;

@Service
public class DeptService {
	@Autowired
	private DeptRepository repo;
	
	
	
	public DeptService(DeptRepository repo) {
		this.repo = repo;
	}



	public Department savedept(Department dept){
		return repo.save(dept);
		
	}
	
	public List<Department> getdept(){
		return repo.findAll();
	}
	

}
