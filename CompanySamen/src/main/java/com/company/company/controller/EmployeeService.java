package com.company.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.company.domain.Afdeling;
import com.company.company.domain.Employee;

@Component
public class EmployeeService {
	
	@Autowired
	AfdelingRepository ar;
	@Autowired
	EmployeeRepo er;
	
	public Employee getById(long id) {
		System.out.println("getById werkt!");
		return er.findById(id).get();
	}
	public Employee addEmployee(Employee employee) {
		System.out.println("addEmployee werkt!");
		return er.save(employee);
	}
	public void deleteEmployeeByID(long id) {
		System.out.println("deleteEmployeeByID werkt!");
		er.deleteById(id);
	}
	public Iterable<Employee> getAllEmployees() {
		System.out.println("getAllEmployees werkt!");
		return er.findAll();
	}
	public Employee veranderSalaris(long id, Employee emp) {
		Employee employee = getById(id);
		{
			System.out.println("veranderSalaris werkt!");

			employee.setSalary(emp.getSalary());
		}			
		return er.save(employee);
	}
}
