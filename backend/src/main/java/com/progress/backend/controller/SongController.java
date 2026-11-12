package com.progress.backend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.progress.backend.dto.SongRequestDTO;
import com.progress.backend.dto.SongResponseDTO;
import com.progress.backend.service.SongService;

@Controller 
@RequestMapping("/api/songs")
@CrossOrigin(origins = "http://localhost:4200")
public class SongController {
    
    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<SongResponseDTO> getAllTodos() {
        return songService.getAllSongs();
    }

    @PostMapping
    public SongResponseDTO createSong(
            @RequestBody SongRequestDTO dto) {

        return songService.createSong(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        songService.deleteSong(id);
    }
}
