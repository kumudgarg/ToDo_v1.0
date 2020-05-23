package com.thoughtworks.todo_v1.service;

import com.thoughtworks.todo_v1.model.ToDoNote;
import com.thoughtworks.todo_v1.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<ToDoNote> getAllToDoNotes() {
        return todoRepository.findAll();
    }
}
