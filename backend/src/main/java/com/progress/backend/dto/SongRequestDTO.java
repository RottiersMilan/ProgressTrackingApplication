package com.progress.backend.dto;
public class SongRequestDTO {

    private String title;
    private String artist;

    private boolean hasAcoustic;
    private boolean hasElectric;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setHasAcoustic(boolean hasAcoustic) {
        this.hasAcoustic = hasAcoustic;
    }

    public void setHasElectric(boolean hasElectric) {
        this.hasElectric = hasElectric;
    }
}
