package com.thoughtworks.todo_v1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<ToDoNote, Long> {
}
