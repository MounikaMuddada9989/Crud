package com.example.ToDo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ToDo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo,Long> {
	
	
	
}
