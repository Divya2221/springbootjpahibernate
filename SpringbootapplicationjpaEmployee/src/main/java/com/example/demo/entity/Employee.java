package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="employee_info")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="eid")
	@Min(value=100,message="Employee Id Is Invalid")
	@Max(value=1000 ,message="Employee Id cannot be above 1000....")
private int empId;
	@Size(min=6,max=15,message="Employee Name should be in the range of(6,15)")
	@NotEmpty(message="Employee name cannot be empty or null")
private String empName;
@Column(name="empSal")
@Min(value=100,message="Employee Salary Is Invalid")
@Max(value=1000 ,message="Employee Salary cannot be above 100000....")

private int empSal;
private String empDesg;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpSal() {
	return empSal;
}
public void setEmpSal(int empSal) {
	this.empSal = empSal;
}
public String getEmpDesg() {
	return empDesg;
}
public void setEmpDesg(String empDesg) {
	this.empDesg = empDesg;
}
public Employee(int empId, String empName, int empSal, String empDesg) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
	this.empDesg = empDesg;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}



}
