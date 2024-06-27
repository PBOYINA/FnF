package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=paymentMethod_checkbox", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/Checkboxrunner.html",
        "json:target/surefire-reports/json/Checkboxrunner.json" }, publish = true)
public class Checkboxrunner extends TestSuiteInitialization{

}
