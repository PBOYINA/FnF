package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_ViewPlans", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/AllowToviewYourPlans.html",
		"json:target/surefire-reports/json/AllowToviewYourPlans.json" }, publish = true)

public class AllowToviewYourPlans extends TestSuiteInitialization {

}

