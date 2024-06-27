package Pages;

import org.openqa.selenium.By;



public class LoginPage {
	public static By frame = By.id("oneid-iframe");
	public static By user = By.id("InputIdentityFlowValue");
	public static By first = By.id("InputFirstName");
	public static By last = By.id("InputLastName");
	public static By passwords = By.id("password-new");
	public static By date = By.id("InputDOB");
	public static By pincode = By.id("BillingAddress-PostalCode");
	public static By city = By.id("BillingAddress-CityInput");
	public static By add = By.id("BillingAddress-Line1Input");
	public static By check1 = By.id("WDW-NGE2-TOU");
	public static By check2 = By.id("BU_*_LOCATION_*__3bddd0f841ecc38a9a08183b0f40fce0");
	//public static By createAccount = By.xpath("//button[text()=\"Create Account\"]");
	public static By createAccount = By.xpath("//button[text()=\"Agree & Continue\"]");
	public static By createAccountPage = By.className("modal-body");
	public static By passwd = By.id("InputPassword");	
	public static By sign_in = By.xpath("//button[@data-testid='BtnSubmit']");
	public static By ok=By.xpath("//button[@id=\"BtnSubmit\"]");
}
