package com.progress.backend.dto;
public class SongResponseDTO {

    private Long id;
    private String title;
    private String artist;

    private boolean hasAcoustic;
    private boolean hasElectric;

    public SongResponseDTO(
        Long id,
        String title,
        String artist,
        boolean hasAcoustic,
        boolean hasElectric
    ) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.hasAcoustic = hasAcoustic;
        this.hasElectric = hasElectric;
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

    public boolean getHasAcoustic() {
        return hasAcoustic;
    }

    public boolean getHasElectric() {
        return hasElectric;
    }
}
