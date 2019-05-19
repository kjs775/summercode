package com.todo.vo;

import java.util.Date;

import com.todo.bean.TodoBean;
import com.todo.dto.TodoDTO;

public class TodoVO {
	public String todoId;
	public String title;
	public String content;
	public int priority;
	public boolean deadline;
	public Date startDate;
	public Date endDate;
	public String statusId;
	public TodoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TodoVO(String todoId) {
		super();
		this.todoId = todoId;
	}

	public TodoVO(String todoId, String title, String content, int priority, boolean deadline, Date startDate,
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
		todoId = todoId;
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
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public boolean isDeadline() {
		return deadline;
	}
	public void setDeadline(boolean deadline) {
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
	public String getstatusId() {
		return statusId;
	}
	public void setstatusId(String statusId) {
		this.statusId = statusId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + (deadline ? 1231 : 1237);
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + priority;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((todoId == null) ? 0 : todoId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoVO other = (TodoVO) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (deadline != other.deadline)
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (priority != other.priority)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (statusId == null) {
			if (other.statusId != null)
				return false;
		} else if (!statusId.equals(other.statusId))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (todoId == null) {
			if (other.todoId != null)
				return false;
		} else if (!todoId.equals(other.todoId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TodoVO [todoId=" + todoId + ", title=" + title + ", content=" + content + ", priority=" + priority
				+ ", deadline=" + deadline + ", startDate=" + startDate + ", endDate=" + endDate + ", statusId="
				+ statusId + "]";
	}
	public TodoBean toBean(){
		TodoBean bean = null;
		bean = new TodoBean(todoId, title, content, priority, deadline, startDate, endDate, statusId);
		return bean;
	}
	
	public TodoDTO toDTO(){
		TodoDTO dto = null;
		int res = 0;
		if(deadline == true){
			res = 1;
		}
		dto = new TodoDTO(todoId, title, content, priority, res, startDate, endDate, statusId);
		return dto;
	}
	
	
	
}
