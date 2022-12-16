package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.model.entity.Collection;
import com.raigakki.webappshowcase.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/collection")
public class CollectionController {

    private final CollectionService collectionService;

    @Autowired
    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }


    @GetMapping(value = "/all")
    public ResponseEntity<List<Collection>> getAll() {
        List<Collection> collectionList = collectionService.getAll();
        return ResponseEntity.ok(collectionList);
    }

    @GetMapping(value = "/get/{collectionId}")
    public ResponseEntity<Collection> getSoftwareHouseById(@PathVariable Long collectionId) {
        Collection collection = collectionService.getCollectionById(collectionId);
        return ResponseEntity.ok(collection);
    }


}
