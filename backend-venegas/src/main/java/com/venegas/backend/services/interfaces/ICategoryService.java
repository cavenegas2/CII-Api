package com.venegas.backend.services.interfaces;

import java.util.List;

import com.venegas.backend.models.entities.Category;

public interface ICategoryService {

	
	public  void save(Category c);
	public List<Category> findAll();
	public Category findById(Long id);
	public void delete(Long id);

}
