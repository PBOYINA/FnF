package stepDefinition;

import io.cucumber.java.en.*;

import static config.Config.*;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import config.BaseClass;

import static Pages.HomePage.*;

import static UIWrapper.DisneyWorldWrapper.*;

public class HomeSteps extends BaseClass{

    @Given("User is navigating to Disney application")
    public void user_is_navigating_to_disney_application() throws InterruptedException {
        Thread.sleep(7000);
        openBrowser(disney);
        System.out.println("User is navigating to Disney application");
    }

    @When("user sign out Disney application")
    public void user_sign_out_disney_application() throws Exception {
        fluentWaitForElement(signout);
        Thread.sleep(3000);
        clickOn(signout);
        System.out.println("user sign out Disney application");
    }

    @And("click on notification icon and click manage invites")
    public void click_on_notification_icon_and_click_manage_invites() throws Exception {
        fluentWaitForElement(notification);
        Thread.sleep(3000);
        clickOn(notification);
        fluentWaitForElement(invites);
        Thread.sleep(3000);
        clickOn(invites);
        System.out.println("click on notification icon and click manage invites");
    }

    @Then("check invite is received")
    public void check_invite_is_received() throws Exception {
        fluentWaitForElement(inviteDisplayed);
        Thread.sleep(3000);
        isDisplayed(inviteDisplayed);
        System.out.println("check invite is received");
    }

    @And("click Accept")
    public void click_accept() throws Exception {
        fluentWaitForElement(accept);
        Thread.sleep(3000);
        clickOn(accept);
        System.out.println("click Accept");
    }

    @And("click Decline")
    public void click_decline() throws Exception {
        fluentWaitForElement(decline);
        Thread.sleep(3000);
        clickOn(decline);
        System.out.println("click Decline");
    }

    @And("close the browser")
    public void close_the_browser() {
        closeBrowser();
    }

    @And("click Accept for multiple users")
    public void click_accept_for_multiple_users() throws Exception {
        fluentWaitForElement(accept);
        List<WebElement> acceptLinkedList = findelements(accept);
        System.out.println(acceptLinkedList.size());
        if (!acceptLinkedList.isEmpty()) {
            for (int i = 0; i < acceptLinkedList.size(); i++) {
                WebElement acceptElement = acceptLinkedList.get(i);
                if (i == acceptLinkedList.size() - 1) {
                    acceptElement.click();
                }
            }
        }
//		if (acceptLinkedList.size()>0){
//			acceptLinkedList.get(acceptLinkedList.size()-1).click();
//		}

//		fluentWaitForElement(accept);
//		Thread.sleep(3000);
//		clickOn(accept);
        System.out.println("click Accept for multiple users");
    }

    @And("click Decline for multiple users")
    public void click_decline_for_multiple_users() throws Exception {
        fluentWaitForElement(decline);
        List<WebElement> declineLinkedList = findelements(decline);
        System.out.println(declineLinkedList.size());
        if (!declineLinkedList.isEmpty()) {
            for (int i = 0; i < declineLinkedList.size(); i++) {
                WebElement declineElement = declineLinkedList.get(i);
                if (i == declineLinkedList.size() - 1) {
                    declineElement.click();
                }
            }
        }
//		if (declineLinkedList.size()>0){
//			declineLinkedList.get(declineLinkedList.size()-1).click();
//		}
//		fluentWaitForElement(accept);
//		Thread.sleep(3000);
//		clickOn(accept);
        System.out.println("click Decline for multiple users");
    }
    @When("scroll down and click Profile")
    public void scroll_down_and_click_profile() throws InterruptedException {
        //javascriptScroll();
    	 WebElement scroll1=findelement(profile); 
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(5000); 

       isDisplayed(profile);
       // actionScroll(scroll1);
        javascriptClick(scroll1);
    }
}