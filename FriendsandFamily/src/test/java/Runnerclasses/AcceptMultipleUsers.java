package Runnerclasses;

import Core.TestSuiteInitialization;
@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_Multiple_Accept", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/AcceptMultipleUsers.html",
        "json:target/surefire-reports/json/AcceptMultipleUsers.json" }, publish = true)

public class AcceptMultipleUsers extends TestSuiteInitialization {

}