package com.example.demo.tests;

import com.example.demo.pageObjects.SauceLabsLoginPage;
import com.example.demo.utils.Driver;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest {

    public SauceLabsLoginPage sauceLabsLoginPage;

    @BeforeEach
    public void setUp() {
        Driver.getDriver("chrome");
        Driver.navigateToUrl("https://www.saucedemo.com/");
        sauceLabsLoginPage = new SauceLabsLoginPage(Driver.getDriver());
    }

    @AfterEach
    public void tearDown() {
        Driver.closeWebDriver();
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
