package com.SpringBoot.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.SpringBoot.Rest.service.EmployeService;
import com.SpringBoot.Rest.service.EmployeServiceImpl;

@SpringBootApplication
public class RestApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(RestApplication.class, args);
	}
}
