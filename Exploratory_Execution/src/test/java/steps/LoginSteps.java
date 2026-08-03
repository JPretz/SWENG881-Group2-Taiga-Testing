package steps;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class LoginSteps {

    private final LoginPage loginPage =
            new LoginPage(Hooks.driver);

    @Given("I am on the Taiga login page")
    public void openLoginPage() {

        loginPage.open();
    }

    @When("I enter valid credentials")
    public void enterValidCredentials() {

        loginPage.login(
                "mastermind3039",
                "PObreloco3039$$"
        );
    }

    @Then("I should see the Taiga dashboard")
    public void verifyDashboard() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("CURRENT URL: "
                + Hooks.driver.getCurrentUrl());

        System.out.println("PAGE TITLE: "
                + Hooks.driver.getTitle());

        assertFalse(
                Hooks.driver.getCurrentUrl().contains("/login"),
                "Login failed. User remained on login page."
        );
    }
}