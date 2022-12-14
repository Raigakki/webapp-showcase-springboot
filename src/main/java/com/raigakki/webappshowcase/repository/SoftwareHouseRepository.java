package com.raigakki.webappshowcase.repository;

import com.raigakki.webappshowcase.model.entity.SoftwareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareHouseRepository extends JpaRepository<SoftwareHouse, Long> {
    SoftwareHouse findSoftwareHouseByName(String softwareHouseName);
}
