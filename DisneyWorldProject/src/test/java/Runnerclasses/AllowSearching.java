package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Allow_Search", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/AllowSearching.html",
		"json:target/surefire-reports/json/AllowSearching.json" }, publish = true)

public class AllowSearching extends TestSuiteInitialization {

}