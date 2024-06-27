package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Sent_Three_Unregistered_request", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/SentThreeUnregisteredrequest.html",
		"json:target/surefire-reports/json/SentThreeUnregisteredrequest.json" }, publish = true)

public class SentThreeUnregisteredrequest extends TestSuiteInitialization {

}