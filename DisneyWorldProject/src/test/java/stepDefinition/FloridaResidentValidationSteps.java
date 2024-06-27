package stepDefinition;

import config.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Pages.HomePage.profile;
import static Pages.HomePage.signin;
import static Pages.LoginPage.*;
import static UIWrapper.DisneyWorldWrapper.findelement;
import static stepDefinition.LoginSteps.*;

import static Pages.LoginPage.date;
import static UIWrapper.DisneyWorldWrapper.*;
import static Pages.FloridaResidentValidation.*;
import static stepDefinition.LoginSteps.getFirstname;

public class FloridaResidentValidationSteps extends BaseClass {

    public static String mail, createPass;
    public static StringBuilder firstname, lastname;
    public static StringBuilder floridaname;
   public static String price1;


    @When("click on sign in and create non Florida account")
    public void click_on_sign_in_and_create_non_florida_account() throws InterruptedException {
       // Thread.sleep(5000);
//        WebElement iframeElement1 = findelement(disneyprivacy);
//        iframe(iframeElement1);
       // clickOn(disneyprivacy1);
        Thread.sleep(5000);
        fluentWaitForElement(signin);
        Thread.sleep(5000);
        WebElement signning_in = findelement(signin);
        javascriptClick(signning_in);
        fluentWaitForElement(frame);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        // mail
        fluentWaitForElement(user);
        Thread.sleep(5000);
        mail = randomMail();
        sendKeys(user, mail);
        sendKeysEnter(user, Keys.ENTER);
        // firstname
        fluentWaitForElement(first);
        Thread.sleep(5000);
        firstname = randomString();
        sendKeySB(first, firstname + "");
        // lastname
        fluentWaitForElement(last);
        Thread.sleep(5000);
        lastname = randomString();
        sendKeySB(last, lastname + "");
        // Password
        fluentWaitForElement(passwords);
        Thread.sleep(5000);
        Thread.sleep(5000);
        createPass = randomString().toString();
        sendKeySB(passwords, createPass + "12");
        // date
        fluentWaitForElement(date);
        Thread.sleep(5000);
        String dob = dob();
        //System.out.println(dob);
        //sendKeys(date, dob);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"1991");
        //Select UnitedStates
        dropdown(US,"US");

        //address
        fluentWaitForElement(add);
        Thread.sleep(3000);
        //StringBuilder address = randomString();
        sendKeySB(add, "1105 W Woodlawn Ave");
        // city
        fluentWaitForElement(city);
        Thread.sleep(5000);
        //StringBuilder citys = randomString();
        sendKeySB(city, "Tampa ");
        //state
        fluentWaitForElement(state);
        Thread.sleep(5000);
        dropdown(state,"FL");

        // postal code
        fluentWaitForElement(pincode);
        Thread.sleep(5000);
        //StringBuilder postal = randomString();
        sendKeySB(pincode,  "33603");
        fluentWaitForElement(check1);
        Thread.sleep(5000);
        clickOn(check1);
        fluentWaitForElement(check2);
        Thread.sleep(3000);
        clickOn(check2);

//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
//        fluentWaitForElement(createAccount);


        Thread.sleep(5000);
        clickOn(ok);


    }

    @When("scroll down and click specialOffer")
    public void scroll_down_and_click_special_offer() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(5000);
//        try
//        {
//            driver.switchTo().alert().accept();
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }


//        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert1=driver.switchTo().alert();
//       alert1.dismiss();
////        alert1.accept();
        WebElement scroll1=findelement(specialoffer);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(5000);
        isDisplayed(profile);
        javascriptClick(scroll1);
