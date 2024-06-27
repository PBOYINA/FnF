package Runnerclasses;
import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=payment_CityandState", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/CityandStateRunner.html",
        "json:target/surefire-reports/json/CityandStateRunner.json" }, publish = true)
public class CityandStateRunner extends TestSuiteInitialization{

}
