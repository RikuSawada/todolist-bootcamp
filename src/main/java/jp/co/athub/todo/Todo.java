package jp.co.athub.todo;

import java.time.LocalDate;

public class Todo {
    private final Long id;
    private final String title;

    public Todo(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
