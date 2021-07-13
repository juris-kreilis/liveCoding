package com.example.demo.utils;

import com.example.demo.pageObjects.SauceLabsHeaderContainer;
import com.example.demo.pageObjects.SauceLabsInventoryPage;
import com.example.demo.pageObjects.SauceLabsLoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.example.demo.utils.StringConstants.DEFAULT_BROWSER;
import static com.example.demo.utils.StringConstants.SAUCE_LAB_DEMO_PAGE;

public class Preconditions {

    public SauceLabsLoginPage sauceLabsLoginPage;
    public SauceLabsInventoryPage sauceLabsInventoryPage;
    public SauceLabsHeaderContainer sauceLabsHeaderContainer;

    @BeforeEach
    public void setUp() {
        Driver.getDriver(DEFAULT_BROWSER);
        Driver.navigateToUrl(SAUCE_LAB_DEMO_PAGE);
        sauceLabsLoginPage = new SauceLabsLoginPage(Driver.getDriver());
        sauceLabsInventoryPage = new SauceLabsInventoryPage(Driver.getDriver());
        sauceLabsHeaderContainer = new SauceLabsHeaderContainer(Driver.getDriver());
    }

    @AfterEach
    public void tearDown() {
        Driver.closeWebDriver();
    }
}
