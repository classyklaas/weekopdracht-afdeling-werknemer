package com.company.company.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.company.company.domain.Employee;


@Component
public interface EmployeeRepo extends CrudRepository<Employee, Long>{
}