package com.estudando.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudando.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
