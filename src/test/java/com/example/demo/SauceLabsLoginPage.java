package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsLoginPage {

    @FindBy(id = "user-name")
    public WebElement usernameInputField;

    @FindBy(id = "password")
    public WebElement passwordInputField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(className = "error-message-container")
    public WebElement errorTextField;

    public void login(String username, String password){
        usernameInputField.clear();
        passwordInputField.clear();
        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        loginButton.click();
    }

    public SauceLabsLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
