package com.SpringBoot.Rest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Component
public class CustomerAddress
{
	@Id
	@GeneratedValue
	private int id;

	private String city;
	
	private String state;
	
	private String country;
}
