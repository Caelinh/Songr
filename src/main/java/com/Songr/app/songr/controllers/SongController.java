package com.Songr.app.songr.controllers;

import com.Songr.app.songr.models.Album;
import com.Songr.app.songr.models.Song;
import com.Songr.app.songr.repositories.AlbumsRepo;
import com.Songr.app.songr.repositories.SongsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongsRepo songsRepo;
    @Autowired
    AlbumsRepo albumsRepo;

    @GetMapping("/songs")
    public String getAllSongs(Model m){
        List<Song> songs = songsRepo.findAll();

        m.addAttribute("songs", songs);
        return "models/Song";
    }

    @PostMapping("/add-song")
    public RedirectView createNewSong(String title, Integer length, Integer trackNumber, String album){
        Album myAlbum = albumsRepo.findByTitle(album);

        Song song = new Song(title,length,trackNumber,myAlbum);
        songsRepo.save(song);
        return new RedirectView("/albums");

    }

}
