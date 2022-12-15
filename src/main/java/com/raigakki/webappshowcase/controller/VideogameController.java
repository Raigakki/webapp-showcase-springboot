package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.model.entity.Videogame;
import com.raigakki.webappshowcase.service.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/videogame")
public class VideogameController {

    private final VideogameService videogameService;

    @Autowired
    public VideogameController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Videogame>> getAllVideogame() {
        List<Videogame> videogameList = videogameService.getAll();
        return ResponseEntity.ok(videogameList);
    }

    @GetMapping(value = "/findById/{videogameId}")
    public ResponseEntity<Videogame> getVideogameById(@PathVariable Long videogameId) {
        Videogame videogame = videogameService.getVideogameById(videogameId);
        return ResponseEntity.ok(videogame);
    }

    @GetMapping(value = "/findBySoftwareHouseName/{softwareHouseName}")
    public ResponseEntity<List<Videogame>> getAllVideogameBySoftwareHouseName(@PathVariable String softwareHouseName) {
        List<Videogame> videogameList = videogameService.getVideogameBySoftwareHouseName(softwareHouseName);
        return ResponseEntity.ok(videogameList);
    }

    @PostMapping(value = "/addBySoftwareHouseId")
    public ResponseEntity<Videogame> addVideogameBySoftwareHouseId() {
        return null;
    }

    @PutMapping(value = "/updateById/{videogameId}")
    public ResponseEntity<Videogame> updateVideogameById() {
        return null;
    }

    //@DeleteMapping

}
