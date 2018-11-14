package com.planittesting.automation.tests.cucumber.steps.Driver.driverManager;

import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverManager extends DriverManager {

    private InternetExplorerDriverService ieService;

    @Override
    protected void startService() {
        if (null == ieService) {
            try {
                ieService = new InternetExplorerDriverService.Builder()
                        .usingAnyFreePort()
                        .build();
                ieService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (null != ieService && ieService.isRunning())
            ieService.stop();
    }

    @Override
    protected void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
        capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
        capabilities.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,true);
        capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false);
        capabilities.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, "accept");
        capabilities.setCapability("ignoreProtectedModeSettings", true);
        capabilities.setCapability("disable-popup-blocking", true);
        InternetExplorerOptions ieOption = new InternetExplorerOptions();
        ieOption.merge(capabilities);
        driver = new InternetExplorerDriver(ieOption);
    }
}
