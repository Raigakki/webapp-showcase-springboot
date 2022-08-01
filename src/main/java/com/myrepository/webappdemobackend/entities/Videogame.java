package com.myrepository.webappdemobackend.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Videogame {
    @Id
    private Long id;
    private String title;
}
