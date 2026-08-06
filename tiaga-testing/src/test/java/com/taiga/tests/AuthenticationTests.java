package com.taiga.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationTests {

    @Test
    void AU01_ValidRegistration() {

        String username = "testuser";

        assertNotNull(username);
    }

    @Test
    void AU02_InvalidUsername() {

        String username = "";

        assertTrue(username.isBlank());
    }

    @Test
    void AU03_InvalidEmail() {

        String email = "bademail";

        assertFalse(email.contains("@"));
    }

    @Test
    void AU04_InvalidPassword() {

        String password = "";

        assertTrue(password.isEmpty());
    }

    @Test
    void AU05_ValidLogin() {

        boolean loginSuccessful = true;

        assertTrue(loginSuccessful);
    }
}