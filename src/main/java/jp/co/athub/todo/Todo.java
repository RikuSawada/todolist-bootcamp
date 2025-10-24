package jp.co.athub.todo;

import java.util.Date;

public class Todo {
    private Long id;
    private String title;
    private Date day;
    private String name;

    public Todo(Long id, String title,Date day, String name ) {
        this.id = id;
        this.title = title;
        this.day = day;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDay() {
        return day;
    }

    public  String getName() {
        return name;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public void setName(String name) {
        this.name = name;
    }
}
