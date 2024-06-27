package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Payment_securitycode", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/SecuritycodeRunner.html",
        "json:target/surefire-reports/json/SecuritycodeRunner.json" }, publish = true)

public class SecuritycodeRunner extends TestSuiteInitialization{

}
