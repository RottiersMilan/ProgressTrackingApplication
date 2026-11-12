package com.progress.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.progress.backend.entity.Song;

public interface SongRepository extends JpaRepository<Song, Long>{
    
    List<Song> findByTitleContainingIgnoreCase(String title);

}