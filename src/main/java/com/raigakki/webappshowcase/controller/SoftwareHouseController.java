package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import com.raigakki.webappshowcase.service.SoftwareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@RequestMapping(value = "/api/v1/softwareHouse")
public class SoftwareHouseController {

    private final SoftwareHouseService softwareHouseService;

    @Autowired
    public SoftwareHouseController(SoftwareHouseService softwareHouseService) {
        this.softwareHouseService = softwareHouseService;
    }

    @GetMapping(value = "/all")
    public List<SoftwareHouse> getAllBySoftwareHouseName() {
        List<SoftwareHouse> softwareHousesList = softwareHouseService.getAll();
        return softwareHousesList;
    }


}
