package com.planittesting.automation.model.pages;

import com.planittesting.automation.model.dialogs.LoginDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

    //
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //Methods
    public void clickContactMenu() {
        driver.findElement(By.cssSelector("#nav-contact a")).click();
    }

    public LoginDialog clickLoginMenu() {
        driver.findElement(By.cssSelector("#nav-login a")).click();
        return new LoginDialog(driver.findElement(By.className("popup")));
    }

    public void clickShopMenu() {
        driver.findElement(By.cssSelector("#nav-shop a")).click();
    }

    public String getLoginUser()
    {
        return driver.findElement(By.className("user")).getText();
    }

    public int getCartCount() {
        return Integer.parseInt(driver.findElement(By.className("cart-count")).getText());
    }

    public void clickCartMenu(){
            driver.findElement(By.cssSelector("#nav-cart a")).click();
    }
}
