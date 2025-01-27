package com.example.SpringBootTodo.controller;

import com.example.SpringBootTodo.model.Todo;
import com.example.SpringBootTodo.service.TodoService;
import com.example.SpringBootTodo.service.impl.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoServiceImpl todoService;

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoService.getTodoList();
    }

    @PostMapping("/todos")
    public Todo addATodo(@RequestBody Todo todo){
        return todoService.addTodo(todo);
    }

    @PutMapping("todos/{id}")
    public Todo uodateTodo(@RequestBody Todo todo){
        return  todoService.editTodo(todo);
    }
}
