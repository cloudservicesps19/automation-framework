package com.automation.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class LoginPage {

    private WebDriver driver;

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(username))
            .sendKeys(user);

        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
    
    public void login(String user, String pass, String otp) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(username))
            .sendKeys(user);

        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
        
        
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
