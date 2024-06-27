package Pages;

import org.openqa.selenium.By;

public class FloridaResidentValidation {

    public static By disneyprivacy1 = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    public static By disneyprivacy2 = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");



    public static By US = By.id("BillingAddress-CountrySelect");
    public static By specialoffer = By.xpath("(//*[contains(text(),\"Special Offers\")])[2]");
    public static By specialFlorida = By.xpath("//*[@id=\"specialOffer-flfy24wdwdiscoverdisney\"]");
    public static By Purchasenow = By.xpath("//*[contains(text(),\"Purchase Now\")]");
    public static By state = By.xpath("//*[@id=\"BillingAddress-RegionSelect\"]");
    public static By ContinueCart = By.xpath("//*[@class=\"checkOutLoginButtonWrapper\"]");

    public static By FloridaFrame = By.xpath("//*[@id=\"pepValidateResidencyIframeContainer\"]");
    public static By FloridaFirstname = By.xpath("//*[@id=\"resident_first-name\"]");
    public static By FloridaDate = By.xpath("//*[@id=\"resident_date-of-birth\"]");
    public static By FloridaAddress = By.xpath("//*[@id=\"resident_street\"]");
    public static By FloridaCity = By.xpath("//*[@id=\"resident_city\"]");
    public static By FloridaZip = By.xpath("//*[@id=\"resident_zip\"]");


    public static By selectAddress = By.xpath("//*[contains(text(),\"Tampa, FL 33603\")]");
    public static By Verifyme = By.xpath("//*[@name=\"commit\"]");


   // public  static By validationIframe = By.xpath("//*[@id=\"pepValidateResidencyIframeContainer\"]");
   public  static By validationIframe = By.cssSelector("[id=\"pepValidateResidencyIframeContainer\"]");
    public  static By validationUnable = By.xpath("//*[contains(text(),\"We were unable to verify your Florida residency using ID.me.\")]");
    public  static By validationContinue = By.xpath("//*[@id=\"btnContinue\"]");

   // public  static By continuewithoutID = By.xpath("//*[contains(text(),\"Continue Without using ID.me\")]");
    public  static By continuewithoutID = By.xpath("//*[@id=\"edit_resident_3343119\"]/div/div[2]/a");

    //Florida ticket type
    public  static By pagecontent = By.cssSelector("#pageContent > div > tickets-spa");
    public  static By ticketconfig = By.cssSelector("div > div:nth-child(6) > uirouter-uiview > tickets-config-page-v2\n");
    public  static By numdays = By.cssSelector("#numDays");
    public  static By radio3 = By.cssSelector("#radio-3");
    public  static By radio4 = By.cssSelector("#radio-4");
    public  static By productselector = By.cssSelector("#productSelector");

    public  static By parkone = By.cssSelector("#discover-disney-for-fl-resident > div > div.content-container > dprd-html");

    public  static By parkhopper = By.cssSelector("#discover-disney-with-park-hopper-for-fl-resident > div");
    public  static By partymix = By.cssSelector("#partyMix");
    public  static By adult = By.cssSelector("#adult");
    public  static By plusbutton = By.cssSelector("#plusButton");
    public  static By currentselections = By.cssSelector("#currentSelections");
    public  static By addtocart = By.cssSelector("#addToCart");

    public  static By prevalidateIframe = By.cssSelector("[id=\"pepValidateResidencyIframeContainer\"]");

    public  static By appguestinfo = By.cssSelector("#appGuestInfoStepper");
    public  static By appguestinfocontainer = By.cssSelector("#appGuestInfoStepper > app-uc-guest-info-container > div > div.guest-detail-item > com-uc-guest-info-container");
    public  static By guestAssignnmentsection = By.cssSelector("div[class=\"guestAssignmentSection\"]");
    public  static By Validateticket = By.xpath("//*[@id=\"appGuestInfoStepper\"]/app-uc-guest-info-container/div/div[2]");



   public  static By pricesummary = By.cssSelector("#priceSummary > com-uc-price-summary");
  // public  static By pricesummary = By.xpath("//*[@id=\"priceSummary\"]/com-uc-price-summary");
    public  static By summaryprice = By.cssSelector("#ucPriceSummary > div.summaryPriceInfo > div:nth-child(1) > com-price");
    public  static By price = By.cssSelector("#price");
    public  static By nextbutton = By.cssSelector("div > iron-collapse > div > div:nth-child(2) > div > com-button\n");
    public  static By discover = By.cssSelector("#discover-disney > div.prices > div.line-total > dprd-price");

    public  static By firstnameError = By.xpath("//*[@id=\"resident_first-name-error\"]");
    public  static By DobError = By.xpath("//*[@id=\"resident_date-of-birth-error\"]");
    public  static By streetError = By.xpath("//*[@id=\"resident_street-error\"]");
    public  static By cityError = By.xpath("//*[@id=\"resident_city-error\"]");
    public  static By zipError = By.xpath("//*[@id=\"resident_zip-error\"]");

    public  static By newpopup = By.xpath("//*[@id=\"inviteReject\"]");




















}
