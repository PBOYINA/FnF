//package util;
//
//
//
//
//
//To work with JIRA using x-ray
//
//
//
//
//
//
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import org.apache.commons.io.Charsets;
//import org.apache.commons.io.IOUtils;
//import org.apache.http.HttpEntity;
//import org.apache.http.auth.UsernamePasswordCredentials;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.ContentType;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.entity.mime.MultipartEntityBuilder;
//import org.apache.http.entity.mime.content.FileBody;
//import org.apache.http.impl.auth.BasicScheme;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import com.codeborne.selenide.impl.ScreenShotLaboratory;
//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//
//public class TestResultManager {
//
//	public static final String ENDPOINT = "https://jira.acos.no/"; // your jira server URL
//	public static final String TM4J_RESULT_ENDPOINT = "rest/atm/1.0/testrun/";
//	public static final String Template = "resources/TM4J_Template/tm4j_create_execution.json";
//	private String testCycleID;
//	private String testCaseID;
//	private JsonObject reqBody;
//	public static final String testResultCommonMessage = "Testcase Successfully Executed";
//
//	/**
//	 * This method is used to get the testCycle ID from configuration property file.
//	 * @param testCycleID
//	 */
//	public TestResultManager(String testCycleID) {
//
//		this.testCycleID = testCycleID;
//		try {
//			this.reqBody = new Gson().fromJson(IOUtils.toString(new FileReader((Template))), JsonObject.class);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * This method is used to set testcaseID 
//	 * @param testcaseID
//	 */
//	public void setTestcaseID(String testcaseID) {
//		this.testCaseID = testcaseID;
//	}
//
//	/**
//	 * This method is used to retrieve testcaseID from TestSuite Initialization Class
//	 * @return
//	 */
//	public String getTestCaseID() {
//		return testCaseID;
//	}
//
//	/**
//	 * This method is used to retrieve testCycle ID from TestSuite Initialization Class
//	 * @return
//	 */
//	public String getTestCycleID() {
//		return testCycleID;
//	}
//
//	/**
//	 * This method is used to retrieve get request Payload from TestSuite Initialization Class
//	 * @return
//	 */
//	public JsonObject getReqPayload() {
//		return reqBody;
//	}
//
//	/**
//	 * This method is used to set status from TestSuite Initialization Class
//	 * @param status
//	 * @return
//	 */
//	public TestResultManager setStatus(String status) {
//		getReqPayload().addProperty("status", status);
//		getReqPayload().get("scriptResults").getAsJsonArray().get(0).getAsJsonObject().addProperty("status", status);
//		return this;
//	}
//
//	/**
//	 * This method is used to retrieve comment from TestSuite Initialization Class
//	 * @param comment
//	 * @return
//	 */
//	public TestResultManager setComment(String comment) {
//		getReqPayload().addProperty("comment", comment);
//		return this;
//	}
//
//	/**
//	 * This method is used to retrieve Actual Result comments
//	 * @param arc
//	 * @param exectime
//	 * @return
//	 */
//	public TestResultManager setActualResultComment(String arc, long exectime) {
//		getReqPayload().get("scriptResults").getAsJsonArray().get(0).getAsJsonObject().addProperty("comment", arc);
//		getReqPayload().getAsJsonObject().addProperty("executionTime", exectime);
//		return this;
//	}
//
//	/**
//	 * This method is used to update Test Result to JIRA server. If its a fail, screenshot will also be sent
//	 * @return
//	 * @throws UnsupportedOperationException
//	 * @throws ClientProtocolException
//	 * @throws IOException
//	 */
//	@SuppressWarnings("deprecation")
//	public TestResultManager updateTestResult()
//			throws UnsupportedOperationException, ClientProtocolException, IOException {
//		CloseableHttpClient httpclient = HttpClientBuilder.create().build();
//		String req = new Gson().toJson(getReqPayload());
//		StringEntity se = new StringEntity(req);
//		System.out.println(se);
//		String constructEndPOint = ENDPOINT + TM4J_RESULT_ENDPOINT + getTestCycleID() + "/testcase/" + getTestCaseID()
//				+ "/testresult";
//		
//		
//		
//		HttpPost post = new HttpPost(constructEndPOint);
//		post.addHeader(BasicScheme.authenticate(
//				new UsernamePasswordCredentials("testautomation", "7XhIoed3iLYok7ucMlt184Z3eNt6z"), "UTF-8", false));
//		post.addHeader("Content-Type", "application/json");
//		post.setEntity(se);
//		
//		try {
//			String testresultID = new Gson()
//					.fromJson(IOUtils.toString(httpclient.execute(post).getEntity().getContent(), Charsets.UTF_8),
//							JsonObject.class)
//					.get("id").getAsString();
//			if (getReqPayload().get("status").getAsString().equalsIgnoreCase("fail")) {
//				screenshotAttachment(testresultID);
//			}
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
//		
//		return this;
//		
//		
//
//	}
//
//	/**
//	 * This method is used to take screenshot and sent it to updateTestResult method.
//	 * @param testresultID - This is obtained from UpdateTestResult method by querying JIRA
//	 * @throws UnsupportedOperationException
//	 * @throws ClientProtocolException
//	 * @throws IOException
//	 */
//	@SuppressWarnings("deprecation")
//	public void screenshotAttachment(String testresultID)
//			throws UnsupportedOperationException, ClientProtocolException, IOException {
//		File screenshotFile = new File(fileName);
//		
//		CloseableHttpClient httpclient = HttpClientBuilder.create().build();
//		String endPoint = ENDPOINT + "rest/atm/1.0/testresult/" + testresultID + "/attachments";
//		/*HttpEntity entity = MultipartEntityBuilder.create()
//				.addPart("file", new FileBody(ScreenShotLaboratory.getInstance().getLastScreenshot()))
//				.setContentType(ContentType.MULTIPART_FORM_DATA).build();
//		System.out.println("Screenshot :" +new FileBody(ScreenShotLaboratory.getInstance().getLastScreenshot()));*/
//		
//		HttpEntity entity = MultipartEntityBuilder.create()
//				.addPart("file", new FileBody(screenshotFile))
//				.setContentType(ContentType.MULTIPART_FORM_DATA).build();
//		System.out.println("Screenshot :" +new FileBody(screenshotFile));
//		
//		HttpPost post = new HttpPost(endPoint);
//		post.addHeader(BasicScheme.authenticate(
//				new UsernamePasswordCredentials("testautomation", "7XhIoed3iLYok7ucMlt184Z3eNt6z"), "UTF-8", false));
//		post.setEntity(entity);
//		httpclient.execute(post);
//	}
//
//}