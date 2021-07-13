package com.example.demo.pageObjects;

import com.example.demo.utils.Preconditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsHeaderContainer extends Preconditions {

    public SauceLabsHeaderContainer(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "shopping_cart_badge")
    public WebElement elementCount;

    @FindBy(className = "shopping_cart_link")
    public WebElement cartButton;

    public int getCartItemsCount() {
        return Integer.parseInt(elementCount.getText());
    }

    public SauceLabsHeaderContainer openCart() {
        cartButton.click();
        return this;
    }

}
