package Core;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static Core.SauceLabsConfig.*;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.apache.http.client.ClientProtocolException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.websak.util.TestResultManager;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

public class TestSuiteInitialization {

	private static final System PropertiesHelper = null;
	//public SessionObject ssObj;
	public static ThreadLocal<String[]> browserDetails;
	//public static ThreadLocal<List<String>> jp = new ThreadLocal<>();
	public static Path screenshotPath;
	//public TestResultManager testResultManager;
	public static ThreadLocal<String> tcName;
	public static ThreadLocal<File> screenshotName;
	public static WebDriver driver;
	public static String execType;

	String htmlPath = new File("./target/surefire-reports/html").getAbsolutePath();
	File file2 = new File(htmlPath);

	String outputPath = new File("./target/surefire-reports/json").getAbsolutePath();
	File file = new File(outputPath);

	String reportPath = new File("./target/Report").getAbsolutePath();
	File file1 = new File(reportPath);

	protected TestNGCucumberRunner testNGCucumberRunner;

	@BeforeSuite
	public void setUp() {

		try {

			FileUtils.deleteDirectory(file1);
		} catch (Exception e) {

		}
		initializeObject();
	}

	@Parameters({ "browserName", "browserVersion", "isRemoteEnabled","executionType","username","accessToken","testname" })
	@BeforeClass
	public void setUp(String browserName, String browserVersion, String isRemoteEnabled, String executionType,String username, String accessToken,String testname) throws Exception {
		 if ("local".equalsIgnoreCase(executionType)) {
			 System.out.println("local executing");
		// Initialize the testNGCucumberRunner
	    testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    browserDetails.set(new String[] { browserName, browserVersion, isRemoteEnabled });
	    execType = "local";
	}
		 else if ("saucelabs".equalsIgnoreCase(executionType)) {
		System.out.println("executing sauce lab");
	        // Create WebDriver instance for Sauce Labs
	        driver = SauceLabsConfig.createDriver (username, accessToken, testname);
	        driver.manage().window().maximize();
	        execType = "saucelabs";
	    }
	}

//	@BeforeMethod
//	public void beforemethod() {
//		testResultManager = new TestResultManager(SessionObject.getTestCycleID());
//		String className = this.getClass().getSimpleName();
//		tcName.set(className.replace("_", "-"));
//	}				------------------------------------------->JIRA

	/**
	 * This method is executed after each and every test case.
	 *
	 * @param testResult - This get the result status from testNG (pass or Fail)
	 * @throws UnsupportedOperationException
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
//	@AfterMethod()
//	public void tearDown(ITestResult testResult)
//			throws UnsupportedOperationException, ClientProtocolException, IOException {
//		String resultStatus = (testResult.isSuccess()) ? "Pass" : "Fail";
//		System.out.println("Feature Name" + testResult.getParameters()[0]);
//		System.out.println("Result ==> " + resultStatus);
//		System.out.println(browserDetails.get()[0]);
//
//		/**
//		 * JIRA integration. Calling TestResultManager methods to update status.
//		 */
//
//		String comment = (resultStatus.equals("Pass"))
//				? TestResultManager.testResultCommonMessage + "Browser under Test: " + browserDetails.get()[0]
//						+ ". Browser version : " + browserDetails.get()[1]
//				: "Testcase Failed. Browser under Test: " + browserDetails.get()[0] + ". Browser version: "
//						+ browserDetails.get()[1];
//		String testComment = "";
//		if (testResult.getThrowable() != null) {
//			testComment = testResult.getThrowable().getLocalizedMessage();
//			try {
//				testComment = testComment.replaceAll("[�]", "aa").toString();
//				testComment = testComment.replaceAll("[�]", "o").toString();
//				testComment = testComment.replaceAll("[�]", "a").toString();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//
//		testResultManager.setTestcaseID(tcName.get());
//		testResultManager.setStatus(resultStatus);
//		testResultManager.setActualResultComment(testComment, testResult.getEndMillis() - testResult.getStartMillis());
//		testResultManager.setComment(comment);
//		//testResultManager.updateTestResult();
//
//		System.out.println("result updated to jira");
//
//	}						------------------------------------------------->Jira

	/**
	 * This method is used for Initializing browser instances, Loading configuration
	 * files, Creating Screenshot path
	 */
	public void initializeObject() {
		// Initialize ThreadLocal variables
		browserDetails = new ThreadLocal();
		//tcName = new ThreadLocal<>();
		screenshotName = new ThreadLocal();

		// Generate directory name based on current timestamp
		String fileDirName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss"));

		try {
			// Create screenshot directory if it doesn't exist and resolve file path
			screenshotPath = Files.createDirectories(Paths.get("screenshot")).resolve(fileDirName).toAbsolutePath();
		} catch (IOException e) {
			// Handle IOException if directory creation fails
			e.printStackTrace();
		}
	}

	@Test(retryAnalyzer = RetryAnalyzer.class,groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(PickleWrapper pickleEvent, FeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runScenario(pickleEvent.getPickle());
	}

	@DataProvider
	public Object[][] features() {
		if (testNGCucumberRunner == null) {
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		if (testNGCucumberRunner != null) {
            testNGCucumberRunner.finish();
        }
	}
	@AfterMethod
	 public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            //driver.close();
        }
    }

}
