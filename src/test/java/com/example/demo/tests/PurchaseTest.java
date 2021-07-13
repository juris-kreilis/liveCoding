package com.example.demo.tests;

import com.example.demo.utils.Preconditions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseTest extends Preconditions {

    @Test
    public void buyTwoItems() {
        sauceLabsLoginPage.login("standard_user", "secret_sauce");

        sauceLabsInventoryPage
                .addBackPackToCart()
                .addBikeLightToCart();

        sauceLabsInventoryPage.savePrice("BACK_PACK_PRICE", 0);
        sauceLabsInventoryPage.savePrice("BIKE_LIGHT_PRICE", 1);

        assertEquals(2, sauceLabsHeaderContainer.getCartItemsCount(), "Item count is not correct");

        sauceLabsHeaderContainer.openCart();
    }
}