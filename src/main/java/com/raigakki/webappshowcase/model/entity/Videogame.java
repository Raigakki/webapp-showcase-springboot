package com.raigakki.webappshowcase.model.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Table(name = "t_videogame")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Videogame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "software_house_id")
    @JsonIgnoreProperties(value="videogameList")
    private SoftwareHouse softwareHouse;

}
