package com.SpringBoot.Rest.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Rest.dao.StudentRepositry;
import com.SpringBoot.Rest.dto.Student;

@RestController
public class StudentController
{
	@Autowired
	private StudentRepositry studentRepositry;

	@PutMapping(path = "/updateAddress/{id}")
	public List<Student> updateStudentAddress(@RequestBody Student student, @PathVariable(value = "id") int id)
	{
		studentRepositry.updateAddress(student.getAddress(), id);
		return studentRepositry.findAll();
	}
}
