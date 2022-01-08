package com.example.demo.pageObjects;

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

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginButtonxpath;

    @FindBy(css = "input#login-button")
    public WebElement loginButtoncss;

    @FindBy(className = "error-message-container")
    public WebElement errorTextField;

    @FindBy(css = "div#login_credentials  h4")
    public WebElement pareizieLietotajvardiCss;

    @FindBy(xpath = "//div[@id='login_credentials']//h4")
    public WebElement pareizieLietotajvardiXpath;

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
