package com.planittesting.automation.tests.cucumber.steps.Driver;

import com.planittesting.automation.tests.cucumber.steps.Driver.driverManager.ChromeDriverManager;
import com.planittesting.automation.tests.cucumber.steps.Driver.driverManager.DriverManager;
import com.planittesting.automation.tests.cucumber.steps.Driver.driverManager.IEDriverManager;

public class DriverManagerFactory {
    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case IE:
                driverManager = new IEDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;

    }
}
