package com.SpringBoot.Rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBoot.Rest.dto.Student;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepositry extends JpaRepository<Student, Integer>
{
	@Modifying
	@Query("UPDATE Student SET address = ?1 WHERE id = ?2")
	@Transactional
	void updateAddress(String address,	int id);
}
