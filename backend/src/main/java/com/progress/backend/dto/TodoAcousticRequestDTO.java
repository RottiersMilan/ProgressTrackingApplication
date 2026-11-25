package com.progress.backend.dto;

public class TodoAcousticRequestDTO {

    private Long songId;
    private String getLink;

    public Long getSongId() {
        return songId;
    }

    public String getLink(){
        return getLink;
    }

    public void setSongId(Long songId, String getLink) {
        this.songId = songId;
        this.getLink = getLink;
    }
}