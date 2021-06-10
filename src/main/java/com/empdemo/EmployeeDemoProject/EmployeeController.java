package com.empdemo.EmployeeDemoProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping(value="/empdetails")
	public List<Employee> getEmployee()
	{
		List<Employee> employees = employeeService.findAll();
		return employees;
	}
}