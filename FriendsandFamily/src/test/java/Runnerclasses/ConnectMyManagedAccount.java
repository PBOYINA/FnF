package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_ConnectingProfiles", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/ConnectMyManagedAccount.html",
		"json:target/surefire-reports/json/ConnectMyManagedAccount.json" }, publish = true)

public class ConnectMyManagedAccount extends TestSuiteInitialization {

}

