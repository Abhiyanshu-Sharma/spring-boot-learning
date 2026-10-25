package com.isrdc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.isrdc.dtos.ToDoDto;
import com.isrdc.services.ToDoService;

@Controller
public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;
	
	@GetMapping("/todo/{id}")
	public String fetchToDos(@PathVariable("id") Integer id, Model model) {
		
		ToDoDto todos = toDoService.fetchToDo(id);
		
		model.addAttribute("todos", todos);
		
		return "todos.html";
	}
	
	@GetMapping("/all-todos")
	public String fetchAllToDos(Model model) {
		
		ToDoDto[] todos = toDoService.collectAllDtos();
		
		model.addAttribute("todos", todos);
		
		return "todos.html";
	}
}
