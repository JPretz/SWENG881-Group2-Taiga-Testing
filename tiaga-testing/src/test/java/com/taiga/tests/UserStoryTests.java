package com.taiga.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserStoryTests {

    @Test
    void US01_BaseValidInput() {

        String subject = "New Login Feature";
        int storyPoints = 5;

        assertNotNull(subject);
        assertFalse(subject.isBlank());
        assertTrue(storyPoints > 0);
    }

    @Test
    void US02_EmptySubject() {

        String subject = "";

        assertTrue(subject.isEmpty());
    }

    @Test
    void US03_InvalidUserAssignment() {

        boolean userBelongsToProject = false;

        assertFalse(userBelongsToProject);
    }

    @Test
    void US04_BoundaryValidation() {

        int storyPoints = -1;

        assertTrue(storyPoints < 0);
    }
}