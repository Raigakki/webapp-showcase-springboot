package com.raigakki.webappshowcase.service;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import com.raigakki.webappshowcase.model.entity.Videogame;
import com.raigakki.webappshowcase.repository.SoftwareHouseRepository;
import com.raigakki.webappshowcase.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VideogameService {

    private final VideogameRepository videogameRepository;

    private final SoftwareHouseRepository softwareHouseRepository;

    @Autowired
    public VideogameService(VideogameRepository videogameRepository, SoftwareHouseRepository softwareHouseRepository) {
        this.videogameRepository = videogameRepository;
        this.softwareHouseRepository = softwareHouseRepository;
    }

    public List<Videogame> getAll() {
        return videogameRepository.findAll();
    }

    public Videogame getVideogameById(Long videogameId) {
        return videogameRepository.findById(videogameId).orElse(new Videogame());
    }

    public List<Videogame> getVideogameBySoftwareHouseName(String softwareHouseName) {
        return null;
    }

    public Videogame addVideogame(Videogame videogame, Long softwareHouseId) {
        return null;
    }

    public Videogame updateVideogame(Videogame videogame, Long videogameId) {
        return null;
    }

    public void deleteVideogame(Long videoogameId) {
        videogameRepository.deleteById(videoogameId);
    }

}
