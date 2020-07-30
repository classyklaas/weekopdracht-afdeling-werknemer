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

import com.company.company.controller.AfdelingService;
import com.company.company.domain.Afdeling;
import com.company.company.domain.Employee;

@RestController
@RequestMapping("/api/afdeling")
public class AfdelingEndpoint {
	
	@Autowired
	AfdelingService as;
	
	@GetMapping("/all")
	public Iterable<Afdeling> getAllAfdelingen(){
		return as.getAllAfdelingen();
	}
	
	@GetMapping("/id/{id}")
	public Afdeling getAfdelingById(@PathVariable(value = "id") long id) {
		return as.getById(id);
	}
		
	@PostMapping("/new")
	public Afdeling addDepartment(@RequestBody Afdeling afdeling) {
		return as.addDepartment(afdeling);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAfdelingById(@PathVariable(value = "id") long id  ) {
		as.deleteAfdelingById(id);
	}
	
	@PutMapping("/update/{id}")
	public Afdeling updateAfdeling(@PathVariable(value = "id") long id, @RequestBody Afdeling dp) {
		return as.updateAfdeling(id, dp);
	}
	
	@PutMapping("/addemployee/{departmentid}/{employeeid}")
	public Afdeling addEmployeeToDepartment(@PathVariable(value = "departmentid") long departmentid, @PathVariable(value = "employeeid") long employeeid) {
		return as.addEmployee(departmentid, employeeid);
	}
}