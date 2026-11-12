package com.progress.backend.dto;

public class SongResponseDTO {

    private Long id;
    private String title;
    private String artist;
    private String link;

    public SongResponseDTO(Long id, String title, String artist,
                           String link) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.link = link;
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

    public String getLink() {
        return link;
    }
}