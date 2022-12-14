package com.raigakki.webappshowcase.service;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import com.raigakki.webappshowcase.repository.SoftwareHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareHouseService {

    private final SoftwareHouseRepository softwareHouseRepository;

    @Autowired
    public SoftwareHouseService(SoftwareHouseRepository softwareHouseRepository) {
        this.softwareHouseRepository = softwareHouseRepository;
    }

    public List<SoftwareHouse> getAll() {
        return softwareHouseRepository.findAll();
    }

    public SoftwareHouse getByName(String softwareHouseName) {
        return softwareHouseRepository.findSoftwareHouseByName(softwareHouseName);
    }

}
