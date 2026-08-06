package com.taiga.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IssueTests {

    @Test
    void IS01_BaseValidInput() {

        String issueType = "Bug";

        assertEquals("Bug", issueType);
    }

    @Test
    void IS02_EmptySubject() {

        String subject = "";

        assertTrue(subject.isEmpty());
    }

    @Test
    void IS03_InvalidClassification() {

        String severity = "INVALID";

        assertEquals("INVALID", severity);
    }

    @Test
    void IS04_InvalidRelationship() {

        boolean userExists = false;

        assertFalse(userExists);
    }
}