package com.company.company.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.company.domain.Afdeling;
import com.company.company.domain.Employee;

@Service
@Transactional
public class AfdelingService {
	
	@Autowired
	AfdelingRepository ar;
	@Autowired
	EmployeeRepo er;
	
	public Afdeling addDepartment(Afdeling afdeling) {
		System.out.println("add service afdeling");
		return ar.save(afdeling);
	}
	public Iterable<Afdeling> getAllAfdelingen() {
		System.out.println("getAllAfdelingen werkt!");
		return ar.findAll();
	}
	public Afdeling getById(long id) {
		System.out.println("getById werkt!");
		return ar.findById(id).get();
	}
	public void deleteAfdelingById(long id) {
		System.out.println("deleteAfdelingById werkt!");
		ar.deleteById(id);
	}
	public Afdeling updateAfdeling(long id, Afdeling dp) {
		System.out.println("updateAfdeling werkt!");
		Afdeling afdeling = getById(id);
		if (dp.getNaam() != null && dp.getNaam() != "") {
			afdeling.setNaam(dp.getNaam());
		}			
		return ar.save(afdeling);
	}
	public Afdeling addEmployee(long departmentid, long employeeid) {
		Afdeling afdeling  = ar.findById(departmentid).get();
		Employee employee = er.findById(employeeid).get();
		afdeling.addEmployees(employee);
		afdeling.setAantalMedewerkers(afdeling.getAantalMedewerkers() + 1); 
		System.out.println("employee added to department in database");
		return ar.save(afdeling);
	}
}
