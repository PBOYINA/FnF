package Runnerclasses;

import Core.TestSuiteInitialization;
@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Remove_Multiple_Guests", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/RemoveMultipleUsers.html",
        "json:target/surefire-reports/json/RemoveMultipleUsers.json" }, publish = true)

public class RemoveMultipleUsers extends TestSuiteInitialization {

}