package com.planittesting.automation.tests.cucumber.JUnitTests;

import com.planittesting.automation.model.pages.ContactPage;
import com.planittesting.automation.model.pages.HomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactPageTestSuit extends BaseTestSuit{

    @Test
    public void validateErrorMessages(){

        HomePage homePage = new HomePage(driver); // Looking at home page.
        homePage.clickContactMenu();
        ContactPage contactPage = new ContactPage(driver); // Looking at contact page.
        contactPage.clickSubmitButton();

        assertEquals("Forename is required", contactPage.getForeNameError());
        assertEquals("Email is required", contactPage.getEmailError());
        assertEquals("Message is required", contactPage.getMessageError());

        contactPage.setForename("one");
        contactPage.setEmail("con@planittesting.com");
        contactPage.setMessage("one");

        assertEquals("",contactPage.getForeNameError());
        assertEquals("",contactPage.getEmailError());
        assertEquals("",contactPage.getMessageError());

    }

    @Test
    public void validateFeedbackMessage(){
        HomePage homePage = new HomePage(driver); // Looking at home page.
        homePage.clickContactMenu();
        ContactPage contactPage = new ContactPage(driver); // Looking at contact page.

        contactPage.setForename("one");
        contactPage.setEmail("con@planittesting.com");
        contactPage.setMessage("one");

        contactPage.clickSubmitButton();

        assertEquals("Thanks one, we appreciate your feedback.", contactPage.getFeedbackMessage());
    }
}
