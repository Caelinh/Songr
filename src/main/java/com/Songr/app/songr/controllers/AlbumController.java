package com.Songr.app.songr.controllers;

import com.Songr.app.songr.models.Album;
import com.Songr.app.songr.repositories.AlbumsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class AlbumController {
@Autowired
    AlbumsRepo AlbumsRepo;
    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/capitalize/{word}")
    @ResponseBody
    public String capitalize(@PathVariable String word){
        return word.toUpperCase();
    }

    @GetMapping("/albums")
    public String albums(Model m){
        List<Album> albums = AlbumsRepo.findAll();
        m.addAttribute("Albums", albums);

        return "models/Albums";

    }

    @PostMapping("/albumsave")
    public RedirectView createNewAlbum(String title, String artist, Integer songCount, Integer length, String imageUrl){
        Album newAlbum = new Album(title,artist,songCount,length,imageUrl);
        AlbumsRepo.save(newAlbum);
        return new RedirectView("/albums");

    }




}
