package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import com.raigakki.webappshowcase.service.SoftwareHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/softwareHouse")
public class SoftwareHouseController {

    private final SoftwareHouseService softwareHouseService;

    @Autowired
    public SoftwareHouseController(SoftwareHouseService softwareHouseService) {
        this.softwareHouseService = softwareHouseService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<SoftwareHouse>> getAll() {
        List<SoftwareHouse> softwareHouseList = softwareHouseService.getAll();
        return ResponseEntity.ok(softwareHouseList);
    }

    @GetMapping(value = "/get/{softwareHouseId}")
    public ResponseEntity<SoftwareHouse> getSoftwareHouseById(@PathVariable Long softwareHouseId) {
        SoftwareHouse softwareHouse = softwareHouseService.getSoftwareHouseById(softwareHouseId);
        return ResponseEntity.ok(softwareHouse);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<SoftwareHouse> addSoftwareHouse(@RequestBody SoftwareHouse softwareHouse) {
        SoftwareHouse addedSoftwareHouse = softwareHouseService.addSoftwareHouse(softwareHouse);
        return ResponseEntity.ok(addedSoftwareHouse);
    }

    @PutMapping(value = "/update/{softwareHouseId}")
    public ResponseEntity<SoftwareHouse> addSoftwareHouse(@RequestBody SoftwareHouse softwareHouse, @PathVariable Long softwareHouseId) {
        SoftwareHouse softwareHouses = softwareHouseService.updateSoftwareHouseById(softwareHouse, softwareHouseId);
        return ResponseEntity.ok(softwareHouses);
    }

    @DeleteMapping(value = "/delete/{softwareHouseId}")
    public ResponseEntity<Void> deleteSoftwareHouseById(@PathVariable Long softwareHouseId) {
        softwareHouseService.deleteSoftwareHouseById(softwareHouseId);
        return ResponseEntity.ok().build();
    }


}
