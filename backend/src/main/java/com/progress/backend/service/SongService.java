package com.progress.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.progress.backend.dto.SongRequestDTO;
import com.progress.backend.dto.SongResponseDTO;
import com.progress.backend.entity.Song;
import com.progress.backend.repository.SongRepository;

@Service
public class SongService {

    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    private SongResponseDTO convertToDTO(Song song) {
        return new SongResponseDTO(
            song.getId(),
            song.getTitle(),
            song.getArtist(),
            song.getLink()
        );
    }

    public List<SongResponseDTO> getAllSongs() {
        return songRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .toList();
    }

    public List<SongResponseDTO> getSongByTitle(String title) {
        return songRepository.findByTitleContainingIgnoreCase(title)
                .stream()
                .map(this::convertToDTO)
                .toList();
    }

    public SongResponseDTO createSong(SongRequestDTO dto) {

        Song song = new Song(
            dto.getTitle(),
            dto.getArtist(),
            dto.getLink()
        );

        Song savedSong = songRepository.save(song);

        return convertToDTO(savedSong);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }
}