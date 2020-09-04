package com.example.demo.mapper;

import com.example.demo.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("select * from todos")
    public List<Todo> findAll();

    @Select("SELECT * FROM todos WHERE id = #{id}")
    public Todo findById(long id);
}
