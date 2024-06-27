package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=FloridaVaidatewithDifferentAddress", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/FloridaVaidatewithDifferentAddress.html",
        "json:target/surefire-reports/json/FloridaVaidatewithDifferentAddress.json" }, publish = true)
public class FloridaValidatedifferentaddress extends TestSuiteInitialization{
}
