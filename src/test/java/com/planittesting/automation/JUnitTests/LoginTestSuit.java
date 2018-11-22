package com.planittesting.automation.JUnitTests;

import com.planittesting.automation.model.dialogs.LoginDialog;
import com.planittesting.automation.model.pages.HomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTestSuit extends BaseTestSuit {

    @Test
    public void validateLoginUser(){
        HomePage homePage = new HomePage(driver);
        LoginDialog loginDialog = homePage.clickLoginMenu();

        loginDialog.setUserName("test");
        loginDialog.setPassword("letmein");
        loginDialog.clickLoginButton();

        assertEquals("test", homePage.getLoginUser());
    }
}
