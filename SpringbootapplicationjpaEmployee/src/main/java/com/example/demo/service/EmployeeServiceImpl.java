package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;

import com.example.demo.entity.Employee;


import jakarta.transaction.Transactional;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired 
	EmployeeDao dao;
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.save(employee);
		return "Employee Saved Successfully" ;
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.save(employee);
		return "Employee Update  Successfully" ;
	}

	@Override
	public String deletEmployee(int empId) {
		// TODO Auto-generated method stub
		dao.deleteById(empId);
		return "Employee Deleted ";
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Optional<Employee>optional=	dao.findById(empId);
		return optional.get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Employee> getAllEmployeeBetweenSalary(int intialSal, int finalSal) {
		// TODO Auto-generated method stub
		return dao.findByempSalBetween(intialSal, finalSal);
	}

	@Override
	public List<Employee> getAllEmployeeByDesgnation(String empDesg) {
		// TODO Auto-generated method stub
		return dao.findByempDesg(empDesg);
	}

}
