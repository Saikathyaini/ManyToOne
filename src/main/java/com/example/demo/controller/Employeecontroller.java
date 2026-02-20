package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class Employeecontroller {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmpl(@RequestBody Employee emp){
		Employee e=service.saveEmp(emp);
		return new ResponseEntity<Employee>(e,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Employee>> getEmpl(){
		return new ResponseEntity<>(service.getEmp(),HttpStatus.OK);
	}
	
	

}
