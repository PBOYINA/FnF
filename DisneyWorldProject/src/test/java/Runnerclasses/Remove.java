package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Remove", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/Remove.html",
		"json:target/surefire-reports/json/Remove.json" }, publish = true)

public class Remove extends TestSuiteInitialization {

}