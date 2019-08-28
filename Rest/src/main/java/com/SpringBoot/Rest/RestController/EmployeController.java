package com.SpringBoot.Rest.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Rest.dto.EmployeDetails;
import com.SpringBoot.Rest.service.EmployeService;

@RestController
public class EmployeController
{
	@Autowired
	private EmployeService employeService;
	
	@GetMapping(path = "/getAllEmploye")
	public List<EmployeDetails> getAllEmployes()
	{
		return employeService.getAllEmploye();
	}
	
	@DeleteMapping(path = "/deleteEmploy/{id}")
	public List<EmployeDetails> deleteEmployeById(@PathVariable int id)
	{
		return employeService.deleteEmploye(id);
	}
}
