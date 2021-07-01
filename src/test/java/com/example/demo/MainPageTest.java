package com.example.demo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    public SauceLabsLoginPage sauceLabsLoginPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
        sauceLabsLoginPage = new SauceLabsLoginPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void negativeLoginTests() {
        sauceLabsLoginPage.login("", "12312312");
        assertEquals("Epic sadface: Username is required", sauceLabsLoginPage.errorTextField.getText(), "Wrong label added, this is not correct");
    }

    @Test
    public void emptyPasswordFieldTest() {
        sauceLabsLoginPage.login("asdas", "");
        assertEquals("Epic sadface: Password is required", sauceLabsLoginPage.errorTextField.getText(), "Wrong label added, this is not correct");
    }

    @Test
    public void emptyBothFieldTest() {
        sauceLabsLoginPage.login("", "");
        assertEquals("Epic sadface: Username is required", sauceLabsLoginPage.errorTextField.getText(), "Wrong label added, this is not correct");
    }


}
