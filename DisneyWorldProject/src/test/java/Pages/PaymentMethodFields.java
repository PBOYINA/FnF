package Pages;

import org.openqa.selenium.By;

public class PaymentMethodFields {
	public static By cardnumber = By.xpath("//*[@placeholder=\"Card Number\"]");
	public static By cardnumbererrormessage = By.xpath("//*[@id=\"card-number-error\"]/div");
	public static By cardnumbererrormessage1 = By.xpath("//*[contains(text(),\"The card entered cannot be used for this transaction. Please use one of the card types indicated above.\")]/img");

	
	public static By dateErrorCSS = By.cssSelector("[id=\\\"card-expiration-error\\\"]>div>img");
	public static By dateCSS = By.cssSelector("input[formcontrolname=\\\"expiration\\\"]");
	
	
	public static By dateframe = By.id("wallet-ui-main");
	
	public static By date = By.xpath("//*[@placeholder=\"MM/YY\"]");
	//public static By dateErrormessage = By.xpath("//div[contains(text(),\"The expiration date entered occurs in the past. Enter a valid expiration date.\")]");
	public static By dateErrormessage = By.xpath("//*[@id=\"card-expiration-error\"]/div");
	public static By dateErrormessage1 = By.xpath("//*[contains(text(),\"Enter the expiration month and year.\")]/img");
	public static By dateErrormessage2 = By.xpath("//*[contains(text(),\"The expiration date entered occurs in the past. Enter a valid expiration date.\")]/img");
	


	public static By securitycode = By.xpath("//*[@placeholder=\"Security Code\"]");
	//public static By securitycodeErrormessage = By.xpath("//div[contains(text(),\"Enter your card's 3- or 4-digit security code.\")]");
	public static By securitycodeErrormessage = By.xpath("//*[@id=\"security-code-error\"]/div");
	public static By securitycodeErrormessage1 = By.xpath("//*[contains(text(),\"Enter your card's 3- or 4-digit security code.\")]/img");
	
	
	
	public static By nameoncard = By.xpath("//*[@placeholder=\"Name on Card\"]");
	public static By nameerrormessage = By.xpath("//*[@id=\"cardholder-name-error\"]/div");
	public static By nameerrormessage1 = By.xpath("//*[contains(text(),\"Enter cardholder's name as it appears on card.\")]/img");
	public static By nameerrormessage2 = By.xpath("//*[contains(text(),\"Invalid characters entered.\")]/img");
	public static By nameerrormessage3 = By.xpath("//*[contains(text(),\"Enter a name that contains at least 2 characters.\")]/img");
	
	
	public static By addressLine1 = By.xpath("//*[@placeholder=\"Address Line 1\"]");
	public static By addressLine1Errormessage = By.xpath("//*[@id=\"address-line1-error\"]/div");
	public static By addressLine2 = By.xpath("//*[@placeholder=\"Address Line 2\"]");
	public static By addressLine2Errormessage = By.xpath("//*[@id=\"address-line2-error\"]/div");
	
	
	public static By country = By.xpath("//*[@formcontrolname=\"country\"]");
	public static By zipcode = By.xpath("//*[@placeholder=\"ZIP Code\"]");
	public static By zipcodeCanada = By.xpath("//*[@placeholder=\"Postal Code\"]");
	public static By cityTextbox = By.xpath("//*[@placeholder=\"City\"]");
	public static By stateDropdown= By.xpath("//*[@formcontrolname=\"state\"]");
	public static By stateTextbox= By.xpath("//*[@placeholder=\"State / Territory\"]");
	
	
	public static By zipcodeErrormessage = By.xpath("//*[@id=\"postal-code-error\"]/div");
	public static By cityErrormessage = By.xpath("//*[@id=\"city-error\"]/div");
	public static By stateErrormessage = By.xpath("//*[@id=\"state-error\"]/div");
	
	
	//public static By storemycheckbox = By.xpath("//*[contains(text(),\" Store my payment information for use across the Walt Disney Family of Companies. \")]/span");
	public static By paymentconfirm = By.xpath("//*[@aria-label=\"Confirm\"]");
	public static By storemycheckbox = By.xpath("//*[text()=\" Store my payment information for use across the Walt Disney Family of Companies. \"]");
	
	
	
	
	
	
}
