package com.raigakki.webappshowcase.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "This is Home Page";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "This is Admin Page";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
