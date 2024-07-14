package com.hugodiniz.todolist.entity;

public enum TodoPriority {
    MAXIMUM(1L),
    COMMON(2L),
    MINIMUM(3L);
    
    private Long id;
    
    private TodoPriority(Long id) {
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
}
