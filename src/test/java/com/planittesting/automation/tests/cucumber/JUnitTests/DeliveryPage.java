package com.planittesting.automation.tests.cucumber.JUnitTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DeliveryPage {
    protected WebElement rootElement;
    protected  WebDriver driver;

    public DeliveryPage(WebDriver driver){
        this.driver = driver;
    }

    public void setForename(String forename) {
        driver.findElement(By.id("forename")).sendKeys(forename);
    }

    public void setEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void setAddress(String address) {
        driver.findElement(By.id("address")).sendKeys(address);
    }

    public void setCardType(String cardType) {
        Select cardTypes = new Select(driver.findElement(By.id("cardType")));
        cardTypes.selectByVisibleText(cardType);
    }

    public void setCardNumber(String cardNumber){
        driver.findElement(By.id("card")).sendKeys(cardNumber);
    }

    public void clickSubmitButton() {
        driver.findElement(By.id("checkout-submit-btn")).click();
    }
}
