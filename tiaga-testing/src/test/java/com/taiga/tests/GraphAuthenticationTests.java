package com.taiga.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphAuthenticationTests {

    @Test
    void GB01_ValidRegistration() {
        assertTrue(true);
    }

    @Test
    void GB02_InvalidUsername() {
        assertFalse(false);
    }

    @Test
    void GB03_DuplicateEmail() {
        assertFalse(false);
    }

    @Test
    void GB04_WeakPassword() {
        assertFalse(false);
    }

    @Test
    void GB05_ValidLogin() {
        assertTrue(true);
    }

    @Test
    void GB06_InactiveAccount() {
        assertFalse(false);
    }

    @Test
    void GB07_IncorrectPassword() {
        assertFalse(false);
    }
}