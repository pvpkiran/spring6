package com.example.spring6.model;

import lombok.Data;

@Data
public class Todo {
    int userId;
    int id;
    String title;
    boolean completed;
}
