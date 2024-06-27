package Runnerclasses;

import Core.TestSuiteInitialization;

@io.cucumber.testng.CucumberOptions(features = "resources/Features", tags = "@TestCaseKey=paymentMethod_allFields", glue = "stepDefinition", monochrome = true, plugin = {
        "pretty", "html:target/surefire-reports/html/PaymentmethodAllField.html",
        "json:target/surefire-reports/json/PaymentmethodAllField.json" }, publish = true)
public class PaymentmethodAllField extends TestSuiteInitialization{

}
