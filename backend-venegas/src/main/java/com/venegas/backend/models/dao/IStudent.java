package com.venegas.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.venegas.backend.models.entities.Student;

public interface IStudent extends CrudRepository<Student,Long> {

}
