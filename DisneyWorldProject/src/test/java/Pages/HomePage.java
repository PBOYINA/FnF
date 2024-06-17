package Pages;

import org.openqa.selenium.By;

public class HomePage {

	public static By signin = By.xpath("(//a[text()='Sign In or Create Account'])[1]");
	public static By signout = By.xpath("(//a[@class=\"syndicated-profile__container__link signOut\"])[1]");
	public static By notification = By.xpath("//div[@class=\"syndicated-message-badge__content\"]");
	public static By invites = By.xpath("//a[text()='Manage Invites']");
	//public static By inviteDisplayed = By.xpath("//div[@class=\"tab ng-tns-c114-2\"]");
	public static By inviteDisplayed = By.xpath("//div[@class=\"tab\"]");
	public static By accept = By.xpath("//wdpr-button[text()=' Accept ']");
	public static By billing=By.xpath("//h3[text()=\"Billing Address\"]");
	public static By decline = By.xpath("//wdpr-button[text()=' Decline ']");
}
