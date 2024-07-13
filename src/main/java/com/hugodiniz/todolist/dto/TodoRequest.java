package com.hugodiniz.todolist.dto;

import com.hugodiniz.todolist.entity.TodoPriority;
import jakarta.validation.constraints.NotBlank;

public record TodoRequest(@NotBlank String name, String description, boolean status, TodoPriority priority) {
}
