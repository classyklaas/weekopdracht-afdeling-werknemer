package com.company.company.domain;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "afdeling")
public class Afdeling {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
	private long id;
	private String naam; 
	private int aantalMedewerkers;
	
	@OneToMany
	@JoinColumn(name="department_id")
	private List<Employee> employees = new ArrayList<>();

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public int getAantalMedewerkers() {
		return aantalMedewerkers;
	}
	public void setAantalMedewerkers(int aantalMedewerkers) {
		this.aantalMedewerkers = aantalMedewerkers;
	}
	public void addEmployees(Employee employees) {
		this.employees.add(employees);
	}
}