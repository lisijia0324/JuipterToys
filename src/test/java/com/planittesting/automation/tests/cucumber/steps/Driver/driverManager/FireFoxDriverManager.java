package com.planittesting.automation.tests.cucumber.steps.Driver.driverManager;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireFoxDriverManager extends DriverManager {

    private GeckoDriverService ffService;

    @Override
    protected void startService() {
        if (null == ffService) {
            try {
                ffService = new GeckoDriverService.Builder()
                        .usingAnyFreePort()
                        .build();
                ffService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (null != ffService && ffService.isRunning())
            ffService.stop();
    }

    @Override
    protected void createDriver() {
        DesiredCapabilities  capabilities =  new DesiredCapabilities();
        FirefoxOptions ffOption = new FirefoxOptions();
        capabilities.setCapability(FirefoxDriver.MARIONETTE, true);
        ffOption.merge(capabilities);
        driver = new FirefoxDriver(ffOption);
    }
}
