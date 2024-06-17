
package Runnerclasses;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="resources/Features/",
        glue= {"stepDefinition"},
        monochrome=true,
        plugin= {"pretty","junit:target/JUnitReports/DisneyWorld.xml",
                "json:target/JSONReports/DisneyWorld.json",
                "html:target/HtmlReports/DisneyWorld.html"})

public class DisneyWorldRunner {

}
