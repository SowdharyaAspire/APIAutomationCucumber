package com.reqres.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@smoke", features = "src/test/resources/com/reqres/features/APITest.feature", glue = "com.reqres.stepdef", dryRun = false, plugin = {
		"pretty", "html:FeaturesReport", "html:target/reports/htmlreports/reports.html", "json:target/reports/Cucumber.json" })
public class TestRunner {

}
