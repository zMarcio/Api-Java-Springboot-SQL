package com.estudando.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudando.course.entities.Category;
import com.estudando.course.services.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAllCategory(){
		return ResponseEntity.ok().body(categoryService.findAllCategory());
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findByIdCategory(@PathVariable Long id){
		return ResponseEntity.ok().body(categoryService.findByIdCategory(id));
	}

}
