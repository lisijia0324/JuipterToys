package com.planittesting.automation.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    //Methods
    public void clickSubmitButton(){
        driver.findElement(By.id("contact-submit-btn")).click();
    }

    private String getErrorText(By locator){
        List<WebElement> elements = driver.findElements(locator);
        if (elements.isEmpty()){
            return "";
        }else{
            return elements.get(0).getText();
        }
    }

    public String getForeNameError() {
        return getErrorText(By.id("forename-err"));
    }

    public String getEmailError() {
        return getErrorText(By.id("email-err"));
    }

    public String getMessageError() {
        return getErrorText(By.id("message-err"));
    }

    public void setForename(String forename) {
        driver.findElement(By.id("forename")).sendKeys(forename);
    }

    public void setEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void setMessage(String message) {
        driver.findElement(By.id("message")).sendKeys(message);
    }

    public String getFeedbackMessage() {
        return new WebDriverWait(driver, 60)
                .until(ExpectedConditions.presenceOfElementLocated(By.className("alert-success"))).getText();
    }

}
