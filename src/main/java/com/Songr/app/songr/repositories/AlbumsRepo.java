package com.Songr.app.songr.repositories;
import com.Songr.app.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepo extends JpaRepository<Album, Long> {

    public Album findByTitle(String title);
    public Album findByArtist(String artist);
}
