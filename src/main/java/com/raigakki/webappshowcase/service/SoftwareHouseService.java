package com.raigakki.webappshowcase.service;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import com.raigakki.webappshowcase.repository.SoftwareHouseRepository;
import com.raigakki.webappshowcase.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareHouseService {

    private final SoftwareHouseRepository softwareHouseRepository;

    private final VideogameRepository videogameRepository;

    @Autowired
    public SoftwareHouseService(SoftwareHouseRepository softwareHouseRepository, VideogameRepository videogameRepository) {
        this.softwareHouseRepository = softwareHouseRepository;
        this.videogameRepository = videogameRepository;
    }

    public List<SoftwareHouse> getAll() {
        List<SoftwareHouse> softwareHouseList = softwareHouseRepository.findAll();
        return softwareHouseList;
    }

    public SoftwareHouse getSoftwareHouseById(Long softwareHouseId) {
        return softwareHouseRepository.findById(softwareHouseId).orElse(new SoftwareHouse());
    }

    public SoftwareHouse getSoftwareHouseByName(String softwareHouseName) {
        return softwareHouseRepository.findByName(softwareHouseName).orElse(new SoftwareHouse());
    }

    public SoftwareHouse addSoftwareHouse(SoftwareHouse softwareHouse) {
        return softwareHouseRepository.save(softwareHouse);
    }

    public SoftwareHouse updateSoftwareHouseById(SoftwareHouse softwareHouse, Long softwareHouseId) {
        // IMPLEMETARE CONTROLLO A CASCATA
        return null;
    }

    public void deleteSoftwareHouseById(Long softwareHouseId) {
        // IMPLEMETARE CONTROLLO A CASCATA
        softwareHouseRepository.deleteById(softwareHouseId);
    }

}
