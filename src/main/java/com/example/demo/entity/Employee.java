package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long empno;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="deptno")
	private Department dept;

	public Employee(long empno, String name, Department dept) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
	}
	
	public Employee() {}
	public long getEmpno() {
		return empno;
	}

	public void setEmpno(long empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}
