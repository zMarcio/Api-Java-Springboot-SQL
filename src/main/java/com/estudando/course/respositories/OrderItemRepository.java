package com.estudando.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
