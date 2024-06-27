package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Payment_NoCreditCard", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/NoCreditCard.html",
        "json:target/surefire-reports/json/NoCreditCard.json" }, publish = true)

public class NoCreditCard extends TestSuiteInitialization {

}


