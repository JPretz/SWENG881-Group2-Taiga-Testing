package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get("https://tree.taiga.io/login");
    }

    public void enterUsername(String username) {
        WebElement user = wait.until(
                ExpectedConditions.visibilityOfElementLocated(usernameField)
        );

        user.clear();
        user.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement pass = wait.until(
                ExpectedConditions.visibilityOfElementLocated(passwordField)
        );

        pass.clear();
        pass.sendKeys(password);
    }

    public void clickLogin() {
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(loginButton)
        );

        button.click();
    }

    public void login(String username, String password) {

        System.out.println("username");
        enterUsername(username);

        System.out.println("password");
        enterPassword(password);

        System.out.println("Clicking login...");
        clickLogin();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After click URL: "
                + driver.getCurrentUrl());
    }
}