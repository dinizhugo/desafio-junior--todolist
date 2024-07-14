package com.hugodiniz.todolist.service;

import com.hugodiniz.todolist.dto.TodoRequest;
import com.hugodiniz.todolist.entity.Todo;
import com.hugodiniz.todolist.exceptions.TodoNotFoundException;
import com.hugodiniz.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public Todo createNewTodo(TodoRequest data) {
        var todo = data.toTodo();
        return repository.save(todo);
    }

    public List<Todo> getTodos() {
        List<Todo> list = repository.findAll().stream().sorted(
                (t1,t2) -> t1.getPriority().getId().compareTo(t2.getPriority().getId()))
                .toList();
        return list;
    }

    public Todo updateTodo(Long id, TodoRequest data) {
        var currentTodo = repository.findById(id).orElseThrow(() -> new TodoNotFoundException("Todo not found."));
        var todo = data.toTodo();
        todo.setId(currentTodo.getId());

        return repository.save(todo);
    }

    public void deleteTodo(Long id) {
        var todo = repository.findById(id).orElseThrow(() -> new TodoNotFoundException("Todo not found."));

        repository.delete(todo);
    }
}
