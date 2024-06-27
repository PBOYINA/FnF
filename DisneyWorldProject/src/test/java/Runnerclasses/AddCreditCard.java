package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Payment_AddCreditCard", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/AddCreditCard.html",
        "json:target/surefire-reports/json/AddCreditCard.json" }, publish = true)

public class AddCreditCard extends TestSuiteInitialization {

}