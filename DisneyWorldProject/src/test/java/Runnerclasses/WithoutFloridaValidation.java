package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Continue_without_validation", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/WithoutFlorida.html",
        "json:target/surefire-reports/json/WithoutFlorida.json" }, publish = true)

public class WithoutFloridaValidation extends TestSuiteInitialization {
}
