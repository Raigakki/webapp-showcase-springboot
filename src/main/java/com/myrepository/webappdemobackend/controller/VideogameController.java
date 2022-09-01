package com.myrepository.webappdemobackend.controller;

import com.myrepository.webappdemobackend.entity.model.Videogame;
import com.myrepository.webappdemobackend.entity.response.VideogameResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/vg")
public class VideogameController {

    @GetMapping(path = "/all")
    public ResponseEntity<VideogameResponse> getVideogameList() {
        // TODO RESPONSE ENTITY PER 404? OPPURE TOGLIERE REPONSE ENTITY?
        VideogameResponse videogameResponse = new VideogameResponse();
        return ResponseEntity.ok(videogameResponse);
    }

    @GetMapping(path = "/{id}")
    public Videogame getVidoegame(@PathVariable String id) {
        Videogame vg = new Videogame();
        vg.setId(Long.valueOf(id));
        vg.setTitle("Holy shit it works with the path variable");
        return vg;
    }

}
