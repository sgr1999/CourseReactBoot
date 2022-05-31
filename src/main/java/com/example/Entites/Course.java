package com.example.Entites;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    public Course(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    
    
    public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    @Override
    public String toString() {
        return "Course [description=" + description + ", id=" + id + ", title=" + title + "]";
    }

    
}
