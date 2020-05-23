package com.thoughtworks.todo_v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<ToDoNote> getAllToDoNotes() {
        return todoRepository.findAll();
    }
}
