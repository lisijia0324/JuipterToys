package com.planittesting.automation.tests.cucumber.steps;

import com.planittesting.automation.model.pages.ContactPage;
import com.planittesting.automation.model.pages.HomePage;
import com.planittesting.automation.tests.cucumber.World;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class ContactSteps {

    private WebDriver driver;
    public ContactSteps(World world){
        this.driver = world.getDriver();
    }

    @Given("^An user submits feedback$")
    public void userSubmitsFeedback(){
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage(driver);
        homePage.clickContactMenu();
        ContactPage contactPage = new ContactPage(driver);
        contactPage.setForename("one");
        contactPage.setEmail("con@planittesting.com");
        contactPage.setMessage("one");
        contactPage.clickSubmitButton();
    }

    @Given("^An user submits feedback without required details$")
    public void userSubmitsFeedbackWithoutRequiredDetails() throws Throwable {
        HomePage homePage = new HomePage(driver);
        homePage.clickContactMenu();
        ContactPage contactPage = new ContactPage(driver);
        contactPage.clickSubmitButton();
    }
}
