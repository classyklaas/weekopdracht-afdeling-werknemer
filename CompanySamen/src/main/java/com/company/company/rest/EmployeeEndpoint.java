package com.company.company.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.company.controller.AfdelingRepository;
import com.company.company.controller.AfdelingService;
import com.company.company.controller.EmployeeRepo;
import com.company.company.controller.EmployeeService;
import com.company.company.domain.Afdeling;
import com.company.company.domain.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeEndpoint {
	
	@Autowired
	EmployeeService es;
	@Autowired
	AfdelingService as;
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return es.addEmployee(employee);
	}
	
	@GetMapping("/all")
	public Iterable<Employee> getAllEmployees(){
		return es.getAllEmployees();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeByID(@PathVariable(value = "id") long id  ) {
		es.deleteEmployeeByID(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee veranderSalaris(@PathVariable(value = "id") long id, @RequestBody Employee emp) {
		return es.veranderSalaris(id, emp);
	}
}