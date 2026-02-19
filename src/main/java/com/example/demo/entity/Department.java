package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long deptno;
	private String deptname;
	
	@OneToMany
	@JoinColumn(name="empno")
	private List<Employee> emp;

	public Department(Long deptno, String deptname, List<Employee> emp) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.emp = emp;
	}

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	
}
