package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CreateIssuePage;
import pages.LoginPage;


public class CreateIssueSteps {


    private WebDriver driver;

    private LoginPage loginPage;

    private CreateIssuePage createIssuePage;



    @Before
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();


        loginPage = new LoginPage(driver);

        createIssuePage = new CreateIssuePage(driver);

    }



    @After
    public void tearDown() {

        if(driver != null) {

            driver.quit();

        }

    }



    @Given("I am logged into Taiga with username {string} and password {string}")
    public void i_am_logged_into_taiga(
            String username,
            String password) {

        loginPage.loginWithGithub(username, password);

    }

    @When("I navigate to the Test1 issues")
    public void i_navigate_to_the_test1_project() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        createIssuePage.navigateToProject();

    }



    @When("I click create new issue")
    public void i_click_create_new_issue() {

        createIssuePage.clickNewIssue();

    }



    @When("I enter the issue subject {string}")
    public void i_enter_issue_subject(String subject) {

        createIssuePage.enterSubject(subject);

    }



    @When("I enter the issue description {string}")
    public void i_enter_issue_description(String description) {

        createIssuePage.enterDescription(description);

    }



    @When("I submit the issue")
    public void i_submit_the_issue() {

        createIssuePage.clickCreateButton();

    }



    @Then("the issue {string} should be created successfully")
    public void issue_should_be_created_successfully(String issueTitle) {


        Assertions.assertTrue(
                createIssuePage.isIssueDisplayed(issueTitle),
                "Issue was not created"
        );

    }

}