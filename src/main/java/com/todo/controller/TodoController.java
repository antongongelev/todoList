package com.todo.controller;

import com.todo.dto.TodoDto;
import com.todo.entity.TodoEntity;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "todo/")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping()
    public Iterable<TodoEntity> getTodos() {
        return todoService.getTodos();
    }

    @GetMapping("/{id}")
    public Optional<TodoEntity> getTodo(@PathVariable Long id) {
        return todoService.getTodo(id);
    }

    @PostMapping()
    public void postTodo(@RequestBody TodoDto todoDto) {
        todoService.postTodo(todoDto);
    }

    @PutMapping
    public void putTodo(@RequestBody TodoDto todoDto) {
        todoService.putTodo(todoDto);
    }

    @PostMapping("/{id}")
    public void removeTodo(@PathVariable Long id) {
        todoService.removeTodo(id);
    }
}
