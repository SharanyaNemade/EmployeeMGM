package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
		
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/")
	public String showEmployeeList(Model model)
	{
		
		model.addAttribute("employees", service.getEmployees());
		return "index";
	}
}
