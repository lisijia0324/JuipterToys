package com.planittesting.automation.tests.cucumber;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScenarioSetup {

    private World world;

    // Constract to use World class
    public ScenarioSetup(World world){
        this.world = world;
    }

    @Before
    public void setupTest(){
        world.setDriver();
        world.launchJupiterToysTests();
    }

    @After
    public void cleanupTest(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) world.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
        }

        world.quitDriver();
    }

}
