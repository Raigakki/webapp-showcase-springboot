package com.myrepository.webappdemobackend.repository;

import com.myrepository.webappdemobackend.entity.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}
