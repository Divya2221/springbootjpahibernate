package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
	public abstract List<Employee> findByempSalBetween(int intialsal,int finalsal);

	abstract List<Employee> findByempDesg(String empDesg);
}
