package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Invite_Two_Guests_Resend", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/InviteTwoGuestsResend.html",
		"json:target/surefire-reports/json/InviteTwoGuestsResend.json" }, publish = true)

public class InviteTwoGuestsResend extends TestSuiteInitialization {

}