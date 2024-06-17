package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_CreateProfileYouManage", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/CreateProfileYouManage.html",
		"json:target/surefire-reports/json/CreateProfileYouManage.json" }, publish = true)

public class CreateProfileYouManage extends TestSuiteInitialization {

}

