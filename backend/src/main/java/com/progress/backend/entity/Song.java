package com.progress.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"title", "artist"}))
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String artist;

    private boolean hasAcoustic;
    private boolean hasElectric;

    public Song() {}

    public Song(String title, String artist, boolean hasAcoustic, boolean hasElectric) {
        this.title = title;
        this.artist = artist;
        this.hasAcoustic = hasAcoustic;
        this.hasElectric = hasElectric;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public boolean getHasAcoustic(){
        return hasAcoustic;
    }

    public boolean getHasElectric(){
        return hasElectric;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setHasAcoustic(boolean hasAcoustic){
        this.hasAcoustic = hasAcoustic;
    }

    public void setHasElectric(boolean hasElectric){
        this.hasElectric = hasElectric;
    }
}