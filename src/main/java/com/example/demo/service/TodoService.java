package com.example.demo.service;

import com.example.demo.mapper.TodoMapper;
import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoMapper todoMapper;

    public TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public List<Todo> getAll() {
        return todoMapper.findAll();
    }

    public void create(Todo todo) {
        todoMapper.add(todo);
    }

    public Todo update(Integer todoId, Todo todoUpdate) {
        Todo todo = todoMapper.findById(todoId);
        if (todoUpdate.getText() != null) {
            todo.setText(todoUpdate.getText());
        }
        if (todoUpdate.getDone() != null) {
            todo.setDone(todoUpdate.getDone());
        }
        return todo;
    }

}