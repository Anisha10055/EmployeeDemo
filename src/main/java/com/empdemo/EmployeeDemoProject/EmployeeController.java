package com.empdemo.EmployeeDemoProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping(value = "/empdetails", method = RequestMethod.GET)
	public List<Employee> getEmployee()
	{
		List<Employee> employees = employeeService.findAll();
		return employees;
	}
}

