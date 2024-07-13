package com.hugodiniz.todolist.service;

import com.hugodiniz.todolist.dto.TodoRequest;
import com.hugodiniz.todolist.entity.Todo;
import com.hugodiniz.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public Todo createNewTodo(TodoRequest data) {
        var todo = data.toTodo();
        return repository.save(todo);
    }
}
