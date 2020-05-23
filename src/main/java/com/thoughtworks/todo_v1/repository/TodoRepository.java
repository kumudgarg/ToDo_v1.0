package com.thoughtworks.todo_v1.repository;

import com.thoughtworks.todo_v1.model.ToDoNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<ToDoNote, Long> {
}
