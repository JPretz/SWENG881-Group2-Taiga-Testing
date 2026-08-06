package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;



public class CreateIssuePage {


    private WebDriver driver;

    private WebDriverWait wait;



    public CreateIssuePage(WebDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(20)
        );

    }

    public void navigateToProject(){

        driver.navigate().to(
                "https://tree.taiga.io/project/devin141-test1/issues"
        );


        wait.until(
                ExpectedConditions.urlContains(
                        "devin141-test1"
                )
        );

    }

    private By createIssueButton =
            By.xpath("//button[contains(@class,'btn-small') and .//span[text()='NEW ISSUE']]");



    public void clickNewIssue(){

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(
                        createIssueButton
                )
        );

        button.click();

    }

    private By subjectField =
            By.name("subject");



    public void enterSubject(String subject){

        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        subjectField
                )
        );


        field.sendKeys(subject);

    }

    private By descriptionField =
            By.xpath(
                    "//textarea"
            );



    public void enterDescription(String description){

        WebElement field = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        descriptionField
                )
        );


        field.sendKeys(description);

    }


    private By createButton = By.id("submitButton");



    public void clickCreateButton(){

        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(
                        createButton
                )
        );


        button.click();

    }

    public boolean isIssueDisplayed(String issueTitle){


        By issue =
                By.xpath(
                        "//*[contains(text(),'" + issueTitle + "')]"
                );


        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(issue)
        ).isDisplayed();

    }

}