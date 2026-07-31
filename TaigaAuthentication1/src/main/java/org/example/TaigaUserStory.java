package org.example;

public class TaigaUserStory {

    public boolean createUserStory(
            String subject,
            String description,
            String status,
            int points,
            String assignedTo,
            boolean isBlocked) {

        // Subject is required
        if (subject == null || subject.trim().isEmpty()) {
            return false;
        }

        // Description is required
        if (description == null || description.trim().isEmpty()) {
            return false;
        }

        // Status must be valid
        if (!status.equals("New") &&
                !status.equals("In Progress") &&
                !status.equals("Ready for Test") &&
                !status.equals("Done")) {
            return false;
        }

        // Story points cannot be negative
        if (points < 0) {
            return false;
        }

        // Simulate valid project members
        if (!assignedTo.equals("John Pretz") &&
                !assignedTo.equals("Jane Doe")) {
            return false;
        }

        // Blocking flag is accepted in this simplified model
        return true;
    }
}