//        Thread.sleep(5000);
//        clickOn(disneyprivacy2);

    }

    @When("Click on special Florida resident offer")
    public void click_on_special_florida_resident_offer() {
        clickOn(specialFlorida);

    }

    @When("Click on purchase now button")
    public void click_on_purchase_now_button() {
        clickOn(Purchasenow);

    }

    @Then("Select the number of days")
    public void select_the_number_of_days() throws InterruptedException {


       Thread.sleep(2000);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot1 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot2 =shadowRoot1.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot4 =shadowRoot2.findElement(numdays).getShadowRoot();
        Thread.sleep(5000);
        shadowRoot4.findElement(radio3).click();


    }

    @Then("Select the ticket type Park Hopper Option")
    public void select_the_ticket_type_park_hopper_option() throws InterruptedException {
        Thread.sleep(1200);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot1 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot2 =shadowRoot1.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot4 =shadowRoot2.findElement(productselector).getShadowRoot();
        Thread.sleep(5000);
        shadowRoot4.findElement(parkhopper).click();

//



    }

    @Then("Select the number of tickets and Click on continue")
    public void select_the_number_of_tickets_and_click_on_continue() throws InterruptedException {

        Thread.sleep(1200);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot1 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot2 =shadowRoot1.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot3 =shadowRoot2.findElement(partymix).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot4 =shadowRoot3.findElement(adult).getShadowRoot();
        shadowRoot4.findElement(plusbutton).click();

        //click continue
        Thread.sleep(5000);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot5 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot6 =shadowRoot5.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot7 =shadowRoot6.findElement(currentselections).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot8 =shadowRoot7.findElement(discover).getShadowRoot();
         price1=shadowRoot8.findElement(price).getText();
        System.out.println(price1);
        shadowRoot7.findElement(addtocart).click();



    }

    @Then("Click on continue button in the Your cart screen")
    public void click_on_continue_button_in_the_your_cart_screen() throws InterruptedException {

        try
        {
            fluentWaitForElement(newpopup);
            Thread.sleep(3000);
            clickOn(newpopup);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }


        fluentWaitForElement(ContinueCart);
        Thread.sleep(6000);
        clickOn(ContinueCart);


    }

    @Then("Fill all fields with data and Click on Verfy Me Now button")
    public void fill_all_fields_with_data_and_click_on_verfy_me_now_button() throws InterruptedException {

        fluentWaitForElement(FloridaFrame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(FloridaFrame);
        iframe(iframeElement);
        Thread.sleep(1200);
        fluentWaitForElement(FloridaFirstname);
        Thread.sleep(3000);
        sendKeys(FloridaFirstname,"abc");
        Thread.sleep(3000);
        sendKeys(FloridaDate,"09/09/1991");
        Thread.sleep(3000);
        sendKeys(FloridaAddress,"1105 W Woodlawn Ave");
        Thread.sleep(3000);
        clickOn(selectAddress);
        Thread.sleep(3000);
        clickOn(Verifyme);





    }

    @Then("Verify whether Unable to validate the Florida residency message is displayed")
    public void verify_whether_unable_to_validate_the_florida_residency_message_is_displayed() throws InterruptedException {

//        Thread.sleep(5000);
//       // WebElement iframeElement = driver.findElement(By.cssSelector("[id=\"pepValidateResidencyIframeContainer\"]"));
//        WebDriverWait wait = new WebDriverWait(driver, (Duration.ofSeconds(10)));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(validationIframe));
//       // WebElement iframeElement=findelement(validationIframe);
//
//       // iframe(iframeElement);
        Thread.sleep(3000);
        isDisplayed(validationUnable);
        System.out.println("Unable to validate address message displayed");


    }

    @Then("Cick on continue button")
    public void cick_on_continue_button() throws InterruptedException {
       Thread.sleep(1800);
//       WebDriverWait wait = new WebDriverWait(driver, (Duration.ofSeconds(20)));
//       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(validationIframe));
       // WebElement iframeElement=findelement(validationIframe);
//        iframe(iframeElement);
//        WebElement iframeElement=findelement(validationIframe);
//        iframe(iframeElement);
//       WebDriverWait wait1 = new WebDriverWait(driver, (Duration.ofSeconds(20)));
//      wait1.until(ExpectedConditions.visibilityOfElementLocated(validationContinue));
        fluentWaitForElement(validationContinue);
        Thread.sleep(6000);
        clickOn(validationContinue);
        Thread.sleep(5000);



    }

    @Then("Verify the ticket is visible in Check out screen")
    public void verify_the_ticket_is_visible_in_check_out_screen() throws InterruptedException {


        try
        {
            Thread.sleep(8000);

            //driver.findElement(By.xpath("//*[@id=\"appGuestInfoStepper\"]")).isDisplayed();
            //isDisplayed(Validateticket);
            // System.out.println("ticket displayed");
            Thread.sleep(8000);
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(pricesummary));
            //fluentWaitForElement(pricesummary);

            SearchContext shadowRoot1 =findelement(pricesummary).getShadowRoot();
//        Thread.sleep(3000);
//        fluentWaitForElement(summaryprice);
            SearchContext shadowRoot2 =shadowRoot1.findElement(summaryprice).getShadowRoot();
//        Thread.sleep(3000);
//        fluentWaitForElement(price);
            String offer=shadowRoot2.findElement(price).getText();
            System.out.println(offer);
            if(offer.equals(price1))
            {
                System.out.println("ticket amount is matched");
            }
            else
            {
                System.out.println("ticket amount is not matched");
            }




        }
        catch (Exception e)
        {
            System.out.println(e);
        }



    }
    @Then("Click on continue without validation button")
    public void click_on_continue_without_validation_button() throws InterruptedException {
//        WebElement iframeElement=findelement(validationIframe);
//        iframe(iframeElement);
        javascriptScroll();
        fluentWaitForElement(continuewithoutID);
        Thread.sleep(8000);
        clickOn(continuewithoutID);
        Thread.sleep(5000);


    }
    @Then("Select the number of days Four")
    public void select_the_number_of_days_four() throws InterruptedException {
        Thread.sleep(2000);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot1 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot2 =shadowRoot1.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot4 =shadowRoot2.findElement(numdays).getShadowRoot();
        Thread.sleep(5000);
        shadowRoot4.findElement(radio4).click();

    }


    @Then("Select the ticket type one park per day Option")
    public void select_the_ticket_type_one_park_per_day_option() throws InterruptedException {
        Thread.sleep(1200);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot1 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot2 =shadowRoot1.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot4 =shadowRoot2.findElement(productselector).getShadowRoot();
        Thread.sleep(5000);
        shadowRoot4.findElement(parkone).click();

    }

    @Then("Select the number of tickets two and Click on continue")
    public void select_the_number_of_tickets_two_and_click_on_continue() throws InterruptedException {
        Thread.sleep(1200);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot1 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot2 =shadowRoot1.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot3 =shadowRoot2.findElement(partymix).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot4 =shadowRoot3.findElement(adult).getShadowRoot();
        shadowRoot4.findElement(plusbutton).click();
        shadowRoot4.findElement(plusbutton).click();

        //click continue
        Thread.sleep(5000);
        javascriptScrollMini();
        Thread.sleep(5000);
        SearchContext shadowRoot5 =shadowRootGet(pagecontent);
        Thread.sleep(5000);
        SearchContext shadowRoot6 =shadowRoot5.findElement(ticketconfig).getShadowRoot();
        Thread.sleep(5000);
        SearchContext shadowRoot7 =shadowRoot6.findElement(currentselections).getShadowRoot();
        Thread.sleep(5000);
        shadowRoot7.findElement(addtocart).click();



    }
    @Then("Check the Verify me now button enable")
    public void check_the_verify_me_know_button_enable() throws InterruptedException {

        javascriptScroll();
        fluentWaitForElement(FloridaFrame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(FloridaFrame);
        iframe(iframeElement);
        Thread.sleep(3000);
        if(findelement(Verifyme).isEnabled())
        {
            System.out.println("Verify me button is enable");
        }
        else
        {
            System.out.println("Verify me button is not enable");
        }


    }
    @Then("Click on First name and tabout and verify error message is displayed")
    public void click_on_first_name_and_tabout_and_verify_error_message_is_displayed() throws InterruptedException {
        fluentWaitForElement(FloridaFrame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(FloridaFrame);
        iframe(iframeElement);
        Thread.sleep(1200);
        fluentWaitForElement(FloridaFirstname);
        Thread.sleep(3000);
        clickOn(FloridaFirstname);
        sendKeysTab(FloridaFirstname,Keys.TAB);
        isMessageDisplayed(firstnameError);

    }

    @Then("Click on Date of Birth and tabout and verify error message is displayed")
    public void click_on_date_of_birth_and_tabout_and_verify_error_message_is_displayed() throws InterruptedException {
//        fluentWaitForElement(FloridaFrame);
//        Thread.sleep(3000);
//        WebElement iframeElement = findelement(FloridaFrame);
//        iframe(iframeElement);
        Thread.sleep(300);
        fluentWaitForElement(FloridaDate);
        Thread.sleep(3000);
        clickOn(FloridaDate);
        sendKeysTab(FloridaDate,Keys.TAB);
        isMessageDisplayed(DobError);


    }

    @Then("Click on Street and tabout and verify error message is displayed")
    public void click_on_street_and_tabout_and_verify_error_message_is_displayed() throws InterruptedException {
//        fluentWaitForElement(FloridaFrame);
//        Thread.sleep(3000);
//        WebElement iframeElement = findelement(FloridaFrame);
//        iframe(iframeElement);
   //     Thread.sleep(3000);
        fluentWaitForElement(FloridaAddress);
        Thread.sleep(3000);
        clickOn(FloridaAddress);
        sendKeysTab(FloridaAddress,Keys.TAB);
        isMessageDisplayed(streetError);

    }

    @Then("Click on City and tabout and verify error message is displayed")
    public void click_on_city_and_tabout_and_verify_error_message_is_displayed() throws InterruptedException {
//        fluentWaitForElement(FloridaFrame);
//        Thread.sleep(3000);
//        WebElement iframeElement = findelement(FloridaFrame);
//        iframe(iframeElement);
//        Thread.sleep(1200);
        fluentWaitForElement(FloridaCity);
        Thread.sleep(3000);
        clickOn(FloridaCity);
        sendKeysTab(FloridaCity,Keys.TAB);
        isMessageDisplayed(cityError);

    }

    @Then("Zip and tabout and verify error message is displayed")
    public void zip_and_tabout_and_verify_error_message_is_displayed() throws InterruptedException {
//        fluentWaitForElement(FloridaFrame);
//        Thread.sleep(3000);
//        WebElement iframeElement = findelement(FloridaFrame);
//        iframe(iframeElement);
//        Thread.sleep(1200);
        fluentWaitForElement(FloridaZip);
        Thread.sleep(3000);
        clickOn(FloridaZip);
        sendKeysTab(FloridaZip,Keys.TAB);
        isMessageDisplayed(zipError);

    }

    @Then("Fill all fields with different address and Click on Verfy Me Now button")
    public void fill_all_fields_with_different_address_and_click_on_verfy_me_now_button() throws InterruptedException {
        fluentWaitForElement(FloridaFrame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(FloridaFrame);
        iframe(iframeElement);
        Thread.sleep(1200);
        fluentWaitForElement(FloridaFirstname);
        Thread.sleep(3000);
        sendKeys(FloridaFirstname,"abc");
        Thread.sleep(3000);
        sendKeys(FloridaDate,"09/09/1991");
        Thread.sleep(3000);
        sendKeys(FloridaAddress,"abcd");
        fluentWaitForElement(FloridaCity);
        Thread.sleep(3000);
        sendKeys(FloridaCity,"efg");
        fluentWaitForElement(FloridaZip);
        Thread.sleep(3000);
        sendKeys(FloridaZip,"12345");
        sendKeysTab(FloridaZip,Keys.TAB);
        Thread.sleep(6000);
        clickOn(Verifyme);




    }

    @Then("verify the element is displayed")
    public void verify_the_element_is_displayed() {
//       Boolean result= driver.findElement(By.xpath("//*[@id=\"appGuestInfoStepper\"]")).isDisplayed();
//       System.out.println(result);
    }





}
