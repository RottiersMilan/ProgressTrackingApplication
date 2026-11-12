package com.progress.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.progress.backend.dto.TodoAcousticRequestDTO;
import com.progress.backend.dto.TodoAcousticResponseDTO;
import com.progress.backend.entity.AcousticTodo;
import com.progress.backend.entity.Song;
import com.progress.backend.repository.AcousticTodoRepository;
import com.progress.backend.repository.SongRepository;

@Service
public class AcousticTodoService {

    private final AcousticTodoRepository acousticTodoRepository;
    private final SongRepository songRepository;

    public AcousticTodoService(
            AcousticTodoRepository acousticTodoRepository,
            SongRepository songRepository) {

        this.acousticTodoRepository = acousticTodoRepository;
        this.songRepository = songRepository;
    }

    private TodoAcousticResponseDTO convertToDTO(AcousticTodo todo) {

        Song song = todo.getSong();

        return new TodoAcousticResponseDTO(
            todo.getId(),
            song.getId(),
            song.getTitle(),
            song.getArtist(),
            song.getLink()
        );
    }

    public List<TodoAcousticResponseDTO> getAllTodos() {

        return acousticTodoRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .toList();
    }

    public TodoAcousticResponseDTO createTodo(TodoAcousticRequestDTO dto) {

        Song song = songRepository.findById(dto.getSongId())
                .orElseThrow(() -> new RuntimeException("Song not found"));

        AcousticTodo todo = new AcousticTodo(song);

        AcousticTodo savedTodo = acousticTodoRepository.save(todo);

        return convertToDTO(savedTodo);
    }

    public void deleteTodo(Long id) {
        acousticTodoRepository.deleteById(id);
    }
}