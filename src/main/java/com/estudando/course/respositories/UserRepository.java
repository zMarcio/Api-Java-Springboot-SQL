package com.estudando.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudando.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
