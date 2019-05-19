package com.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.bean.TodoBean;
import com.todo.dto.TodoDTO;
import com.todo.mapper.TodoMapper;
import com.todo.vo.TodoVO;
@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoMapper todoMapper;
	
	public TodoBean createTodo(TodoBean todoBean) {
		// TODO Auto-generated method stub
		TodoVO vo = todoBean.toVO();
		TodoDTO dto = vo.toDTO();
		todoMapper.createTodo(dto);
		return todoBean;
	}

	public TodoBean deleteTodo(TodoBean todoBean) {
		// TODO Auto-generated method stub
		TodoVO vo = todoBean.toVO();
		TodoDTO todoDTO = vo.toDTO();
		todoMapper.deleteTodo(todoDTO);
		return todoBean;
	}

	public TodoBean[] deleteTodo(String[] todoIds) {
		// TODO Auto-generated method stub
		todoMapper.deleteTodos(todoIds);
		return null;
	}

	public List<TodoBean> updatePriority(String[] todoIds) {
		// TODO Auto-generated method stub
		TodoDTO[] dto = new TodoDTO[todoIds.length];
		for(int i=0; i<todoIds.length; i++){
			dto[i] = new TodoDTO();
			dto[i].settodoId(todoIds[i]);
			dto[i].setPriority(i+1);
			todoMapper.updatePriority(dto[i]);
		}
		List<TodoDTO> listDTO = todoMapper.getTodoList();
		List<TodoBean> listBean = new ArrayList<TodoBean>();
		for(int i=0; i<listDTO.size(); i++){
			listBean.add(listDTO.get(i).toVO().toBean());
		}
		
		return listBean;
	}

	public TodoBean[] updateTodo(TodoBean[] todoBean) {
		// TODO Auto-generated method stub
		return null;
	}

	public TodoBean updateTodo(TodoBean todoBean) {
		// TODO Auto-generated method stub
		TodoVO vo = todoBean.toVO();
		TodoDTO todoDTO = vo.toDTO();
		todoMapper.updateTodo(todoDTO);
		return null;
	}

	public List<TodoBean> getTodoList() {
		// TODO Auto-generated method stub
		List<TodoDTO> dtoList = todoMapper.getTodoList();
		List<TodoBean> beanList = new ArrayList<TodoBean>();
		for(int i=0; i<dtoList.size(); i++){
			beanList.add(dtoList.get(i).toVO().toBean());
		}
		return beanList;
	}

	public List<TodoBean> getCompleteTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TodoBean> getOverDeadlineTodo() {
		// TODO Auto-generated method stub
		return null;
	}

	public TodoBean getTodo(String todoId) {
		// TODO Auto-generated method stub
		TodoDTO todoDTO = todoMapper.getTodo(todoId);
		TodoVO todoVO = todoDTO.toVO();
		TodoBean todoBean = todoVO.toBean();
		return todoBean;
	}
	
	private String createTodoId(){
		String id = null;
		
		return id;
	}

}
