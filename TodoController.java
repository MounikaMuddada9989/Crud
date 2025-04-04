package com.example.ToDo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDo.entity.Todo;
import com.example.ToDo.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
	private final TodoService service;
	
	public TodoController( TodoService service) {
		this.service = service;	
	}	
	@GetMapping
		List<Todo>getTodos(){
		return service.getAllTodos();
	}
  
	@PostMapping
	public Todo saveTodo(@RequestBody Todo todo) {
		return service.saveTodo(todo);
	}
	
	@DeleteMapping
	public void deleteTodo(@PathVariable Long id) {
		service.deleteTodoById(id);
	}
}
