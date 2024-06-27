package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=payment_creditcardnumber", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/creditcardtextbox.html",
        "json:target/surefire-reports/json/creditcardtextbox.json" }, publish = true)
public class creditcardtextbox extends TestSuiteInitialization{

}
