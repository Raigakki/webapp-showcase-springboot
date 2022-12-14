package com.raigakki.webappshowcase.service;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import com.raigakki.webappshowcase.model.entity.Videogame;
import com.raigakki.webappshowcase.repository.SoftwareHouseRepository;
import com.raigakki.webappshowcase.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Videogame> getVideogameBySoftwareHouseName(String softwareHouseName) {
        SoftwareHouse softwareHouse = softwareHouseRepository.findSoftwareHouseByName(softwareHouseName);
        List<Videogame> videogameList = videogameRepository.findVideoGameBySoftwareHouse(softwareHouse);
        return videogameList;
    }

    public Videogame addVideogame(Videogame videogame) {
        return videogameRepository.save(videogame);
    }

}
