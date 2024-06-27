package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=date_textbox", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/Datefieldrunner.html",
        "json:target/surefire-reports/json/Datefieldrunner.json" }, publish = true)

public class Datefieldrunner extends TestSuiteInitialization{

}
