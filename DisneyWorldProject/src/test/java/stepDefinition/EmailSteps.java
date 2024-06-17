package stepDefinition;

import static Core.TestSuiteInitialization.driver;
import static Pages.EmailPage.emailreceived;
import static Pages.EmailPage.go;
import static Pages.EmailPage.mailinatorSearch;
import static UIWrapper.DisneyWorldWrapper.*;
import static config.Config.mailinator;

import UIWrapper.DisneyWorldWrapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class EmailSteps {
    //DisneyWorldWrapper wrapper=new DisneyWorldWrapper();
    @When("user navigates to mailinator page")
    public void user_navigates_to_mailinator_page() throws Exception {
        currentTab();
        getUrl(mailinator);
        fluentWaitForElement(mailinatorSearch);
        Thread.sleep(3000);
       // driver.findElement(By.id("inbox_field")).clear();
        cleartextbox(mailinatorSearch);
        sendKeys(mailinatorSearch, FriendsAndFamilySteps.newEmail1);
        fluentWaitForElement(go);
        Thread.sleep(3000);
        clickOn(go);
        System.out.println("user navigates to mailinator page");
    }

    @When("user navigates to mailinator page and enter searched mail")
    public void user_navigates_to_mailinator_page_and_enter_searched_mail() throws Exception {
        currentTab();
        getUrl(mailinator);
        fluentWaitForElement(mailinatorSearch);
        Thread.sleep(3000);
        sendKeys(mailinatorSearch, FriendsAndFamilySteps.searchEmail);
        fluentWaitForElement(go);
        Thread.sleep(3000);
        clickOn(go);
        System.out.println("user navigates to mailinator page");
    }

    @When("user navigates to mailinator page for second time")
    public void user_navigates_to_mailinator_page_for_second_time() throws Exception {
        currentTab();
        getUrl(mailinator);
        fluentWaitForElement(mailinatorSearch);
        Thread.sleep(3000);
        //driver.findElement(By.id("inbox_field")).clear();
        cleartextbox(mailinatorSearch);
        sendKeys(mailinatorSearch, FriendsAndFamilySteps.newEmail2);
        fluentWaitForElement(go);
        Thread.sleep(3000);
        clickOn(go);
        Thread.sleep(3000);
        System.out.println("user navigates to mailinator page");
    }

    @When("user navigates to mailinator page for third time")
    public void user_navigates_to_mailinator_page_for_third_time() throws Exception {
        currentTab();
        getUrl(mailinator);
        fluentWaitForElement(mailinatorSearch);
        Thread.sleep(3000);
       // driver.findElement(By.id("inbox_field")).clear();
        cleartextbox(mailinatorSearch);
        sendKeys(mailinatorSearch, FriendsAndFamilySteps.newEmail3);
        fluentWaitForElement(go);
        Thread.sleep(3000);
        clickOn(go);
        System.out.println("user navigates to mailinator page");
    }

    @And("verify email is received")
    public void verify_email_is_received() throws Exception {
        fluentWaitForElement(emailreceived);
        Thread.sleep(3000);
        isDisplayed(emailreceived);
        switchToFirstTab();
        System.out.println("verify email is received");
    }

    @When("user navigates to mailinator page of {string}")
    public void user_navigates_to_mailinator_page_of(String email) throws Exception {
        currentTab();
        getUrl(mailinator);
        fluentWaitForElement(mailinatorSearch);
        Thread.sleep(3000);
        sendKeys(mailinatorSearch, email);
        fluentWaitForElement(go);
        Thread.sleep(3000);
        clickOn(go);
        System.out.println("user navigates to mailinator page");
    }

    @And("verify email is not received")
    public void verify_email_is_not_received() throws Exception {
        fluentWaitForElement(emailreceived);
        Thread.sleep(3000);
        isNotDisplayed(emailreceived);
        switchToFirstTab();
        System.out.println("verify email is not received");
    }
}

		
