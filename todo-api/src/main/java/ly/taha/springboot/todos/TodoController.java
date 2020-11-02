package ly.taha.springboot.todos;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {
		
		private List<Todo> data = Arrays.asList(
				new Todo(1, "First todo", "This is my first task"),
				new Todo(2, "second todo", "This is my second task"),
				new Todo(3, "third todo", "This is my third task"),
				new Todo(4, "Forth todo", "This is my Forth task"),
				new Todo(5, "Fifth todo", "This is my Fifth task")
				);
	
		@GetMapping(value = {"", "/"})
		public List<Todo> listTodos(){
			return data;
		}

		public List<Todo> getData() {
			return data;
		}

		public void setData(List<Todo> data) {
			this.data = data;
		}	
}
