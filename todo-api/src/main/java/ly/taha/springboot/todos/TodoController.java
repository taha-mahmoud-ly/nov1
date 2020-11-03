package ly.taha.springboot.todos;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping(value = {"", "/"})
	public List<Todo> getAllTodos(){
		return todoService.findAll();
	}
		
	@GetMapping("/{id}")
	public Todo getTodoById(@PathVariable String id) {
		return todoService.getById(id);
	}
	
	@PostMapping(value = {"","/"})
	public Todo createNewTodo(@RequestBody @Valid Todo todo) {
		return todoService.save(todo);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable String id) {
		todoService.delete(id);
	}
}	
