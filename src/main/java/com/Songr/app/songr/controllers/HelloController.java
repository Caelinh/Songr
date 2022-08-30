package com.Songr.app.songr.controllers;

import com.Songr.app.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

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
        Album[] AlbumArray = new Album[3];
        AlbumArray[0] = new Album("title1","artist1",5,300,"url1");
        AlbumArray[1] = new Album("title2","artist2",6,350,"url2");
        AlbumArray[2] = new Album("title3","artist3",7,560,"url3");

        m.addAttribute("Albums", AlbumArray);

        return "models/Albums";

    }

}
