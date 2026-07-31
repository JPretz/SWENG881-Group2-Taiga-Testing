package org.example;

public class TaigaUserStoryService {

    public boolean createUserStory(String subject, String description) {
        return subject != null && !subject.isBlank();
    }
}