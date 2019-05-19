package com.todo.bean;

import java.util.Date;

import com.todo.dto.TodoDTO;
import com.todo.vo.TodoVO;

public class TodoBean {
	private String todoId;
	private String title;
	private String contents;
	private int priority;
	private boolean deadline;
	private Date startDate;
	private Date endDate;
	private String statusId;
	public TodoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TodoBean(String todoId) {
		super();
		this.todoId = todoId;
	}

	public TodoBean(String todoId, String title, String contents, int priority, boolean deadline, Date startDate,
			Date endDate, String statusId) {
		super();
		this.todoId = todoId;
		this.title = title;
		this.contents = contents;
		this.priority = priority;
		this.deadline = deadline;
		this.startDate = startDate;
		this.endDate = endDate;
		this.statusId = statusId;
	}

	public String getTodoId() {
		return todoId;
	}

	public void setTodoId(String todoId) {
		this.todoId = todoId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
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
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
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
		TodoBean other = (TodoBean) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
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
		return "TodoBean [todoId=" + todoId + ", title=" + title + ", contents=" + contents + ", priority=" + priority
				+ ", deadline=" + deadline + ", startDate=" + startDate + ", endDate=" + endDate + ", statusId="
				+ statusId + "]";
	}
	
	public TodoVO toVO(){
		TodoVO vo = null;
		
		vo = new TodoVO(todoId, title, contents, priority, deadline, startDate, endDate, statusId);
		return vo;
	}	
}
