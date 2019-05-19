package com.todo.mapper;

import java.util.List;

import com.todo.dto.TodoDTO;

public interface TodoMapper {

	public void createTodo(TodoDTO todoDTO);
	public void deleteTodo(TodoDTO todoDTO);
	public void deleteTodos(String[] todoIds);
	public void updateTodo(TodoDTO todoDTO);
	public void updatePriority(TodoDTO todoDTO);
	public List<TodoDTO> getTodoList();
	public TodoDTO getTodo(String todoId);
}
