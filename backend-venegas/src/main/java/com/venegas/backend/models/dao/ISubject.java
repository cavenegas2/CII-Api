package com.venegas.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.venegas.backend.models.entities.Subject;

public interface ISubject extends CrudRepository<Subject,Long> {

}
