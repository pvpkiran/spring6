package com.example.spring6.service;

import com.example.spring6.model.Todo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

@HttpExchange(accept = "application/json", contentType = "application/json")
public interface TodoClient {

    @GetExchange("/")
    List<Todo> getAll();

    @PostExchange("/spring6")
    String putTodo(@RequestBody Todo todo);
}
