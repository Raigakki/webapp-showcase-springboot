package com.myrepository.webappdemobackend.service;

import com.myrepository.webappdemobackend.entity.model.Videogame;
import com.myrepository.webappdemobackend.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideogameService extends BaseService {

    @Autowired
    private VideogameRepository videogameRepository;

    public List<Videogame> getAllVideogames() {
        List<Videogame> videogameList = videogameRepository.findAll();
        // TODO IMPLEMENTARE LOGGER DELLA CLASSE PADRE
        return videogameList;
    }
}
