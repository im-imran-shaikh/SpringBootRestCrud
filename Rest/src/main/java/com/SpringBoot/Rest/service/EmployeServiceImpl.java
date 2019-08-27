package com.SpringBoot.Rest.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SpringBoot.Rest.dao.EmployeRepositry;
import com.SpringBoot.Rest.dto.EmployeDetails;

@Service
public class EmployeServiceImpl implements EmployeService
{
	@Autowired
	private EmployeRepositry employeRepositry;
	
	@Override
	public List<EmployeDetails> getAllEmploye()
	{
		return employeRepositry.findAll();
	}

	@Override
	public List<EmployeDetails> deleteEmploye(int id)
	{
		employeRepositry.deleteById(id);
		return employeRepositry.findAll();
	}

}
