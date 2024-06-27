package stepDefinition;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import config.BaseClass;

import static Pages.HomePage.profile;
import static Pages.PaymentMethodFields.*;
import static Pages.PaymentPage.*;
import static Pages.LoginPage.*;

import static UIWrapper.DisneyWorldWrapper.*;

public class PaymentSteps extends BaseClass{

    @Then("click on Payment Methods Module")
    public void click_on_payment_methods_module() throws InterruptedException {
//    	javascriptScrollMini();
//       WebElement element1=findelement(paymentmode);
////        actionScroll(scroll1);
//        fluentWaitForElement(paymentmode);
//        Thread.sleep(3000);
//        javascriptClick(element1);


            //Thread.sleep(3000);
            //javascriptScrollMini();
            Thread.sleep(7000);
            //WebElement scroll1=findelement(paymentmode);

            WebElement scroll1=driver.findElement(By.cssSelector("a[href=\"/profile/payment-methods\"]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll1);
            Thread.sleep(5000);

            WebElement element1=findelement(paymentmode);
//        actionScroll(scroll1);
            fluentWaitForElement(paymentmode);
            Thread.sleep(3000);
            javascriptClick(element1);
    }

    @Then("Payment method page and related elements are displayed")
    public void payment_method_page_and_related_elements_are_displayed() throws InterruptedException {
    	

        fluentWaitForElement(paymentHeader);
        isDisplayed(paymentHeader);
    	Thread.sleep(3000);
    	
//        WebElement frame2 = findelement(iframe2);
//        iframe(frame2);
//      fluentWaitForElement(addPayment);
//      isDisplayed(addPayment);

        javascriptScroll();
        fluentWaitForElement(resortHeader);
        isDisplayed(resortHeader);
        fluentWaitForElement(frontDesk);
        isDisplayed(frontDesk);
        fluentWaitForElement(setPin);
        isDisplayed(setPin);
        fluentWaitForElement(resortContent);
        isDisplayed(resortContent);
    }

    @Then("click on add credit card button")
    public void click_on_add_credit_card_button() throws InterruptedException {
        Thread.sleep(5000);
        WebElement frame2 = findelement(iframe2);
        iframe(frame2);
        //fluentWaitForElement(addPayment);
        WebElement element1 = findelement(addPayment);
//        hoverOverElement(hover1);
        Thread.sleep(7000);
        javascriptClick(element1);
        Thread.sleep(5000);
        fluentWaitForElement(radiobutton);
        clickOn(radiobutton);
    }

    @Then("verify the elements are displayed")
    public void verify_the_elements_are_displayed() throws InterruptedException {
        //javascriptScroll();
        Thread.sleep(3000);
        //fluentWaitForElement(iframe1);
       // WebElement frame1 = findelement(iframe1);
       // iframe(frame1);
       
        fluentWaitForElement(cardnumber);
        isDisplayed(cardnumber);
        System.out.println("cardnumber is displayed");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[formcontrolname=\"expiration\"]")).click();
       // fluentWaitForElement(monthyear);
       // isDisplayed(monthyear);
        System.out.println("monthyear is displayed");
        fluentWaitForElement(securitycode);
        isDisplayed(securitycode);
        System.out.println("securitycode is displayed");
        fluentWaitForElement(nameoncard);
        isDisplayed(nameoncard);
        System.out.println("nameoncard is displayed");
        javascriptScroll();
        fluentWaitForElement(addressLine1);
        isDisplayed(addressLine1);
        System.out.println("address1 is displayed");
        fluentWaitForElement(addressLine2);
        isDisplayed(addressLine2);
        System.out.println("address2 is displayed");
        fluentWaitForElement(zipcode);
        isDisplayed(zipcode);
        System.out.println("zipcode is displayed");
        fluentWaitForElement(cityTextbox);
        isDisplayed(cityTextbox);
        System.out.println("City is displayed");
        javascriptScroll();
        fluentWaitForElement(stateDropdown);
        isDisplayed(stateDropdown);
        System.out.println("State is displayed");
       fluentWaitForElement(storemycheckbox);
       isDisplayed(storemycheckbox);
        fluentWaitForElement(paymentconfirm);
        isDisplayed(paymentconfirm);
        System.out.println("Conform is displayed");
    }

    @Then("click on cancel button")
    public void click_on_cancel_button() {
        fluentWaitForElement(cancel);
        clickOn(cancel);
    }

    @Then("payment page is displayed")
    public void payment_page_is_displayed() throws InterruptedException {
    	//javascriptScrollUp() ;
    	fluentWaitForElement(paymentHeader);
    	Thread.sleep(3000);
        isDisplayed(paymentHeader);
    	
    	
       
    }
}
