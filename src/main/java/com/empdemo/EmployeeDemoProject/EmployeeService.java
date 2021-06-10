package com.empdemo.EmployeeDemoProject;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{

	@Override
	public List<Employee> findAll() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Thomas", 2000.00));
		employees.add(new Employee(2, "John", 3000.00));
		employees.add(new Employee(3, "Ada", 5500.00));
		
		return employees;
	}
	
	

}