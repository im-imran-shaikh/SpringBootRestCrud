package com.SpringBoot.Rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "FullName")
	private String name;
	
	private String address;
}
