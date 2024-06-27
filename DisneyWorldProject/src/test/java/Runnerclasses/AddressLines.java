package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=paymentMethod_AddressLine", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/AddressLines.html",
        "json:target/surefire-reports/json/AddressLines.json" }, publish = true)
public class AddressLines extends TestSuiteInitialization{

}
