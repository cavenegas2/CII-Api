package com.venegas.backend.models.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.venegas.backend.models.dao.IStudent;
import com.venegas.backend.models.entities.Student;
import com.venegas.backend.services.interfaces.IStudentService;

@Service
public class StudentService implements IStudentService {
	
	
	@Autowired
	private IStudent dao;

	@Override
	@Transactional
	public void save(Student s) {
		// TODO Auto-generated method stub
		dao.save(s);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>)dao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Student s = this.findById(id);
		dao.delete(s);
		
	}

}
