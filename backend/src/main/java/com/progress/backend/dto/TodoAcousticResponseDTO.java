package com.progress.backend.dto;

public class TodoAcousticResponseDTO {

    private Long id;
    private Long songId;
    private String title;
    private String artist;
    private String link;

    public TodoAcousticResponseDTO(Long id, Long songId,
            String title, String artist, String link) {
        this.id = id;
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public Long getSongId() {
        return songId;
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