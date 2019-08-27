package com.SpringBoot.Rest.service;

import java.util.List;

import com.SpringBoot.Rest.dto.EmployeDetails;

public interface EmployeService
{
	List<EmployeDetails> getAllEmploye();
	List<EmployeDetails> deleteEmploye(int id);
}
