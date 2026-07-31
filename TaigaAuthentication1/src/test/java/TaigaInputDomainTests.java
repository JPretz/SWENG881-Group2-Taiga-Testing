package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaigaInputDomainTests {

    TaigaUserStory userStory = new TaigaUserStory();

    /*
     * US-01
     * Base Case
     * Valid User Story
     */
    @Test
    void US01_validUserStory() {

        boolean result = userStory.createUserStory(
                "New Login Feature",
                "Implement user login functionality",
                "New",
                5,
                "John Pretz",
                false
        );

        assertTrue(result);
    }

    /*
     * US-02
     * Empty Subject
     */
    @Test
    void US02_emptySubject() {

        boolean result = userStory.createUserStory(
                "",
                "Implement user login functionality",
                "New",
                5,
                "John Pretz",
                false
        );

        assertFalse(result);
    }

    /*
     * US-03
     * Invalid Project Member
     */
    @Test
    void US03_invalidAssignment() {

        boolean result = userStory.createUserStory(
                "New Login Feature",
                "Implement user login functionality",
                "New",
                5,
                "InvalidUser",
                false
        );

        assertFalse(result);
    }

    /*
     * US-04
     * Invalid Story Points
     */
    @Test
    void US04_invalidPoints() {

        boolean result = userStory.createUserStory(
                "New Login Feature",
                "Implement user login functionality",
                "New",
                -1,
                "John Pretz",
                false
        );

        assertFalse(result);
    }
}