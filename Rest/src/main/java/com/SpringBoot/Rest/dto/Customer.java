package com.SpringBoot.Rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Entity
@Data
public class Customer
{
	@Id
	@GeneratedValue
	@Column(name = "CustomerID")
	private int id;
	
	@Column(name = "CustomerName")
	private String name;
	
	@Autowired
	@OneToOne
	private CustomerAddress address;
	
}
