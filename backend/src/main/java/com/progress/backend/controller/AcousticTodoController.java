package com.progress.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.progress.backend.dto.TodoAcousticRequestDTO;
import com.progress.backend.dto.TodoAcousticResponseDTO;
import com.progress.backend.service.AcousticTodoService;

@RestController
@RequestMapping("/api/acoustic-todos")
@CrossOrigin(origins = "http://localhost:4200")
public class AcousticTodoController {

    private final AcousticTodoService acousticTodoService;

    public AcousticTodoController(AcousticTodoService acousticTodoService) {
        this.acousticTodoService = acousticTodoService;
    }

    @GetMapping
    public List<TodoAcousticResponseDTO> getAllTodos() {
        return acousticTodoService.getAllTodos();
    }

    @PostMapping
    public TodoAcousticResponseDTO createTodo(
            @RequestBody TodoAcousticRequestDTO dto) {

        return acousticTodoService.createTodo(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        acousticTodoService.deleteTodo(id);
    }
}