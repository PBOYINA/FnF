package Pages;

import org.openqa.selenium.By;

public class EmailPage {
	public static By emailreceived = By.xpath("//td[contains(text(),\"You have a new Family & Friends invite!\")]");
	public static By mailinatorSearch = By.id("inbox_field");
	public static By go = By.className("primary-btn");
}
