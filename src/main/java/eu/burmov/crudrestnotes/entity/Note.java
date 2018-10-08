package eu.burmov.crudrestnotes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "notes")
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	@NotNull(message = "Note title is required")
	@Size(min = 2, max = 15, message = "Note title must be {min}-{max} characters")
	private String title;
	
	@Column(name = "content")
	@NotNull(message = "Note content is required")
	@Size(min = 3, max = 500, message = "Note content must be {min}-{max} characters")
	private String content;
	
	// Constructors
	public Note() {}
	public Note(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	// Getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

}
