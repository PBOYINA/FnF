package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_PassPhotos", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/ViewDisneyPassPhotos.html",
		"json:target/surefire-reports/json/ViewDisneyPassPhotos.json" }, publish = true)

public class ViewDisneyPassPhotos extends TestSuiteInitialization {

}