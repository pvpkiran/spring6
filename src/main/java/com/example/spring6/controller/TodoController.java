package com.example.spring6.controller;

import com.example.spring6.model.Todo;
import com.example.spring6.service.TodoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoClient todoClient;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoClient.getAll();
    }

    @PostMapping
    public String addTodo(@RequestBody Todo todo) {
        return todoClient.putTodo(todo);
    }
}