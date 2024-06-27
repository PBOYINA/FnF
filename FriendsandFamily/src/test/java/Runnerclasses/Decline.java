package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", 
tags = "@TestCaseKey=Disney_Decline", 
glue = "stepDefinition", 
monochrome = true,
plugin = {
		"pretty", "html:target/surefire-reports/html/Decline.html",
		"json:target/surefire-reports/json/Decline.json" },
publish = true)

public class Decline extends TestSuiteInitialization {

}