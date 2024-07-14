package com.hugodiniz.todolist.dto;

import com.hugodiniz.todolist.entity.Todo;
import com.hugodiniz.todolist.entity.TodoPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record TodoRequest(@NotBlank(message = "Name is mandatory") String name,
                          String description,
                          @NotNull(message = "status is mandatory") Boolean status,
                          @NotNull(message = "priority is mandatory")
                          @Pattern(regexp = "(?i)^(MAXIMUM|COMMON|MINIMUM)$", message = "Priority must be MAXIMUM, COMMON, or MINIMUM")
                          String priority) {

    public Todo toTodo() {
        return new Todo(name, description, status, TodoPriority.valueOf(priority.toUpperCase()));
    }
}
