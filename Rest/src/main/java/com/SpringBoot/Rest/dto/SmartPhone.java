package com.SpringBoot.Rest.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class SmartPhone
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "SmartPhone_Brand")
	private String brand;
	
	@Column(name = "SmartPhone_Spec")
	private String spec;
	
	@Column(name = "smartPhone_Price")
	private int price;
}
