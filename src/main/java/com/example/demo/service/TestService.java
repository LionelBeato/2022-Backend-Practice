package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String giveGreeting() {
        return "Hello world!";
    }

    public String giveFarewell() {
        return "Goodbye world!";
    }

}
