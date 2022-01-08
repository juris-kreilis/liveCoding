package com.example.demo.tests;

import com.example.demo.utils.Preconditions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageTests extends Preconditions {



    @Test
    public void negativeLoginTests() {
        sauceLabsLoginPage.login("","asdasdasda");
        assertEquals("Epic sadface: Username is required", sauceLabsLoginPage.errorTextField.getText(), "Wrong label added, this is not correct");
    }


}
