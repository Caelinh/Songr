package com.Songr.app.songr.repositories;

import com.Songr.app.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongsRepo extends JpaRepository<Song, Long> {

}
