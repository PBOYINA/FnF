package config;

import java.io.File;
import java.time.Duration;

import static Core.TestSuiteInitialization.execType;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.java.Scenario;

import Core.TestSuiteInitialization;
import io.cucumber.java.*;
import util.ReadPropertyFile;


import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import config.Config;

public class BaseClass extends TestSuiteInitialization {
    public void openBrowser(String url) {

        if (execType.equalsIgnoreCase("local")) {
            System.out.println("executing local");

            // Enable headless mode
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
            driver = new ChromeDriver();    //option
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       }
        driver.get(url);
    }

    public void closebrowser() {
        Set<String> allbrowser = driver.getWindowHandles();
        for (String i : allbrowser) {
            driver.switchTo().window(i);
            driver.close();
        }
        driver.quit();
    }

}
