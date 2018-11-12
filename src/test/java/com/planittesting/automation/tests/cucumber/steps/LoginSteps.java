package com.planittesting.automation.tests.cucumber.steps;


import com.planittesting.automation.model.dialogs.LoginDialog;
import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.tests.cucumber.World;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver driver;
    public LoginSteps(World world){
        this.driver = world.getDriver();
    }

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
        HomePage homePage = new HomePage(driver);
        LoginDialog loginDialog = homePage.clickLoginMenu();
        loginDialog.setUserName("test");
//        loginDialog.setPassword("letmein");
//        loginDialog.clickLoginButton();
    }
}
