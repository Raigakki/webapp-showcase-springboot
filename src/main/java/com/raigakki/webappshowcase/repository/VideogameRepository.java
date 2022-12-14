package com.raigakki.webappshowcase.repository;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import com.raigakki.webappshowcase.model.entity.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
    List<Videogame> findVideoGameBySoftwareHouse(SoftwareHouse softwareHouse);
}
