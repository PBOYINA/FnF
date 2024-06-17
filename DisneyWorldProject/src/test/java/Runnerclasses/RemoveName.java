package Runnerclasses;


import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_RemoveName", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/RemoveName.html",
		"json:target/surefire-reports/json/RemoveName.json" }, publish = true)

public class RemoveName extends TestSuiteInitialization {

}
