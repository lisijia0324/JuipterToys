package com.planittesting.automation.tests.cucumber.steps.Driver.driverManager;

import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverManager extends DriverManager {

    private InternetExplorerDriverService ieService;
//    static final String IE_OPTIONS = "se:ieOptions";

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
//        InternetExplorerOptions options = new InternetExplorerOptions();
//        options.addArguments("test-type");
//        capabilities.setCapability(IE_OPTIONS, options);
        driver = new InternetExplorerDriver(ieService, capabilities);
    }
}
