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
        return "This is Home Page. All Authenticated users can access this page.";
    }
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "This is Admin Page. Only Users with Admin Role can access this page";
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
