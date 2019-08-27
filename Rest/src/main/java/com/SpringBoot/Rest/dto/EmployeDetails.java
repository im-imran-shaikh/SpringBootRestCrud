package com.SpringBoot.Rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeDetails
{
	@Id
	@GeneratedValue
	@Column(name = "EmpID")
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Technology")
	private String tech;
}
