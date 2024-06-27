package Runnerclasses;


import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=payment_zipcode", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/ZipcodeRunner.html",
        "json:target/surefire-reports/json/ZipcodeRunner.json" }, publish = true)
public class ZipcodeRunner extends TestSuiteInitialization {

}
