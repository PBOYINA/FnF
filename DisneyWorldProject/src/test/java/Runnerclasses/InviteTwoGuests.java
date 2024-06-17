package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Invite_Two_Guests", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/InviteTwoGuests.html",
		"json:target/surefire-reports/json/InviteTwoGuests.json" }, publish = true)

public class InviteTwoGuests extends TestSuiteInitialization {

}