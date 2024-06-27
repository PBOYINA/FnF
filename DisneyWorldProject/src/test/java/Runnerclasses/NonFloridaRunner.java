package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=NonFloridaAccount", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/NonFlorida.html",
        "json:target/surefire-reports/json/NonFlorida.json" }, publish = true)

public class NonFloridaRunner extends TestSuiteInitialization{
}
