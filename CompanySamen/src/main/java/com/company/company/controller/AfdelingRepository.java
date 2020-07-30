package com.company.company.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.company.company.domain.Afdeling;

@Component
public interface AfdelingRepository extends CrudRepository<Afdeling, Long>{
}







