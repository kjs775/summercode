package com.todo.dto;

import java.util.Date;

import com.todo.vo.TodoVO;

public class TodoDTO {
	private String todoId;
	private String title;
	private String content;
	private int priority;
	private int deadline;
	private Date startDate;
	private Date endDate;
	private String statusId;
	public TodoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TodoDTO(String todoId, String title, String content, int priority, int deadline, Date startDate,
			Date endDate, String statusId) {
		super();
		this.todoId = todoId;
		this.title = title;
		this.content = content;
		this.priority = priority;
		this.deadline = deadline;
		this.startDate = startDate;
		this.endDate = endDate;
		this.statusId = statusId;
	}

	public String gettodoId() {
		return todoId;
	}
	public void settodoId(String todoId) {
		this.todoId = todoId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getstatusId() {
		return statusId;
	}
	public void setstatusId(String statusId) {
		this.statusId = statusId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "TodoDTO [todoId=" + todoId + ", title=" + title + ", content=" + content + ", priority=" + priority
				+ ", deadline=" + deadline + ", startDate=" + startDate + ", endDate=" + endDate + ", statusId="
				+ statusId + "]";
	}
	
	
	public TodoVO toVO(){
		TodoVO vo = null;
		boolean res = false;
		if(deadline == 1){
			res = true;
		}
		vo = new TodoVO(todoId, title, content, priority, res, startDate, endDate, statusId);
		return vo;
	}
	
	
}
