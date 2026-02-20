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

import com.example.demo.entity.Department;
import com.example.demo.service.DeptService;

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
	
	@GetMapping("/got")
	public ResponseEntity<List<Department>> getdep(){
		return new ResponseEntity<List<Department>>(service.getdept(),HttpStatus.OK);
	}
	
}
