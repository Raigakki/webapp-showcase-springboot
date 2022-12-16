package com.raigakki.webappshowcase.model.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

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
    @JoinColumn(name = "software_house_fk_id", referencedColumnName = "id")
    @JsonIgnoreProperties(value="videogameList")
    private SoftwareHouse softwareHouse;

    @ManyToMany(mappedBy = "videogameList", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = {"videogameList", "user"})
    private Set<Collection> collectionList;

}
