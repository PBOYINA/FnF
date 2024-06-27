package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=FloridaFieldsValidation", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/FloridaFields.html",
        "json:target/surefire-reports/json/FloridaFields.json" }, publish = true)

public class FloridaFields extends TestSuiteInitialization{
}
