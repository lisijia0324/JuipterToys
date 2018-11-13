package com.planittesting.automation.model.dialogs;

import com.planittesting.automation.model.pages.HomePage;
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

    public void checkTerm() {rootElement.findElement(By.id("agree")).click(); }

    public String getLoginError() { return rootElement.findElement(By.id("login-error")).getText(); }

    public void clickLoginButton() {
        rootElement.findElement(By.className("btn-primary")).click();
    }

}
