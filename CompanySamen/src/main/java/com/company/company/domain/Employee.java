package com.company.company.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.awt.*;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
	
	private long id;
	private String name;
    private long employeeIdentificatieNummer;
	private double salary;
    List message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List getMessage() {
        return message;
    }

    public void setMessage(List message) {
        this.message = message;
    }
}