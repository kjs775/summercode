package todoProject;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.todo.bean.TodoBean;
import com.todo.service.TodoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( "file:src/main/webapp/WEB-INF/root-context.xml")
public class Testtest {
	
	
	@Autowired
	TodoService service;
	
	Date d = new Date();
	String todoId = "";
	String title = "번 제목";
	String content = "번 내용";
	int priority = 1;
	TodoBean todoBean = new TodoBean("", "번 제목", "번 내용", 1, false, d, d, "1");
	
	/*@Test
	public void craeteTodo(){
		
		for(int i=1; i<=10; i++){
			service.createTodo(new TodoBean(i+todoId, i+title, i+content, priority++, false, d, d, "1"));
		}
	}*/

	/*@Test
	public void deleteTodo(){
		service.deleteTodo(todoBean);
	}*/
	
	/*@Test
	public void deleteTodos(){
		service.deleteTodo(new String[]{"10","9"});
	}*/
	
	/*@Test
	public void updatePriority(){
		service.updatePriority(new String[]{"5","2","1","3","4","6","7", "8", "9"});
	}*/
	
	/*@Test
	public void updateTodo(){
		service.updateTodo(service.createTodo(new TodoBean(9+todoId, 9+title, 9+content, 9, false, d, d, "1")));
	}*/
	
	/*@Test
	public void getTodo(){
		TodoBean todoBean = service.getTodo("1");
		System.out.println(todoBean);
	}*/
	
}
