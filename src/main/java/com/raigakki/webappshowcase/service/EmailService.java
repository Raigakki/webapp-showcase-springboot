package com.raigakki.webappshowcase.service;

public interface EmailService {
    void sendSimpleMessage(String recipient, String subject, String message);
}
