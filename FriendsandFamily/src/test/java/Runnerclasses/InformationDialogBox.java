
package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=Disney_InformationDialog", glue = "stepDefinition", monochrome = true, plugin = {
		"pretty", "html:target/surefire-reports/html/InformationDialogBox.html",
		"json:target/surefire-reports/json/InformationDialogBox.json" }, publish = true)

public class InformationDialogBox extends TestSuiteInitialization {

}
