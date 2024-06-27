package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=DifferentTicketType", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/FloridaDifferentTicketType.html",
        "json:target/surefire-reports/json/FloridaDifferentTicketType.json" }, publish = true)
public class FloridaDifferentTicketType extends TestSuiteInitialization  {
}
