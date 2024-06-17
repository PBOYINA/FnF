package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Accept", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/Accept.html",
		"json:target/surefire-reports/json/Accept.json" }, publish = true)

public class Accept extends TestSuiteInitialization {

}