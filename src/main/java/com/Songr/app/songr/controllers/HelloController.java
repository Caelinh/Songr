package com.Songr.app.songr.controllers;

import org.springframework.stereotype.Controller;
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

}
