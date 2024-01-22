package com.estudando.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.course.entities.Product;
import com.estudando.course.respositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAllProducts(){
		return productRepository.findAll();
	}
	public Product findByIdProduct(Long id) {
		Optional<Product> product = productRepository.findById(id);
		return product.get();
	}
}
