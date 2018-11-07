package com.planittesting.automation.tests.cucumber.JUnitTests;

import com.planittesting.automation.tests.cucumber.Environment;
import cucumber.runtime.Env;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// Common code to initiate driver and quit driver
public abstract class BaseTestSuit {

    protected WebDriver driver;

    @BeforeEach
    public void setupTest(){
        driver = new ChromeDriver();        // Bad example
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);         // Bad example
        driver.navigate().to("http://jupiter2.cloud.planittesting.com/");
    }

    @AfterEach
    public void cleanupTest(){
        driver.quit();
    }
}
