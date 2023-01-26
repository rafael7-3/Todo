package com.webapp.todolist;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	private String listAllTodos(ModelMap model ) {
		List<Todo> todos = todoService.findByUsername("Sapo");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
}
