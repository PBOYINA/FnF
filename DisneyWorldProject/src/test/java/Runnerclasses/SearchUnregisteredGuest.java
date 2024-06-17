package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Search_Unregistered_Guest", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/SearchUnregisteredGuest.html",
		"json:target/surefire-reports/json/SearchUnregisteredGuest.json" }, publish = true)

public class SearchUnregisteredGuest extends TestSuiteInitialization {

}