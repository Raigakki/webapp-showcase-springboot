package com.raigakki.webappshowcase.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Table(name = "t_collection")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date")
    @ColumnDefault("CURRENT_TIMESTAMP")
    private Date creationDate = new Date();

    @OneToOne(mappedBy = "collection")
    @JsonIgnoreProperties(value = {"collection"})
    private User user;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "jt_collection_videogame",
            joinColumns = @JoinColumn(name = "videogame_id"),
            inverseJoinColumns = @JoinColumn(name = "collection_id"))
    @JsonIgnoreProperties(value = {"softwareHouse", "collectionList"})
    private Set<Videogame> videogameList;

}
