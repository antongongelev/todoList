package com.todo.service;

import com.todo.dto.TodoDto;
import com.todo.entity.TodoEntity;
import com.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    public Iterable<TodoEntity> getTodos() {
        return todoRepo.findAll();
    }

    public void postTodo(TodoDto todoDto) {
        TodoEntity entity = TodoEntity.builder()
                .created(new Date())
                .isDone(false)
                .title(todoDto.getTitle())
                .build();

        todoRepo.save(entity);
    }

    public void putTodo(TodoDto todoDto) {
        TodoEntity entity = TodoEntity.builder()
                .id(todoDto.getId())
                .created(todoDto.getCreated())
                .isDone(todoDto.getIsDone())
                .title(todoDto.getTitle())
                .build();

        todoRepo.save(entity);
    }

    public Optional<TodoEntity> getTodo(Long id) {
        return todoRepo.findById(id);
    }

    public void removeTodo(Long id) {
        todoRepo.deleteById(id);
    }
}
