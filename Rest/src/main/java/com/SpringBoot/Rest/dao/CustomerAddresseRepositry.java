package com.SpringBoot.Rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.SpringBoot.Rest.dto.CustomerAddress;

@RepositoryRestResource(collectionResourceRel = "customerAddress", path = "customerAddress")
public interface CustomerAddresseRepositry extends JpaRepository<CustomerAddress, Integer>
{
	
}
