package com.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.bean.TodoBean;
@Service
public interface TodoService {
	public TodoBean createTodo(TodoBean todoBean);
	public TodoBean deleteTodo(TodoBean todoBean);
	public TodoBean[] deleteTodo(String[] todoId);
	public List<TodoBean> updatePriority(String[] todoId);
	public TodoBean[] updateTodo(TodoBean[] todoBean);
	public TodoBean updateTodo(TodoBean todoBean);
	public List<TodoBean> getTodoList();
	public List<TodoBean> getCompleteTodo();
	public List<TodoBean> getOverDeadlineTodo();
	public TodoBean getTodo(String todoId);
}
