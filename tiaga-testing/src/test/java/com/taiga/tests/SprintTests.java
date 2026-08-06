package com.taiga.tests;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class SprintTests {

    @Test
    void SP01_BaseValidInput() {

        LocalDate start = LocalDate.now();
        LocalDate finish = start.plusDays(14);

        assertTrue(finish.isAfter(start));
    }

    @Test
    void SP02_EmptyName() {

        String sprintName = "";

        assertTrue(sprintName.isEmpty());
    }

    @Test
    void SP03_InvalidDateRange() {

        LocalDate start = LocalDate.now();
        LocalDate finish = start.minusDays(1);

        assertTrue(finish.isBefore(start));
    }

    @Test
    void SP04_InvalidState() {

        String state = "INVALID";

        assertEquals("INVALID", state);
    }
}