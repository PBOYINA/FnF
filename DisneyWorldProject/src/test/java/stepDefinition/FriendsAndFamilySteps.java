package stepDefinition;

import static Pages.FriendsAndFamily.*;
import static Pages.HomePage.accept;
import static Pages.LoginPage.first;
import static Pages.LoginPage.last;
import static Pages.LoginPage.user;
import static UIWrapper.DisneyWorldWrapper.*;
//import static UIWrapper.DisneyWorldWrapper.getDropdownList;
//import static UIWrapper.DisneyWorldWrapper.getDropdownElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import UIWrapper.DisneyWorldWrapper;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class FriendsAndFamilySteps {
    public static String newEmail1;
    public static String newEmail2;
    public static String newEmail3;
    public static String searchEmail;

    @And("scroll down and click Family list")
    public void scroll_down_and_click_family_list() throws InterruptedException {
        Thread.sleep(1600);
        javascriptScroll();
        fluentWaitForElement(friendsAndFamily);
        Thread.sleep(1200);
        WebElement friends = findelement(friendsAndFamily);
        actionScroll(friends);
        javascriptScroll();
        Thread.sleep(1200);
        clickOn(friendsAndFamily);
        System.out.println("scroll down and click Family list");
    }

    @And("click Add a Guest then click Disney account and Create account")
    public void click_add_a_guest_then_click_disney_account_and_create_account() throws Exception {
        Thread.sleep(6000);
        fluentWaitForElement(addGuests);
        Thread.sleep(6000);
        WebElement addGuest = findelement(addGuests);
        actionScroll(addGuest);
        Thread.sleep(6000);
//		 fluentWaitForElement(addGuests);
        clickOn(addGuests);
        fluentWaitForElement(newGuests);
        Thread.sleep(6000);
        WebElement newGuest = findelement(newGuests);
//		WebElement guests = findelement(guest);
//		actionScroll(guests);
        javascriptClick(newGuest);
        fluentWaitForElement(inviteGuests);
        Thread.sleep(6000);
        WebElement inviteGuest = findelement(inviteGuests);
        javascriptClick(inviteGuest);
        javascriptScroll();
        System.out.println("click Add a Guest then click Disney account and Create account");
    }

    @Then("click Add a Guest in search result then click Disney account and Create account")
    public void click_add_a_guest_in_search_result_then_click_disney_account_and_create_account() throws Exception {
        javascriptScroll();
        Thread.sleep(6000);
        fluentWaitForElement(newGuests1);
        Thread.sleep(3000);
        WebElement newGuest = findelement(newGuests1);
//	WebElement guests = findelement(guest);
//	actionScroll(guests);
        javascriptClick(newGuest);
        fluentWaitForElement(inviteGuests);
        Thread.sleep(3000);
        WebElement inviteGuest = findelement(inviteGuests);
        javascriptClick(inviteGuest);
        javascriptScroll();
        System.out.println("click Add a Guest in search result then click Disney account and Create account");
    }

    @Then("enters age and click done")
    public void enters_age_and_click_done() throws Exception {
        // Title
        fluentWaitForElement(titlehost);
        Thread.sleep(3000);
        javascriptScrollMini();
        WebElement hostElement = findelement(titlehost);
        Thread.sleep(3000);
        shadowRootClick(hostElement, title);
        Thread.sleep(3000);
        shadowRootClick(hostElement, select_title);
        // Lastname
//		fluentWaitForElement(lastnameHost);
//		Thread.sleep(3000);
//		WebElement hostElement2 = findelement(lastnameHost);
//		shadowRootClick(hostElement2, lastname);
        // Age
        fluentWaitForElement(ageHost);
        Thread.sleep(3000);
        javascriptScroll();
        WebElement hostElement5 = findelement(ageHost);
        Thread.sleep(3000);
        shadowRootClick(hostElement5, age);
        Thread.sleep(3000);
        shadowRootClick(hostElement5, select_age);
        // click done
        fluentWaitForElement(done);
        Thread.sleep(3000);
        clickOn(done);
        fluentWaitForElement(sent);
        Thread.sleep(3000);
        clickOn(sent);
    }

    @And("enters title, firstname, lastname, age, email id and click done")
    public void enters_title_firstname_lastname_age_and_click_done() throws Exception {
        try {
            // Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // email
            fluentWaitForElement(emailHost);
            Thread.sleep(3000);
            WebElement hostElement4 = findelement(emailHost);
            newEmail1 = randomMail();
            // shadowRootClear(hostElement4, emailid);
            // fluentWaitForElement(emailid);
            shadowRootSendKeys(hostElement4, emailid, newEmail1);
            System.out.println("Email entered");
            // click done
            fluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        } catch (Exception e) {
            System.out.println("Unable to save changes");
            refreshPage();
// Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // email
            fluentWaitForElement(emailHost);
            Thread.sleep(3000);
            WebElement hostElement4 = findelement(emailHost);
            newEmail1 = randomMail();
            // shadowRootClear(hostElement4, emailid);
            // fluentWaitForElement(emailid);
            shadowRootSendKeys(hostElement4, emailid, newEmail1);
            System.out.println("Email entered");
            // click done
            fluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        }
        System.out.println("enters title, firstname, lastname, age, email id and click done");
    }

    @When("click Add a Guest")
    public void click_add_a_guest() throws Exception {
        fluentWaitForElement(addGuests);
        Thread.sleep(3000);
        WebElement addGuest = findelement(addGuests);
        actionScroll(addGuest);
        clickOn(addGuests);
    }

    @When("enters firstname, lastname and email")
    public void enters_firstname_lastname_and_email() throws Exception {
        // firstname
        fluentWaitForElement(firstnamehost1);
        Thread.sleep(3000);
        WebElement hostname1 = findelement(firstnamehost1);
        shadowRootSendKeys(hostname1, firstname1, "fnf");
        // lastname
        fluentWaitForElement(lastnamehost1);
        Thread.sleep(3000);
        WebElement hostname2 = findelement(lastnamehost1);
        shadowRootSendKeys(hostname2, lastname1, "two");
        // mail
        fluentWaitForElement(emailhost1);
        Thread.sleep(3000);
        WebElement hostname3 = findelement(emailhost1);
        shadowRootSendKeys(hostname3, email1, "two_fnf@mailinator.com");
    }

    @When("enters before registered accounts data")
    public void enters_before_registered_and() throws Exception {
        // firstname
        fluentWaitForElement(firstnamehost1);
        Thread.sleep(3000);
        WebElement hostname1 = findelement(firstnamehost1);
        shadowRootSendKeySB(hostname1, firstname1, LoginSteps.getFirstname());
        // lastname
        fluentWaitForElement(lastnamehost1);
        Thread.sleep(3000);
        WebElement hostname2 = findelement(lastnamehost1);
        shadowRootSendKeySB(hostname2, lastname1, LoginSteps.getLastname());
        // mail
        fluentWaitForElement(emailhost1);
        Thread.sleep(3000);
        WebElement hostname3 = findelement(emailhost1);
        shadowRootSendKeys(hostname3, email1, LoginSteps.getEmail());
    }

    @When("click search")
    public void click_search() throws Exception {
        // Thread.sleep(3000);
        fluentWaitForElement(search);
        Thread.sleep(3000);
        clickOn(search);
    }

    @When("click send in that request")
    public void click_send_in_that_request() throws Exception {
        javascriptScroll();
        fluentWaitForElement(send);
        Thread.sleep(3000);
        clickOn(send);
    }

    @When("click done")
    public void click_done() throws Exception {
        // click done
        fluentWaitForElement(done);
        Thread.sleep(3000);
        clickOn(done);
    }

    @When("click settings button")
    public void click_settings_button() throws Exception {
        javascriptScroll();
        fluentWaitForElement(settings);
        Thread.sleep(3000);
        clickOn(settings);
    }

    @When("click remove and click yes")
    public void click_remove_and_save() throws Exception {
        fluentWaitForElement(remove);
        Thread.sleep(3000);
        clickOn(remove);
        fluentWaitForElement(yes);
        Thread.sleep(3000);
        clickOn(yes);
    }

    @Then("verify user is not found")
    public void verify_user_is_not_found() throws Exception {
        javascriptScroll();
        fluentWaitForElement(search_not_found);
        Thread.sleep(3000);
        isDisplayed(search_not_found);
        // Thread.sleep(3000);
    }

    @When("enters unregistered firstname, lastname and email")
    public void enters_unregistered_firstname_lastname_and_email() throws InterruptedException {
        // firstname
        fluentWaitForElement(firstnamehost1);
        Thread.sleep(3000);
        WebElement hostname1 = findelement(firstnamehost1);
        shadowRootSendKeySB(hostname1, firstname1, randomString());
        // lastname
        fluentWaitForElement(lastnamehost1);
        Thread.sleep(3000);
        WebElement hostname2 = findelement(lastnamehost1);
        shadowRootSendKeySB(hostname2, lastname1, randomString());
        // mail
        fluentWaitForElement(emailhost1);
        Thread.sleep(3000);
        WebElement hostname3 = findelement(emailhost1);
        searchEmail = randomMail();
        shadowRootSendKeys(hostname3, email1, searchEmail);
        // Thread.sleep(2000);
    }

    @When("click sent")
    public void click_sent() throws Exception {
        fluentWaitForElement(sent);
        Thread.sleep(3000);
        clickOn(sent);
    }

    @When("cancel them")
    public void cancel_them() throws Exception {

        fluentWaitForElement(cancel2);
        Thread.sleep(3000);
        clickOn(cancel2);
        // Thread.sleep(3000);
        fluentWaitForElement(yes_cancel2);
        Thread.sleep(3000);
        WebElement yes2 = findelement(yes_cancel2);
        javascriptClick(yes2);
        //clickOn(yes_cancel2);


//        fluentWaitForElement(cancel1);
//        Thread.sleep(3000);
//        clickOn(cancel1);
//        fluentWaitForElement(yes_cancel1);
//        Thread.sleep(6000);
//
//        WebDriverWait wait=new WebDriverWait(driver, (Duration.ofSeconds(2)));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//wdpr-button[contains(text(),'Yes, Cancel')])[2]")));
//        WebElement yes1= findelement(yes_cancel1);
//        javascriptClick(yes1);
//        Thread.sleep(3000);
    }

    @When("resend them")
    public void resend_them() throws Exception {
        fluentWaitForElement(resend1);
        Thread.sleep(3000);
        clickOn(resend1);
        // Thread.sleep(2000);
        fluentWaitForElement(resend1);
        Thread.sleep(3000);
        clickOn(resend1);
    }

    @And("enters title, firstname, lastname, age, email id and click done for second time")

    public void enters_title_firstname_lastname_age_and_click_done_for_second_time() throws Exception {
        try {
            // Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // email
            fluentWaitForElement(emailHost);
            Thread.sleep(3000);
            WebElement hostElement4 = findelement(emailHost);
            newEmail2 = randomMail();
            // shadowRootClear(hostElement4, emailid);
            // fluentWaitForElement(emailid);
            shadowRootSendKeys(hostElement4, emailid, newEmail2);
            System.out.println("Email entered");
            // click done
            fluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        } catch (Exception e) {
            System.out.println("Unable to save changes");
            refreshPage();
// Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // email
            fluentWaitForElement(emailHost);
            Thread.sleep(3000);
            WebElement hostElement4 = findelement(emailHost);
            newEmail2 = randomMail();
            // shadowRootClear(hostElement4, emailid);
            // fluentWaitForElement(emailid);
            shadowRootSendKeys(hostElement4, emailid, newEmail2);
            System.out.println("Email entered");
            // click done
            fluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        }
        System.out.println("enters title, firstname, lastname, age, email id and click done");
    }

    @When("enters title, firstname, lastname, age, email id and click done for third time")
    public void enters_title_firstname_lastname_age_email_id_and_click_done_for_third_time() throws Exception {
        try {
            // Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // email
            fluentWaitForElement(emailHost);
            Thread.sleep(3000);
            WebElement hostElement4 = findelement(emailHost);
            newEmail3 = randomMail();
            // shadowRootClear(hostElement4, emailid);
            // fluentWaitForElement(emailid);
            shadowRootSendKeys(hostElement4, emailid, newEmail3);
            System.out.println("Email entered");
            // click donefluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        } catch (Exception e) {
            System.out.println("Unable to save changes");
            refreshPage();
// Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // email
            fluentWaitForElement(emailHost);
            Thread.sleep(3000);
            WebElement hostElement4 = findelement(emailHost);
            newEmail3 = randomMail();
            // shadowRootClear(hostElement4, emailid);
            // fluentWaitForElement(emailid);
            shadowRootSendKeys(hostElement4, emailid, newEmail3);
            System.out.println("Email entered");
            // click done
            fluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        }
        System.out.println("enters title, firstname, lastname, age, email id and click done");
    }

    @When("click like and share settings button")
    public void click_like_and_share_settings_button() throws Exception {
        // javascriptScroll();
        fluentWaitForElement(likesettings);
        Thread.sleep(3000);
        WebElement like = findelement(likesettings);
        actionScroll(like);
        clickOn(likesettings);
    }

    @When("verify three mails are sent")
    public void verify_three_mails_are_sent() throws Exception {
        fluentWaitForElement(sentrequest);
        Thread.sleep(3000);
        isDisplayed(sentrequest);
    }

    @When("disable share and allow toggles and click save")
    public void disable_share_and_allow_toggles_and_click_save() throws Exception {
        fluentWaitForElement(toggle1host);
        Thread.sleep(3000);
        WebElement togglehost = findelement(toggle1host);
        shadowRootClick(togglehost, toggle1);
        fluentWaitForElement(save);
        Thread.sleep(3000);
        clickOn(save);
    }

    @When("enable share and allow toggles and click save")
    public void enable_share_and_allow_toggles_and_click_save() throws Exception {
        fluentWaitForElement(toggle1host);
        Thread.sleep(3000);
        WebElement togglehost1 = findelement(toggle1host);
        shadowRootClick(togglehost1, toggle1);
        fluentWaitForElement(toggle2host);
        Thread.sleep(3000);
        WebElement togglehost2 = findelement(toggle2host);
        shadowRootClick(togglehost2, toggle2);
        fluentWaitForElement(save);
        Thread.sleep(3000);
        clickOn(save);
        fluentWaitForElement(HomePage.signout);
        Thread.sleep(3000);
        WebElement signout = findelement(HomePage.signout);
        actionScroll(signout);
    }

    @Then("verify the user is displayed")
    public void verify_the_user_is_displayed() throws Exception {
        javascriptScroll();
        fluentWaitForElement(resultpresent);
        Thread.sleep(3000);
        isDisplayed(resultpresent);
    }

    @When("click what information can family and friends see")
    public void click_what_information_can_family_and_friends_see() throws Exception {
        fluentWaitForElement(information);
        Thread.sleep(3000);
        clickOn(information);
        System.out.println("click what information can family and friends see");
    }

    @Then("verify dialog box is displayed")
    public void verify_dialog_box_is_displayed() throws Exception {
        fluentWaitForElement(dialogHost);
        Thread.sleep(3000);
        WebElement e = findelement(dialogHost);
        // fluentWaitForElement(dialog);
        shadowRootisDisplayed(e, dialog);
        System.out.println("verify dialog box is displayed");
    }

    @Then("click close button")
    public void click_close_button() throws Exception {
        fluentWaitForElement(dialogHost);
        Thread.sleep(3000);
        WebElement e = findelement(dialogHost);
        shadowRootClick(e, close);
        System.out.println("click close button");
    }

    @When("click on settings of the requested friend")
    public void click_on_settings_of_the_requested_friend() throws Exception {
        fluentWaitForElement(settings);
        Thread.sleep(3000);
        javascriptScroll();
        clickOn(settings);
        //driver.navigate().refresh();
    }

    @When("click remove")
    public void click_remove() throws Exception {
        fluentWaitForElement(remove);
        Thread.sleep(3000);
        clickOn(remove);
        fluentWaitForElement(yesremove);
        Thread.sleep(3000);
        clickOn(yesremove);
    }

    @When("click share planning button")
    public void click_share_planning_button() throws Exception {
        Thread.sleep(5000);
        fluentWaitForElement(sharePlanning);
        Thread.sleep(3000);
        clickOn(sharePlanning);
    }

    @When("click add guest who does not have an account")
    public void click_add_guest_who_does_not_have_an_account() throws Exception {
        // Thread.sleep(2000);
        fluentWaitForElement(addGuests);
        Thread.sleep(3000);
        WebElement addGuest = findelement(addGuests);
        actionScroll(addGuest);
        Thread.sleep(3000);
//		clickOn(addGuests);
        fluentWaitForElement(newGuests);
        Thread.sleep(3000);
        WebElement newGuest = findelement(newGuests);
        javascriptClick(newGuest);
    }

    @When("user select create profile u will manage")
    public void user_select_create_profile_u_will_manage() throws Exception {
        Thread.sleep(3000);
        fluentWaitForElement(createProfile);
        Thread.sleep(3000);
        clickOn(createProfile);
    }

    @When("enter all data and click done")
    public void enter_all_data_and_click_done() throws Exception {
        try {
            // Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // month
            fluentWaitForElement(monthHost);
            Thread.sleep(3000);
            // javascriptScroll();
            WebElement hostElement6 = findelement(monthHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement6, month);
            Thread.sleep(3000);
            shadowRootClick(hostElement6, select_month);
            System.out.println("Month entered");
            // day
            fluentWaitForElement(dateHost);
            Thread.sleep(3000);
            // javascriptScroll();
            WebElement hostElement7 = findelement(dateHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement7, date);
            Thread.sleep(3000);
            shadowRootClick(hostElement7, select_date);
            // email
//				fluentWaitForElement(emailHost);
//				Thread.sleep(3000);
//				WebElement hostElement4 = findelement(emailHost);
//				newEmail1 = randomMail();
//				// shadowRootClear(hostElement4, emailid);
//				// fluentWaitForElement(emailid);
//				shadowRootSendKeys(hostElement4, emailid, newEmail3);
//				System.out.println("Email entered");
            // click done
            fluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        } catch (Exception e) {
            System.out.println("Unable to save changes");
            refreshPage();
// Title
            fluentWaitForElement(titlehost);
            Thread.sleep(3000);
            WebElement hostElement = findelement(titlehost);
            javascriptScrollMini();
            Thread.sleep(3000);
            shadowRootClick(hostElement, title);
            Thread.sleep(3000);
            shadowRootClick(hostElement, select_title);
            System.out.println("Title entered");
            // Firstname
            WebElement hostElement1 = findelement(firstnameHost);
            Thread.sleep(3000);
            shadowRootSendKeys(hostElement1, firstname, "Kesavan");
            System.out.println("Firstname entered");
            // Lastname
            fluentWaitForElement(lastnameHost);
            Thread.sleep(3000);
            WebElement hostElement2 = findelement(lastnameHost);
            shadowRootSendKeys(hostElement2, lastname, "Welcome");
            System.out.println("Lastname entered");
            // Age
            Thread.sleep(3000);
            fluentWaitForElement(ageHost);
            Thread.sleep(3000);
            javascriptScroll();
            WebElement hostElement5 = findelement(ageHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, age);
            Thread.sleep(3000);
            shadowRootClick(hostElement5, select_age);
            System.out.println("Age entered");
            // month
            fluentWaitForElement(monthHost);
            Thread.sleep(3000);
            // javascriptScroll();
            WebElement hostElement6 = findelement(monthHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement6, month);
            Thread.sleep(3000);
            shadowRootClick(hostElement6, select_month);
            System.out.println("Month entered");
            // day
            fluentWaitForElement(dateHost);
            Thread.sleep(3000);
            // javascriptScroll();
            WebElement hostElement7 = findelement(dateHost);
            Thread.sleep(3000);
            shadowRootClick(hostElement7, date);
            Thread.sleep(3000);
            shadowRootClick(hostElement7, select_date);
            // email
//				fluentWaitForElement(emailHost);
//				Thread.sleep(3000);
//				WebElement hostElement4 = findelement(emailHost);
//				newEmail1 = randomMail();
//				// shadowRootClear(hostElement4, emailid);
//				// fluentWaitForElement(emailid);
//				shadowRootSendKeys(hostElement4, emailid, newEmail3);
//				System.out.println("Email entered");
            // click done
            fluentWaitForElement(done);
            //clickOn(done);
            WebElement doneButton = findelement(done);
            javascriptClick(doneButton);
            System.out.println("done is clicked");
        }
        System.out.println("enter all data and click done");
    }

    @When("enter email in invite and click done")
    public void enter_email_in_invite_and_click_done() throws Exception {
        fluentWaitForElement(sharelink);
        clickOn(sharelink);
        fluentWaitForElement(registerWithEmailHost);
        Thread.sleep(3000);
        WebElement mail = findelement(registerWithEmailHost);
        //shadowRootClick(mail, registerWithEmail);
        shadowRootSendKeys(mail, registerWithEmail, randomMail());
        fluentWaitForElement(continues);
        Thread.sleep(3000);
        //javascriptClick(continues);
        clickOn(continues);
    }

    @When("untoggle Allow friend to view all of your plans")
    public void untoggle_allow_friend_to_view_all_of_your_plans() throws Exception {
        fluentWaitForElement(viewToggleHost);
        Thread.sleep(3000);
        WebElement toggle = findelement(viewToggleHost);
        shadowRootClick(toggle, viewToggle);
    }

    @When("click save")
    public void click_save() throws Exception {
        fluentWaitForElement(friendsave);
        Thread.sleep(3000);
        clickOn(friendsave);
    }

    @When("untoggle Allow friend to view your Disney pass Photos")
    public void untoggle_allow_friend_to_view_your_disney_pass_photos() throws Exception {
        fluentWaitForElement(viewToggleHost1);
        Thread.sleep(3000);
        WebElement toggle1 = findelement(viewToggleHost1);
        shadowRootClick(toggle1, viewToggle);
    }

    @When("click connect my managed profiles")
    public void click_connect_my_managed_profiles() throws Exception {
        fluentWaitForElement(connect);
        Thread.sleep(3000);
        clickOn(connect);
    }

    @Then("managed profiles are displayed")
    public void managed_profiles_are_displayed() throws Exception {
        fluentWaitForElement(manage);
        Thread.sleep(3000);
        isDisplayed(manage);
    }

    @When("clicked on selectAll")
    public void clicked_on_selectAll() throws Exception {
        fluentWaitForElement(selectAll);
        Thread.sleep(3000);
        clickOn(selectAll);
    }

    @When("click send invite button")
    public void click_send_invite_button() throws Exception {
        fluentWaitForElement(sendInvites);
        Thread.sleep(3000);
        clickOn(sendInvites);
    }

    @When("click close")
    public void click_close() throws Exception {
        javascriptScroll();
        fluentWaitForElement(closebutton);
        Thread.sleep(3000);
        //clickOn(closebutton);
        WebElement close = findelement(closebutton);
        javascriptClick(close);
    }

    @When("click Allow searchable")
    public void click_allow_searchable() throws InterruptedException {
        Thread.sleep(3000);
        fluentWaitForElement(allow);
        Thread.sleep(3000);
        WebElement allows = findelement(allow);
        javascriptClick(allows);
    }

    @Then("check first invited guest is displayed")
    public void check_first_invited_guest_is_displayed() throws Exception {
        fluentWaitForElement(mutualfriend);
        Thread.sleep(3000);
        isDisplayed(mutualfriend);
    }

    @When("click settings button and remove for multiple users")
    public void click_settings_button_and_remove_for_multiple_users() throws Exception {
        javascriptScroll();
        fluentWaitForElement(settings);
        List<WebElement> settingsList = findelements(settings);
        System.out.println(settingsList.size());
        if (!settingsList.isEmpty()) {
            for (int i = 0; i < settingsList.size(); i++) {
                WebElement settingsElement = settingsList.get(i);
                if (i == settingsList.size() - 1) {
                    settingsElement.click();
                    fluentWaitForElement(remove);
                    Thread.sleep(3000);
                    clickOn(remove);
                    fluentWaitForElement(yes);
                    Thread.sleep(3000);
                    clickOn(yes);
                }
            }
        }
//		if (settingsList.size()>0) {
//			settingsList.get(settingsList.size() - 1).click();
//			fluentWaitForElement(remove);
//			Thread.sleep(3000);
//			clickOn(remove);
//			fluentWaitForElement(yes);
//			Thread.sleep(3000);
//			clickOn(yes);
//		}
    }
}
