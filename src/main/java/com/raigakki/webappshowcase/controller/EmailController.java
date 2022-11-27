package com.raigakki.webappshowcase.controller;

import com.raigakki.webappshowcase.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping(value = "/api/v1/email")
public class EmailController {

    @Autowired
    private EmailService emailServiceImpl;

    @GetMapping(value = "/sendEmail")
    public String sendTestEmail(
            @RequestParam String recipient,
            @RequestParam String subject,
            @RequestParam String message) {
        try {
            emailServiceImpl.sendSimpleMessage(recipient, subject, message);
            return "Email sent correctly";
        } catch (MailException me) {
            return "Error in sending the email. Error message: " + me.getMessage();
        }
    }
}
