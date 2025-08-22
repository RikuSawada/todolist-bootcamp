package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    public List<Todo> findAll() {
        return List.of(
            new Todo(1L, "Sample Todo 1", LocalDate.now(), "Alice"),
            new Todo(2L, "Sample Todo 2")
        );
    }
}
