package com.taiga.tests;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTests {

    @Test
    void TK01_BaseValidInput() {

        String subject = "Create Login Page";

        assertNotNull(subject);
        assertFalse(subject.isBlank());
    }

    @Test
    void TK02_EmptySubject() {

        String subject = "";

        assertTrue(subject.isEmpty());
    }

    @Test
    void TK03_InvalidRelationship() {

        boolean userStoryExists = false;

        assertFalse(userStoryExists);
    }

    @Test
    void TK04_InvalidDueDate() {

        LocalDate dueDate = LocalDate.now().minusDays(1);

        assertTrue(dueDate.isBefore(LocalDate.now()));
    }
}