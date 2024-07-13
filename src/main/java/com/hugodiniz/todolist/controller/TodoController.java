package com.hugodiniz.todolist.controller;

import com.hugodiniz.todolist.dto.TodoRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/todo")
    public class TodoController {

        @PostMapping
        public ResponseEntity<?> createNewTodo(@Valid TodoRequest data) {

        }
}
