package com.progress.backend.dto;

public class SongResponseDTO {

    private Long id;
    private String title;
    private String artist;

    public SongResponseDTO(Long id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}