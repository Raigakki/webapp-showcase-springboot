package com.raigakki.webappshowcase.repository;

import com.raigakki.webappshowcase.entity.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}
