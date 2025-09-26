package jp.co.athub.todo;

import java.time.LocalDate;

public class Todo {
    private final Long id;
    private final String title;
    private final String day; //`日付をベタがきから変更
    private final String name;  //人名をベタガキから変更

    public Todo(Long id, String title,String day, String name ) {
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

    public String getDay() {
        return day;
    }

    public  String getName() {
        return name;
    }
}
