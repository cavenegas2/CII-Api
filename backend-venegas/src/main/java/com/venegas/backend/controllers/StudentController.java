package com.venegas.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venegas.backend.models.entities.Student;
import com.venegas.backend.services.interfaces.IStudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	
	@GetMapping("/{id}")
	public Student retrive(@PathVariable(name="id") Long id){
		return service.findById(id);	
	}
	
	@GetMapping("")
	public List<Student> list(){
		return service.findAll();	
	}
	
	@PostMapping("")
	public Student create(@RequestBody Student student) {
		service.save(student);
		return student;
	}

}
