package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DeptService;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService service;
	
	@PostMapping("/saved")
	public ResponseEntity<Department> savedepta(@RequestBody Department dept){
		Department d=service.savedept(dept);
		return new ResponseEntity<>(d,HttpStatus.OK);
	}
	
	
}
