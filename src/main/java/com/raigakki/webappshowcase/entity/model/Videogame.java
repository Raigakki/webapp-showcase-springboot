package com.raigakki.webappshowcase.entity.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Videogame {

    @Id
    private Long id;
    private String title;
    private String softwareHouse;
    private Date releaseDateEU;
    private String genre;
    private Integer pegi;

}
