package com.venegas.backend.services.interfaces;

import java.util.List;

import com.venegas.backend.models.entities.Student;

public interface IStudentService {
	
	public  void save(Student s);
	public List<Student> findAll();
	public Student findById(Long id);
	public void delete(Long id);

}
