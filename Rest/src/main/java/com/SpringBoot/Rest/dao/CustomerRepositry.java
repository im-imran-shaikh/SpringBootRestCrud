package com.SpringBoot.Rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Rest.dto.Customer;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepositry extends JpaRepository<Customer, Integer>
{

}
