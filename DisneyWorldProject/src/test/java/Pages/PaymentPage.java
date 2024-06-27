package Pages;

import org.openqa.selenium.By;

public class PaymentPage {
    public static By paymentmode= By.xpath("//a[@href=\"/profile/payment-methods\"]");
    public static By paymentHeader= By.xpath("//h1[text()='Payment Methods']");
    public static By addPayment= By.xpath("//div[@class=\"wallet-add-link\"]");
    public static By resortHeader= By.xpath("//h3[text()='Disney Resort Hotel Guests']");
    public static By frontDesk= By.xpath("//div[text()='Visit your hotel ']");
    public static By setPin= By.xpath("//button[text()=' Set Room Account PIN ']");
    public static By resortContent= By.xpath("//div[@class='profile-module-content']");
  //*[@class="cancel-link"]
  //public static By cancel= By.xpath("//*[@class=\"cancel-link\"]");
    public static By cancel= By.xpath("//div[@class=\"cancel-add-payment\"]");
//    public static By conform=By.xpath("//div[@aria-label=\"Confirm\"]");
   public static By radiobutton= By.xpath("//span[@class=\"checkmark\"]");
//    public static By cardname= By.xpath("//input[@formcontrolname=\"cardNumber\"]");
//    public static By monthyear= By.xpath("//input[@formcontrolname=\"expiration\"]");
//    public static By securitycode= By.xpath("//input[@formcontrolname=\"securityCode\"]");
//    public static By nameoncard= By.xpath("//input[@formcontrolname=\"cardholderName\"]");
//    public static By address1= By.xpath("//input[@formcontrolname=\"line1\"]");
//    public static By address2= By.xpath("//input[@formcontrolname=\"line2\"]");
//    public static By zipcode= By.xpath("//input[@formcontrolname=\"postalCode\"]");
//    public static By city= By.xpath("//input[@formcontrolname=\"city\"]");
//    public static By state= By.xpath("//input[@formcontrolname=\"state\"]");
//    public static By storepaymentinfo= By.xpath("//input[@formcontrolname=\"legalConsentToStoreCard\"]");
   // public static By iframe1= By.xpath("//iframe[@src=\"https://wallet.wdprapps.disney.com/iframe?fromOrigin=https://disneyworld.disney.go.com\"]");
    public static By iframe2 =By.xpath("//iframe[@title=\"Wallet Frame\"]");
    public static By iframe1 =By.xpath("//*[@id=\"wallet-ui-main\"]");

}
