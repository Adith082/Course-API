package com.example.courseapi.course;

import com.example.courseapi.topic.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;
    public Course(){

    }
    public Course(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
