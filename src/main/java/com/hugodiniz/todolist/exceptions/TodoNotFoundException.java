package com.hugodiniz.todolist.exceptions;

public class TodoNotFoundException extends RuntimeException{
    public TodoNotFoundException(String msg) {
        super(msg);
    }
}
