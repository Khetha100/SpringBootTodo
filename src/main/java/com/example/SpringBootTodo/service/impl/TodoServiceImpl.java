package com.example.SpringBootTodo.service.impl;

import com.example.SpringBootTodo.model.Todo;
import com.example.SpringBootTodo.repository.TodoRepository;
import com.example.SpringBootTodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl  implements TodoService {

    @Autowired
    TodoRepository todoRepository;

    @Override
    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    @Override
    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo editTodo(Todo todo) {
        Todo myTodo =  todoRepository.findById(todo.getId()).orElse(null);
        if(myTodo != null){
            myTodo.setDescription(todo.getDescription());
            myTodo.setDone(todo.isDone());
        }
        return myTodo;

    }
}
