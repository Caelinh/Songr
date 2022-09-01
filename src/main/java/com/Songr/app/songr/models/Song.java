package com.Songr.app.songr.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String title;
    private Integer length;
    private Integer trackNumber;

    @ManyToOne
    Album myAlbum;

    protected Song(){};

    public Song(String title, Integer length, Integer trackNumber, Album myAlbum) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.myAlbum = myAlbum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getMyAlbum() {
        return myAlbum;
    }

    public void setMyAlbum(Album myAlbum) {
        this.myAlbum = myAlbum;
    }
}
