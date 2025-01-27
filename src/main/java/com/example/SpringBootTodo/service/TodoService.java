package com.example.SpringBootTodo.service;

import com.example.SpringBootTodo.model.Todo;

import java.util.List;

public interface TodoService {

    public List<Todo> getTodoList();

    public Todo addTodo(Todo todo);

    public Todo editTodo(Todo todo);
}
