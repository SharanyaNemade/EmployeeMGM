package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepository;


@Service
public class EmployeeService {
		
	
	
	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> getEmployees()
	{
		return repo.findAll();
	}
}
