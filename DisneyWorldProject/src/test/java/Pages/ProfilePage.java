package Pages;

import org.openqa.selenium.By;



public class ProfilePage {
    public static By avatar= By.xpath("//div[@class=\"avatar-container charactercircle\"]");
public static By guestsname= By.xpath("//div[@class=\"guest-name\"]");
public static By paymentname=By.xpath("//div[text()='Payment Method']");
    public static By cc=By.xpath("//div[text()='Store a credit or debit card and PIN.']");
}
