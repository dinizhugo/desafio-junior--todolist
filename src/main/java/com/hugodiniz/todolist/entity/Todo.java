package com.hugodiniz.todolist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Boolean status;

    @Enumerated(EnumType.STRING)
    private TodoPriority priority;

    public Todo() {
    }

    public Todo(Long id, String name, String description, boolean status, TodoPriority priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Todo(String name, String description, boolean status, TodoPriority priority) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TodoPriority getPriority() {
        return priority;
    }

    public void setPriority(TodoPriority priority) {
        this.priority = priority;
    }
}
