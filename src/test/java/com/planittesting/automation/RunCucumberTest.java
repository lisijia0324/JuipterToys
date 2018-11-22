package com.planittesting.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/acceptance/resources/features",
        tags = "@Debug",
        glue = "com.planittesting.automation.tests",
        plugin = {"pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
)
public class RunCucumberTest {


}
