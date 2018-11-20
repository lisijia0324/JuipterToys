package com.planittesting.automation.tests.cucumber;

import com.planittesting.automation.tests.cucumber.steps.Driver.driverManager.DriverManager;
import com.planittesting.automation.tests.cucumber.steps.Driver.DriverManagerFactory;
import com.planittesting.automation.tests.cucumber.steps.Driver.DriverType;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Use Pico-Container to run World class anc create object
 */
public class World {
    private String browser = System.getProperty("browser");

    private WebDriver driver;
    private DriverManager driverManager;
//    private Environment testEnvironment = ConfigFactory.create(Environment.class);

    public WebDriver getDriver() {
        return driver;
    }

    private void verifyBrowser(){

        if (browser == null){
            driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        }else {
            DriverType browserType = DriverType.valueOf(browser);
            driverManager = DriverManagerFactory.getManager(browserType);
        }
    }

    public void setDriver() throws Exception {
        verifyBrowser();
        this.driver = driverManager.getDriver();
    }

    public void launchJupiterToysTests(){
        Assert.assertEquals("Jupiter Toys 2", driver.getTitle());
    }

    public void quitDriver() {
        driverManager.quitDriver();
    }

}
