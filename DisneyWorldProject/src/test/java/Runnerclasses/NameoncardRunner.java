package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=paymentmethod_nameoncard", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/NameoncardRunner.html",
        "json:target/surefire-reports/json/NameoncardRunner.json" }, publish = true)
public class NameoncardRunner extends TestSuiteInitialization{

}
