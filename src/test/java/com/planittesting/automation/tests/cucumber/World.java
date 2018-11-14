package com.planittesting.automation.tests.cucumber;

import com.planittesting.automation.tests.cucumber.steps.Driver.driverManager.DriverManager;
import com.planittesting.automation.tests.cucumber.steps.Driver.DriverManagerFactory;
import com.planittesting.automation.tests.cucumber.steps.Driver.DriverType;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Use Pico-Container to run World class anc create object
 */
public class World {

    private DriverManager driverManager = DriverManagerFactory.getManager(DriverType.IE);
    private WebDriver driver;
    private Environment testEnvironment;
    protected static Properties systemProps;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver() {
        this.driver = driverManager.getDriver();
        System.out.println(driver);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to("http://jupiter2.cloud.planittesting.com/");
//        driver.navigate().to(testEnvironment.url());
    }


    public void launchJupiterToysTests(){
        Assert.assertEquals("Jupiter Toys 2", driver.getTitle());
    }

    public void quitDriver() {
        driverManager.quitDriver();
    }

}
