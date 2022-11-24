package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.entity.model.User;
import com.raigakki.webappshowcase.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private UserDetailsServiceImpl myUserDetailsService;

    @PreAuthorize("permitAll()")
    @PostMapping("/api/user/register")
    public void registerUser(@RequestBody User user){
        myUserDetailsService.saveUser(user.getUsername(), user.getPassword(), "ROLE_USER");
    }

}
