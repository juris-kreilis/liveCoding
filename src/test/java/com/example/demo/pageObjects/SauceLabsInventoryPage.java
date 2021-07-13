package com.example.demo.pageObjects;

import com.example.demo.utils.SharedContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.example.demo.utils.Helper.money;

public class SauceLabsInventoryPage {

    public SauceLabsInventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backPack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement bikeLight;

    @FindBy(className = "inventory_item_price")
    public List<WebElement> inventoryItemPrices;

    public SauceLabsInventoryPage addBackPackToCart() {
        backPack.click();
        return this;
    }

    public SauceLabsInventoryPage addBikeLightToCart() {
        bikeLight.click();
        return this;
    }

    public void savePrice(String contextName, int index) {
        SharedContext.setContext(contextName, money(inventoryItemPrices.get(index).getText()));
    }
}
