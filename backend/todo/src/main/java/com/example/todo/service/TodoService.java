package com.example.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import main.java.com.example.todo.model.Todo;
import main.java.com.example.todo.repository.TodoRepository;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository repository;

    public List<Todo> findAll() {
        return repository.findAll();
    }

    public Todo findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    public Todo create(Todo todo) {
        return repository.save(todo);
    }

    public Todo update(Long id, Todo todoDetails) {
        Todo todo = findById(id);
        todo.setTitle(todoDetails.getTitle());
        todo.setDescription(todoDetails.getDescription());
        todo.setCompleted(todoDetails.isCompleted());
        return repository.save(todo);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
