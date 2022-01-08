package com.example.demo.utils;

import com.example.demo.pageObjects.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.example.demo.utils.StringConstants.DEFAULT_BROWSER;
import static com.example.demo.utils.StringConstants.SAUCE_LAB_DEMO_PAGE;

public class Preconditions {

    public SauceLabsLoginPage sauceLabsLoginPage;


    @BeforeEach
    public void setUp() {
        Driver.getDriver(DEFAULT_BROWSER);
        Driver.navigateToUrl(SAUCE_LAB_DEMO_PAGE);
        sauceLabsLoginPage = new SauceLabsLoginPage(Driver.getDriver());
    }

    @AfterEach
    public void tearDown() {
       Driver.quitDriver();
    }
}
