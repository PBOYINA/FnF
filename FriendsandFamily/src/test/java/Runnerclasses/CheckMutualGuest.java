package Runnerclasses;

import Core.TestSuiteInitialization;
@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Checking_Mutual_Guest", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/Check_Mutual_Guest.html",
        "json:target/surefire-reports/json/Check_Mutual_Guest.json" }, publish = true)

public class CheckMutualGuest extends TestSuiteInitialization {

}