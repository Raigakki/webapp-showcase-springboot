package com.raigakki.webappshowcase.entity.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "T_USER")
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class User implements UserDetails {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "USERNAME", unique = true, nullable = false)
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private boolean enabled;
    private boolean accountNonLocked;
    private boolean accountNonExpired;
    private boolean credentialsNonExpired;

    // TODO GESTIRE AUTHORITIES
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
}
