package Runnerclasses;


import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_LikeAndShare_Settings", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/LikeSettings.html",
		"json:target/surefire-reports/json/LikeSettings.json" }, publish = true)

public class LikeSettings extends TestSuiteInitialization {

}

