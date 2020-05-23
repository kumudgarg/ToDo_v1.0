package com.thoughtworks.todo_v1;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<ToDoNote> getAllToDoNotes() {
        return todoRepository.findAll();
    }
}
