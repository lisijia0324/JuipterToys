package com.planittesting.automation.tests.cucumber.steps.Driver.driverManager;

import com.planittesting.automation.PropertyManager;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public abstract class DriverManager {

    protected WebDriver driver;
    protected abstract void startService();
    protected abstract void stopService();
    protected abstract void createDriver();
    public PropertyManager propertyManager;

    public void quitDriver() {
        if (null != driver) {
            driver.quit();
            stopService();
            driver = null;
        }
    }

    public WebDriver getDriver() throws Exception {
        if (null == driver) {
            startService();
            createDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            propertyManager = new PropertyManager();
            driver.navigate().to(propertyManager.getPropertyValue("url"));
        }
        return driver;
    }
}