package com.planittesting.automation.tests.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@Debug",
        glue = "com.planittesting.automation.tests",
        plugin = {"pretty", "html:target/cucumber-reports","json:target/cucumber.json" }
)
public class RunCucumberTest {
}
