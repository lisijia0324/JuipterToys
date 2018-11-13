package com.planittesting.automation.tests.cucumber.steps;


import com.planittesting.automation.model.dialogs.LoginDialog;
import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.tests.cucumber.World;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {

    private WebDriver driver;

    public LoginSteps(World world){
        this.driver = world.getDriver();
    }

    private HomePage homePage;
    public LoginDialog loginDialog;

    @Given("^An user login with correct credential$")
    public void anUserLoginWithCorrectCredential() {
        HomePage homePage = new HomePage(driver);
        LoginDialog loginDialog = homePage.clickLoginMenu();
        loginDialog.setUserName("test");
        loginDialog.setPassword("letmein");
        loginDialog.checkTerm();
        loginDialog.clickLoginButton();
    }


    @Given("^An user login without term agreement$")
    public void anUserLoginWithoutTermAgreement() {
        homePage = new HomePage(driver);
        loginDialog = homePage.clickLoginMenu();
        loginDialog.setUserName("test");
        loginDialog.setPassword("letmein");
        loginDialog.clickLoginButton();
    }

    @Then("^User sees the error message$")
    public void userSeesTheErrorMessage() throws Throwable {
        assertEquals("You must agree to the terms of service", loginDialog.getLoginError());
    }
}
