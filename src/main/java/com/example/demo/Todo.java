package com.example.demo;

import java.time.LocalDate;

public class Todo {
    private final Long id;
    private final String title;
    private final LocalDate date;
    private final String assignee;

    public Todo(Long id, String title) {
        this(id, title, null, null);
    }

    public Todo(Long id, String title, LocalDate date, String assignee) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.assignee = assignee;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getAssignee() {
        return assignee;
    }
}
