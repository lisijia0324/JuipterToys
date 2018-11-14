package com.planittesting.automation.tests.cucumber.steps;

import com.planittesting.automation.model.pages.ContactPage;
import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.tests.cucumber.World;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeedbackSteps {

    private WebDriver driver;
    public FeedbackSteps(World world){
        this.driver = world.getDriver();
    }

    @Then("^user sees a successful message$")
    public void userSeesASuccessfulMessage() throws Throwable {
        ContactPage contactPage = new ContactPage(driver);
        assertEquals("Thanks one, we appreciate your feedback.", contactPage.getFeedbackMessage());
    }

    @Then("^user sees a error message$")
    public void userSeesAErrorMessage() throws Throwable {

        ContactPage contactPage = new ContactPage(driver);
        assertEquals("Forename is required", contactPage.getForeNameError());
        assertEquals("Email is required", contactPage.getEmailError());
        assertEquals("Message is required", contactPage.getMessageError());
    }

    @Then("^User sees the login account$")
    public void userSeesTheLoginAccount(){
        HomePage homePage = new HomePage(driver);
        assertEquals("test", homePage.getLoginUser());
    }
}
