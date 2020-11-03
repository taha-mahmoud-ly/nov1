package ly.taha.springboot.todos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todos")
public class Todo {
	@Id
	private String id;
	
	@NotNull(message = "Title is required")
	@Size (min = 5, max = 9 , message = "Title must be at least 5 characters long")
	private String title;
	
	@NotNull(message = "Description is required")
	@Size(min = 10, max = 13, message="description must be 10 to 13 letters long")
	private String description;
	
	private long timestamp;
	
	
	public Todo() {
		this.timestamp = System.currentTimeMillis();
	}
	public Todo(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}	

}
