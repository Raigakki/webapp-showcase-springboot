package com.raigakki.webappshowcase.service;

import com.raigakki.webappshowcase.model.entity.Collection;
import com.raigakki.webappshowcase.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    private final CollectionRepository collectionRepository;

    @Autowired
    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public List<Collection> getAll() {
        List<Collection> collectionList = collectionRepository.findAll();
        return collectionList;
    }

    public Collection getCollectionById(Long collectionId) {
        Collection collection = collectionRepository.getById(collectionId);
        return collection;
    }

}
