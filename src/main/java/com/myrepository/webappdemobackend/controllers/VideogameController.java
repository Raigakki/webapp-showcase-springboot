package com.myrepository.webappdemobackend.controllers;

import com.myrepository.webappdemobackend.entities.Videogame;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/vg")
public class VideogameController {

    @GetMapping(path = "/")
    public List<Videogame> getVidoegameList() {
        Videogame vg = new Videogame();
        vg.setId(1L);
        vg.setTitle("Holy shit it works");
        return List.of(vg);
    }

    @GetMapping(path = "/{id}")
    public Videogame getVidoegame(@PathVariable String id) {
        Videogame vg = new Videogame();
        vg.setId(Long.valueOf(id));
        vg.setTitle("Holy shit it works with the path variable");
        return vg;
    }

}
