package com.estudando.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudando.course.entities.Product;
import com.estudando.course.services.ProductService;


@RestController
@RequestMapping(value = "/product")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getMethodName() {
		return ResponseEntity.ok().body(productService.findAllProducts());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> getMethodName(@PathVariable Long id) {
		return ResponseEntity.ok().body(productService.findByIdProduct(id));
	}
	
	
	
}
