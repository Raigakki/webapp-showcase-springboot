package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.entity.model.Videogame;
import com.raigakki.webappshowcase.repository.VideogameRepository;
import com.raigakki.webappshowcase.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping(value = "/api/v1/videogame")
public class VideogameController {

    @Autowired
    private VideogameRepository videogameRepository;

    //TODO SISTEMARE NOMI
    @GetMapping(value = "/all")
    public List<Videogame> getAll() {
        return videogameRepository.findAll();
    }

    @GetMapping(value = "/{videogameId}")
    public Videogame getById(@PathVariable Long videogameId) {
        return videogameRepository.findById(videogameId).get();
    }


}
