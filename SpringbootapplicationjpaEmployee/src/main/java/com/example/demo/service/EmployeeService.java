package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
  

public interface EmployeeService {
    String addEmployee(Employee employee);
	String updateEmployee(Employee employee);
	String deletEmployee(int empId); 
	Employee getEmployeeById(int empId);
	List<Employee>getAllEmployee();
	List<Employee>getAllEmployeeBetweenSalary(int intialSal,int finalSal);
	List<Employee>getAllEmployeeByDesgnation(String empDesg);
}
