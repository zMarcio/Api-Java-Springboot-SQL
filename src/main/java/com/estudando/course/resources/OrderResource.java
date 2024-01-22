package com.estudando.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudando.course.entities.Order;
import com.estudando.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAllOrders() {
		return ResponseEntity.ok().body(orderService.findAllOrders());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findByIdOrder(@PathVariable Long id) {
		return ResponseEntity.ok().body(orderService.findById(id));
	}
	
//	@PostMapping(value = "/test")
//	public ResponseEntity<Order> postMethodName(@RequestBody Order p) {
//		Order o = new Order(null, null, null)
//		
//		return entity;
//	}
	
	
	
}
