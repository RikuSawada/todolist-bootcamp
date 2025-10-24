package jp.co.athub.todo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoMapper todoMapper;

    public TodoService(TodoMapper TodoMapper){
        this.todoMapper = TodoMapper;
    }

    public List<Todo> findAll() {
        return todoMapper.findAll();
    }
}
