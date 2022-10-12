package com.example.demo.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

// TODO: Find way to formally benchmark tests
@SpringBootTest
class TestServiceTest {

    TestService testService;

    @BeforeEach
    void setUp() {
        testService = new TestService();
    }

    @AfterEach
    void tearDown() {
        testService = null;
    }

    @Test
    void giveGreeting() {
        var expected = "Hello world!";
        var actual = testService.giveGreeting();
        assertEquals(expected, actual);
    }

    @Test
    void giveFarewell() {
        var expected = "Goodbye world!";
        var actual = testService.giveFarewell();
        assertEquals(expected, actual);
    }

}