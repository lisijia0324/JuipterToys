package com.planittesting.automation.model.dialogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginDialog {

    protected WebElement rootElement;

    public LoginDialog(WebElement rootElement){
        this.rootElement = rootElement;
    }

    public void setUserName(String userName) {
        rootElement.findElement(By.id("loginUserName")).sendKeys(userName);
    }

    public void setPassword(String password) {
        rootElement.findElement(By.id("loginPassword")).sendKeys(password);
    }

    public void clickLoginButton() {
        rootElement.findElement(By.className("btn-primary")).click();
    }
}
