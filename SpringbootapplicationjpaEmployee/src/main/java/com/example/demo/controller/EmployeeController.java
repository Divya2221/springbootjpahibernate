package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;


@RestController
@RequestMapping("/home")
public class EmployeeController {
	@Autowired 
	EmployeeService service;
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public String deletEmployee( @PathVariable("id")int empId) {
		return service.deletEmployee(empId);
	}
	@GetMapping("getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable("id")int empId) {
		return service.getEmployeeById(empId);
	}
	@GetMapping("getAllEmployee")
	public List<Employee>getAllEmployee(){
		return service.getAllEmployee();
	}
	@GetMapping("getAllEmployeeBetweenSalary/{isal}/fsal")
	public List<Employee>getAllProductBetweenPrices(@PathVariable("isal")int intialsal, @PathVariable ("fsal") int finalsal){
		return service.getAllEmployeeBetweenSalary(intialsal, finalsal);
	}
	@GetMapping("getAllEmployeeDesignation/{designation}")
	public List<Employee>getAllEmployeeByDesignation(@PathVariable("designation")String empdesg){
		return service.getAllEmployeeByDesgnation(empdesg);
	}
}

