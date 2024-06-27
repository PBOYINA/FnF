package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_CloseSettings", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/CloseSettings.html",
		"json:target/surefire-reports/json/CloseSettings.json" }, publish = true)

public class CloseSettings extends TestSuiteInitialization {

}

