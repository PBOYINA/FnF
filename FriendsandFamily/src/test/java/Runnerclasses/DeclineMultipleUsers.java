package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features",
        tags = "@TestCaseKey=Decline_Multiple_Users",
        glue = "stepDefinition",
        monochrome = true,
        plugin = {
                "pretty", "html:target/surefire-reports/html/DeclineMultipleUsers.html",
                "json:target/surefire-reports/json/DeclineMultipleUsers.json" },
        publish = true)

public class DeclineMultipleUsers extends TestSuiteInitialization {

}