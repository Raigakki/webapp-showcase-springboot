package com.raigakki.webappshowcase.service;

import com.raigakki.webappshowcase.WebappDemoBackendApplication;
import com.raigakki.webappshowcase.entity.model.Videogame;
import com.raigakki.webappshowcase.repository.VideogameRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameService {

    private static final Logger logger = LogManager.getLogger(WebappDemoBackendApplication.class);

    @Autowired
    private VideogameRepository videogameRepository;

    public List<Videogame> getAllVideogames() {
        List<Videogame> videogameList = videogameRepository.findAll();
        // TODO IMPLEMENTARE LOGGER DELLA CLASSE PADRE
        return videogameList;
    }
}
