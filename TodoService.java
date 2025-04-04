package com.example.ToDo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ToDo.entity.Todo;
import com.example.ToDo.repository.TodoRepository;

@Service
public class TodoService {
	
	private final TodoRepository repo;
	
	public TodoService(TodoRepository repo) {
		this.repo = repo;
	}
	public List<Todo> getAllTodos(){
		return repo.findAll();
	}
		
	public Todo saveTodo(Todo todo) {
		return repo.save(todo);
	}
	
	public void deleteTodoById(Long id) {
		repo.deleteById(id);
	}
	

}
