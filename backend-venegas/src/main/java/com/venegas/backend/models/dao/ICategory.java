package com.venegas.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.venegas.backend.models.entities.Category;

public interface ICategory extends CrudRepository<Category,Long> {

}
