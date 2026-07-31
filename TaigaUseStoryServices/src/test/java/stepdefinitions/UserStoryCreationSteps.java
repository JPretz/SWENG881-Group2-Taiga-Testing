package stepdefinitions;

import org.example.TaigaUserStoryService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserStoryCreationSteps {

    private TaigaUserStoryService service;
    private boolean creationResult;

    @Given("the user is on the user story creation page")
    public void the_user_is_on_the_user_story_creation_page() {
        service = new TaigaUserStoryService();
    }

    @When("the user enters an empty subject and a valid description")
    public void the_user_enters_an_empty_subject_and_a_valid_description() {
        creationResult = service.createUserStory("", "Implement OAuth login");
    }

    @When("the user enters a whitespace-only subject and a valid description")
    public void the_user_enters_a_whitespace_only_subject_and_a_valid_description() {
        creationResult = service.createUserStory("   ", "Implement OAuth login");
    }

    @Then("the user story creation should be rejected")
    public void the_user_story_creation_should_be_rejected() {
        assertFalse(creationResult);
    }
}