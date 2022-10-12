package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    TestService testService;

    // TODO: See if there's a way to test constructor efficiency
    public TestController(TestService testService) {
        this.testService = testService;
    }

    // TODO: Mock this endpoint
    @GetMapping("/")
    public String getGreeting() {
        return testService.giveGreeting();
    }

}
