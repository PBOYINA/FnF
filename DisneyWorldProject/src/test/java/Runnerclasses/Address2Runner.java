package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=paymentMethod_Address2", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/Address2Runner.html",
        "json:target/surefire-reports/json/Address2Runner.json" }, publish = true)

public class Address2Runner extends TestSuiteInitialization{

}
