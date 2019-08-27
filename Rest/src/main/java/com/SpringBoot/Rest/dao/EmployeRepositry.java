package com.SpringBoot.Rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Rest.dto.EmployeDetails;

@Repository
public interface EmployeRepositry extends JpaRepository<EmployeDetails, Integer>
{

}
