package com.venegas.backend.models.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venegas.backend.models.dao.ICategory;
import com.venegas.backend.models.entities.Category;
import com.venegas.backend.services.interfaces.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	
	@Autowired
	private ICategory dao;

	@Override
	public void save(Category c) {
		// TODO Auto-generated method stub
		dao.save(c);
		
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>)dao.findAll();
	}

	@Override
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Category c = this.findById(id);
		dao.delete(c);
		
	}

}
