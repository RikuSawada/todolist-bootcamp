package jp.co.athub.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    public List<Todo> findAll() {
        return List.of(
            new Todo(1L, "Sample Todo 1", "2025/08/21","`石破茂"),
            new Todo(2L, "Sample Todo 2", "2025/08/22","`小泉進次郎")
        );
    }
}
