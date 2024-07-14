package com.hugodiniz.todolist.controller;

import com.hugodiniz.todolist.dto.TodoRequest;
import com.hugodiniz.todolist.entity.Todo;
import com.hugodiniz.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping
    public ResponseEntity<Todo> createNewTodo(@RequestBody @Valid TodoRequest data) {
        var obj = service.createNewTodo(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getTodos() {
        var obj = service.getTodos();
        return ResponseEntity.ok(obj);
    }

    @PutMapping("{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody @Valid TodoRequest data) {
        var obj = service.updateTodo(id,data);

        return ResponseEntity.ok(obj);
    }
}
