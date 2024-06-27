package Pages;

import org.openqa.selenium.By;

public class FriendsAndFamily {
	public static By friendsAndFamily = By.xpath(
			"//ul[@aria-labelledby=\"navigationFooter-myDisneyExperience\"]//a[@href=\"/profile/family-friends/\"]");
	public static By addGuests = By.className("anchor");
	public static By newGuests = By.xpath("//a[@href=\"/profile/family-friends/add-managed-guest\"]");
	public static By newGuests1 = By
			.xpath("//div[@class=\"ng-star-inserted\"]//a[@href=\"/profile/family-friends/add-managed-guest\"]");
	public static By guest = By.xpath("//h4[text()='Guests You May Know']");
	public static By inviteGuests = By.xpath("//h4[@id='setup-card-title']");
	public static By titlehost = By.xpath("//wdpr-single-select[@formcontrolname=\"title\"]");
	public static By newaccount = By
			.xpath("//a[text()=\" Find a Guest from a Walt Disney World Resort hotel reservation \"]");
	public static By createProfile = By.xpath("//div[@aria-labelledby=\"create-card-title\"]");
	public static By title = By.cssSelector("button[aria-label=\"Title\"]");
	public static By select_title=By.cssSelector("li[id=\"option-Mr.\"]");
	public static By firstnameHost = By.cssSelector("wdpr-input[formcontrolname=\"firstName\"]");
	public static By firstname = By.cssSelector("input[aria-label=\"First Name\"]");
	public static By lastnameHost = By.cssSelector("wdpr-input[formcontrolname=\"lastName\"]");
	public static By lastname = By.cssSelector("input[aria-label=\"Last Name\"]");
	public static By emailHost = By.cssSelector("wdpr-input[type=\"email\"]");
	public static By emailid = By.cssSelector("input[aria-label=\"Email Address\"]");
	public static By firstnamehost1 = By.xpath("//wdpr-input[@formcontrolname=\"firstName\"]");
	public static By firstname1 = By.cssSelector("input[aria-label=\"First Name\"]");
	public static By lastnamehost1 = By.xpath("//wdpr-input[@formcontrolname=\"lastName\"]");
	public static By lastname1 = By.cssSelector("input[aria-label=\"Last Name\"]");
	public static By emailhost1 = By.xpath("//wdpr-input[@formcontrolname=\"emailOrPhone\"]");
	public static By email1 = By.cssSelector("input[aria-label=\"Phone Number or Email\"]");
	public static By monthHost = By.xpath("//wdpr-single-select[@formcontrolname=\"month\"]");
	public static By month = By.cssSelector("button[aria-label=\"Month\"]");
	public static By dateHost = By.xpath("//wdpr-single-select[@formcontrolname='day']");
	public static By date = By.cssSelector("button[aria-label='Day");
	public static By search = By.xpath("//div[@class=\"submit-button\"]//wdpr-button[contains(text(),'Search')]");
	public static By send = By
			.xpath("//div[@class=\"search-result-container\"]//wdpr-button[contains(text(),' Send Invite')]");
	public static By settings = By.xpath("(//wdpr-button[text()=\" Settings \"])[1]");
	public static By remove = By.xpath("(//div[@class=\"hide-mobile\"]//wdpr-button[text()=\" Remove \"])[1]");
	public static By yes = By.xpath("(//wdpr-button[text()=\"Yes \"])[1]");
	public static By online = By.xpath("//a[text()='online']");
	public static By search_not_found = By.className("search-result-container");
	public static By sent = By.xpath("//wdpr-tab[@id='sent-invites']");
	public static By cancel1 = By.xpath("(//div[@id=\"friend-\"]//button[contains(text(),'Cancel')])[1]");
	public static By cancel2 = By.xpath("//div[@id=\"friend-\"]//button[contains(text(),'Cancel')]");
	public static By yes_cancel1 = By.xpath("(//wdpr-button[contains(text(),'Yes, Cancel')])[2]");
	//public static By yes_cancel1 = By.xpath("(//wdpr-button[@class=\"ng-star-inserted\"])[3]");
	public static By yes_cancel2 = By.xpath("//wdpr-button[contains(text(),'Yes, Cancel')]");
	public static By done = By.xpath("//wdpr-button[contains(text(),'Done')]");
	public static By resend1 = By.xpath("//button[contains(text(),'Resend')]");
	public static By likesettings = By.xpath("//wdpr-button[contains(text(),'List & Search Settings')]");
	public static By toggle1 = By.cssSelector("div[class='switch-circle']");
	public static By toggle1host = By.xpath("(//wdpr-switch)[1]");
	public static By toggle2host = By.xpath("(//wdpr-switch)[2]");
	public static By toggle2 = By.cssSelector("div[class='switch-circle']");
	public static By save = By.xpath("//wdpr-button/span[text()='Save']");
	public static By resultpresent = By.xpath("//div[@class='avatar-detail charactersmall ng-star-inserted']");
	public static By information = By
			.xpath("//fnf-button//button[text()=' What information can your Family & Friends see? ']");
	public static By dialogHost = By.xpath("//wdpr-modal[@class=\"info-modal ng-star-inserted\"]");
	public static By dialog = By.cssSelector("div[id=\"wrapper\"]");
	public static By close = By.xpath(" //wdpr-button[text()='Close']");
	//public static By sentrequest = By.xpath("//div[@class='tab ng-tns-c114-18']");
	public static By sentrequest = By.xpath("//div[@class='tab']");
	public static By yesremove = By
			.xpath("//div[@class=\"wdpr-modal-dom-wrapper\"]//wdpr-button[contains(text(),'Yes')]");
	public static By avatar = By.xpath("//img[@title=\"Aladdin\"]");

	public static By sharelink=By.xpath("(//button[@class=\"button\"])[2]");
	public static By sharePlanning=By.xpath("(//div[@class=\"header ng-star-inserted\"]//div[@class=\"buttons\"])[1]");
	public static By registerWithEmail=By.cssSelector("input[type=\"email\"]");
	public static By registerWithEmailHost=By.xpath("//wdpr-input[@type=\"email\"]");
	public static By continues=By.xpath("//span[text()='Continue']");
	public static By viewToggleHost=By.xpath("(//wdpr-switch)[3]");
	public static By viewToggle=By.cssSelector("div[class=\"switch-circle\"]");
	public static By friendsave=By.xpath("(//span[text()='Save'])[2]");
	public static By viewToggleHost1=By.xpath("(//wdpr-switch)[4]");
	public static By connect=By.xpath("(//wdpr-button[text()=' Connect My Managed Profiles '])[2]");
	public static By selectAll=By.xpath("//button[text()=' Select All ']");
	public static By sendInvites=By.xpath("//wdpr-button[contains(text(),'Send Invites')]");
	public static By manage=By.xpath("(//h4[text()='Connect My Managed Profiles'])[10]");
	public static By closebutton=By.xpath("//wdpr-button[text()='Close']");
	public static By allow=By.xpath("//wdpr-button[text()=' Allow ']");
	public static By ageHost=By.xpath("//wdpr-single-select[@formcontrolname='age']");
	public static By age=By.cssSelector("button[id=\"custom-dropdown-button\"]");
	public static By select_age=By.cssSelector("li[id=\"option-18\"]");
	public static By select_month=By.cssSelector("li[id=\"option-2\"]");
	public static By select_date=By.cssSelector("li[id=\"option-24\"]");
	public static By mutualfriend=By.xpath("(//div[@class=\"friend-detail-container\"])[2]");
}
