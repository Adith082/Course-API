package com.example.courseapi.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Topic {
    @Id
    private String id;
    private String name;
    private String description;

    public Topic(){

    }
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
