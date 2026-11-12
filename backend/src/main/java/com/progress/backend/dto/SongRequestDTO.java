package com.progress.backend.dto;

public class SongRequestDTO {

    private String title;
    private String artist;
    private String link;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getLink() {
        return link;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLink(String link) {
        this.link = link;
    }
}