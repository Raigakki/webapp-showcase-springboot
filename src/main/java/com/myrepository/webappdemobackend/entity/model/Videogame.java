package com.myrepository.webappdemobackend.entity.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Videogame {

    @Id
    private Long id;
    private String title;

}
