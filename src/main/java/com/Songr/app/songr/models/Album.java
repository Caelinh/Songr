package com.Songr.app.songr.models;


import javax.persistence.*;
import java.util.List;


@Entity
public class Album {
@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

    String title;

    String artist;

    Integer songCount;

    Integer length;

    String imageUrl;

    @OneToMany(mappedBy="myAlbum")
    List<Song> songsOnThisAlbum;
    protected Album(){}

    public Album(String title, String artist, Integer songCount, Integer length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Song> getSongsOnThisAlbum() {
        return songsOnThisAlbum;
    }

    public void setSongsOnThisAlbum(List<Song> songsOnThisAlbum) {
        this.songsOnThisAlbum = songsOnThisAlbum;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", length=" + length +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
