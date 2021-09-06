package com.example.demo.tests;

import com.example.demo.utils.Preconditions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPageTest extends Preconditions {

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
