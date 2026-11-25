package com.progress.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AcousticTodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Song song;
    
    private String link;

    public AcousticTodo() {}

    public AcousticTodo(Song song, String link) {
        this.song = song;
        this.link = link;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Song getSong() {
        return song;
    }

    public String getLink() {
        return link;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void setLink(String link) {
        this.link = link;
    }
}