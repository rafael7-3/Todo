package com.webapp.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "Sapo", "Comer", LocalDate.now().plusDays(2), false));
		todos.add(new Todo(2, "Sapo", "Comer", LocalDate.now().plusDays(3), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
}
