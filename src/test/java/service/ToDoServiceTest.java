package service;

import com.thoughtworks.todo_v1.ToDoNote;
import com.thoughtworks.todo_v1.TodoRepository;
import com.thoughtworks.todo_v1.TodoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ToDoServiceTest {

    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void shouldReturnAllToDoNoteWhenARequestMakesToGetAllTodos() {
        List<ToDoNote> toDoNotes = new ArrayList<>();
        ToDoNote toDoNote = new ToDoNote();
        toDoNotes.add(toDoNote);
        when(todoRepository.findAll()).thenReturn(toDoNotes);
        List<ToDoNote> notes = todoService.getAllToDoNotes();
        assertEquals(1, notes.size());

    }
}
