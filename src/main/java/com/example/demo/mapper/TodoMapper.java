package com.example.demo.mapper;

import com.example.demo.model.Todo;
import org.apache.coyote.http11.filters.VoidOutputFilter;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("select * from todo")
    public List<Todo> findAll();

    @Select("SELECT * FROM todo WHERE id = #{id}")
    public Todo findById(long id);

    @Insert("INSERT INTO todo (text, done) VALUES (#{todo.text}, #{todo.done})")
    void add(@Param("todo") Todo todo);
}
