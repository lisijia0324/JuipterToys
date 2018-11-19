package com.planittesting.automation.tests.cucumber.steps.Driver;

import com.planittesting.automation.tests.cucumber.steps.Driver.driverManager.*;

public class DriverManagerFactory {
    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        if (type == null) {
            driverManager = new ChromeDriverManager();
        }else {
            switch (type) {
                case CHROME:
                    driverManager = new ChromeDriverManager();
                    break;
                case IE:
                    driverManager = new IEDriverManager();
                    break;
                case FIREFOX:
                    driverManager = new FireFoxDriverManager();
                    break;
            }
        }
        return driverManager;

    }
}
