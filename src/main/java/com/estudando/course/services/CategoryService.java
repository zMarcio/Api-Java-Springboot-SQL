package com.estudando.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.course.entities.Category;
import com.estudando.course.respositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAllCategory(){
		return categoryRepository.findAll();
	}
	
	public Category findByIdCategory(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
	}
	
}
