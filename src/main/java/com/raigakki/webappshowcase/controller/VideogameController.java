package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.model.entity.Videogame;
import com.raigakki.webappshowcase.service.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@RequestMapping(value = "/api/v1/videogame")
public class VideogameController {

    private final VideogameService videogameService;

    @Autowired
    public VideogameController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }

    @GetMapping(value = "/all")
    public List<Videogame> getAllBySoftwareHouseName() {
        List<Videogame> videogameList = videogameService.getAll();
        return videogameList;
    }

    @GetMapping(value = "/all/{softwareHouseName}")
    public List<Videogame> getAllBySoftwareHouseName(@PathVariable String softwareHouseName) {
        List<Videogame> videogameList = videogameService.getVideogameBySoftwareHouseName(softwareHouseName);
        return videogameList;
    }

}
