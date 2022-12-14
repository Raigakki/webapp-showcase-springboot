package com.raigakki.webappshowcase.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Table(name = "t_software_house")
public class SoftwareHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "softwareHouse", fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<Videogame> videogameList;
}
