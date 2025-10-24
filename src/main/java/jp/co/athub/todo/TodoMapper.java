package jp.co.athub.todo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TodoMapper {
    @Select("SELECT * FROM todos")
    List<Todo> findAll();
}
