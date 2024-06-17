package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Search", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/Search.html",
		"json:target/surefire-reports/json/Search.json" }, publish = true)

public class Search extends TestSuiteInitialization {

}