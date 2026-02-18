package com.example.demo.entity;

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
	private long deptno;
	private String deptname;
	
	@OneToMany
	@JoinColumn(name="empno")
	private Employee emp;

	public Department(long deptno, String deptname, Employee emp) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.emp = emp;
	}
	
	public Department() {}
	public long getDeptno() {
		return deptno;
	}

	public void setDeptno(long deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	

}
