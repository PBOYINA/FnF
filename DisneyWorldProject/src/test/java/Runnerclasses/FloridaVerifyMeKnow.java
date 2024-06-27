package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=VerifyMeButton", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/FloridaVerifyMeKnow.html",
        "json:target/surefire-reports/json/FloridaVerifyMeKnow.json" }, publish = true)

public class FloridaVerifyMeKnow extends TestSuiteInitialization{
}
