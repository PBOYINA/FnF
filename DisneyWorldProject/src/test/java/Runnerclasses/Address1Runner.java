package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=paymentMethod_Address1", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/Address1Runner.html",
        "json:target/surefire-reports/json/Address1Runner.json" }, publish = true)

public class Address1Runner extends TestSuiteInitialization{

}
