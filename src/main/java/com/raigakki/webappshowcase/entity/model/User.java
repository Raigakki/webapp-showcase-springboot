package com.raigakki.webappshowcase.entity.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class User {

    @Id @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String username;
    private String password;
    private String role;
}
