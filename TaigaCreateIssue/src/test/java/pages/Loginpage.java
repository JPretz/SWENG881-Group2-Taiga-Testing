package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }


    private By githubLoginButton =
            By.cssSelector("a[title='Enter with your github account']");


    private By githubUsername =
            By.id("login_field");

    private By githubPassword =
            By.id("password");

    private By githubSignIn =
            By.cssSelector("input[type='submit']");


    public void openTaigaLogin() {

        driver.get("https://tree.taiga.io/login");

    }


    public void loginWithGithub(String username, String password) {


        openTaigaLogin();


        wait.until(
                ExpectedConditions.elementToBeClickable(githubLoginButton)
        ).click();


        wait.until(
                ExpectedConditions.urlContains("github.com")
        );


        wait.until(
                ExpectedConditions.visibilityOfElementLocated(githubUsername)
        );


        driver.findElement(githubUsername)
                .sendKeys(username);


        driver.findElement(githubPassword)
                .sendKeys(password);


        driver.findElement(githubSignIn)
                .click();

    }
}