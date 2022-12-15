package com.raigakki.webappshowcase.model.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Table(name = "t_software_house")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SoftwareHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "softwareHouse", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value="softwareHouse")
    private List<Videogame> videogameList;

}
