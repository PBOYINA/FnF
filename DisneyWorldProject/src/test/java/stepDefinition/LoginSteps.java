package stepDefinition;

import static Pages.HomePage.*;
import static Pages.LoginPage.add;
import static Pages.LoginPage.ok;
import static Pages.LoginPage.check1;
import static Pages.LoginPage.check2;
import static Pages.LoginPage.city;
import static Pages.LoginPage.createAccount;
import static Pages.LoginPage.date;
import static Pages.LoginPage.first;
import static Pages.LoginPage.frame;
import static Pages.LoginPage.last;
import static Pages.LoginPage.passwords;
import static Pages.LoginPage.pincode;
import static Pages.LoginPage.user;
import static Pages.LoginPage.passwd;
import static Pages.LoginPage.sign_in;
import static UIWrapper.DisneyWorldWrapper.javascriptClick;
import static UIWrapper.DisneyWorldWrapper.fluentWaitForElement;
import static UIWrapper.DisneyWorldWrapper.clickOn;
import static UIWrapper.DisneyWorldWrapper.dob;
import static UIWrapper.DisneyWorldWrapper.findelement;
import static UIWrapper.DisneyWorldWrapper.iframe;
import static UIWrapper.DisneyWorldWrapper.randomMail;
import static UIWrapper.DisneyWorldWrapper.javascriptClick;
import static UIWrapper.DisneyWorldWrapper.randomString;
import static UIWrapper.DisneyWorldWrapper.sendKeySB;
import static UIWrapper.DisneyWorldWrapper.sendKeys;
import static UIWrapper.DisneyWorldWrapper.sendKeysEnter;
import static config.Config.disney;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import UIWrapper.DisneyWorldWrapper.*;
import config.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
    public static String mail, createPass;
    public static StringBuilder firstname, lastname;

    @When("click on sign in and create new account")
    public void click_on_sign_in_and_enter_and() throws Exception {
//        Thread.sleep(5000);
//        clickOn(disneyprivacy1);
        fluentWaitForElement(signin);
        Thread.sleep(5000);
        WebElement signning_in = findelement(signin);
        javascriptClick(signning_in);
        //clickOn(signin);
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
        System.out.println(dob);
        //sendKeys(date, dob);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"1991");
        if (!findelement(billing).isDisplayed())
        {
           // driver.navigate().refresh();
            driver.navigate().back();
            driver.quit();
            Thread.sleep(7000);
            openBrowser(disney);
            System.out.println("User is navigating to Disney application");
            Thread.sleep(5000);
            fluentWaitForElement(signin);
            Thread.sleep(5000);
            WebElement signning_in1 = findelement(signin);
            javascriptClick(signning_in1);
            //clickOn(signin);
            fluentWaitForElement(frame);
            WebElement iframeElement1 = findelement(frame);
            iframe(iframeElement1);
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
            Thread.sleep(3000);
            createPass = randomString().toString();
            sendKeySB(passwords, createPass + "12");
            // date
            fluentWaitForElement(date);
            Thread.sleep(5000);
            String dob1 = dob();
            sendKeys(date, dob1);
            fluentWaitForElement(add);
            Thread.sleep(3000);
            StringBuilder address = randomString();
            sendKeySB(add, address + "");
            // city
            fluentWaitForElement(city);
            Thread.sleep(5000);
            StringBuilder citys = randomString();
            sendKeySB(city, citys + "");
            // postal code
            fluentWaitForElement(pincode);
            Thread.sleep(5000);
            StringBuilder postal = randomString();
            sendKeySB(pincode, postal + "");
            fluentWaitForElement(check1);
            Thread.sleep(5000);
            clickOn(check1);
            fluentWaitForElement(check2);
            Thread.sleep(3000);
            clickOn(check2);
            fluentWaitForElement(createAccount);
            Thread.sleep(5000);
            clickOn(createAccount);
        }
        else {
            fluentWaitForElement(add);
            Thread.sleep(5000);
            StringBuilder address = randomString();
            sendKeySB(add, address + "");
            // city
            fluentWaitForElement(city);
            Thread.sleep(5000);
            StringBuilder citys = randomString();
            sendKeySB(city, citys + "");
            // postal code
            fluentWaitForElement(pincode);
            Thread.sleep(5000);
            StringBuilder postal = randomString();
            sendKeySB(pincode, postal + "");
            fluentWaitForElement(check1);
            Thread.sleep(5000);
            clickOn(check1);
            fluentWaitForElement(check2);
            Thread.sleep(5000);
            clickOn(check2);
            fluentWaitForElement(createAccount);
            Thread.sleep(5000);
            clickOn(createAccount);

        }
//        fluentWaitForElement(signin);
//        Thread.sleep(3000);
//        WebElement signning_in = findelement(signin);
//        javascriptClick(signning_in);
//        //clickOn(signin);
//        fluentWaitForElement(frame);
//        WebElement iframeElement = findelement(frame);
//        iframe(iframeElement);
//        // mail
//        fluentWaitForElement(user);
//        Thread.sleep(3000);
//        mail = randomMail();
//        sendKeys(user, mail);
//        sendKeysEnter(user, Keys.ENTER);
//        // firstname
//        fluentWaitForElement(first);
//        Thread.sleep(3000);
//        firstname = randomString();
//        sendKeySB(first, firstname + "");
//        // lastname
//        fluentWaitForElement(last);
//        Thread.sleep(3000);
//        lastname = randomString();
//        sendKeySB(last, lastname + "");
//        // Password
//        fluentWaitForElement(passwords);
//        Thread.sleep(3000);
//        Thread.sleep(3000);
//        createPass = randomString().toString();
//        sendKeySB(passwords, createPass + "12");
//        // date
//        fluentWaitForElement(date);
//        Thread.sleep(3000);
//        String dob = dob();
//        sendKeys(date, dob);
//        try {
//            fluentWaitForElement(billing);
//            Thread.sleep(3000);
//            if (findelement(billing).isDisplayed()) {
//                // address
//                fluentWaitForElement(add);
//                Thread.sleep(3000);
//                StringBuilder address = randomString();
//                sendKeySB(add, address + "");
//                // city
//                fluentWaitForElement(city);
//                Thread.sleep(3000);
//                StringBuilder citys = randomString();
//                sendKeySB(city, citys + "");
//                // postal code
//                fluentWaitForElement(pincode);
//                Thread.sleep(3000);
//                StringBuilder postal = randomString();
//                sendKeySB(pincode, postal + "");
//                fluentWaitForElement(check1);
//                Thread.sleep(3000);
//                clickOn(check1);
//                fluentWaitForElement(check2);
//                Thread.sleep(3000);
//                clickOn(check2);
//                fluentWaitForElement(createAccount);
//                Thread.sleep(3000);
//                clickOn(createAccount);
//            }
//        } catch (Exception e) {
//            System.out.println("No such element exception");
//            fluentWaitForElement(check1);
//            Thread.sleep(3000);
//            clickOn(check1);
//            fluentWaitForElement(createAccount);
//            Thread.sleep(3000);
//            clickOn(createAccount);
//            fluentWaitForElement(frame);
//            Thread.sleep(3000);
//            WebElement iframeElement1 = findelement(frame);
//            iframe(iframeElement1);
//            fluentWaitForElement(ok);
//            Thread.sleep(3000);
//            WebElement okie = findelement(ok);
//            javascriptClick(okie);
//            clickOn(sign_in);
//        }
        System.out.println("click on sign in and create new account");
    }

    public static StringBuilder getFirstname() {
        return firstname;
    }

    public static StringBuilder getLastname() {
        return lastname;
    }

    public static String getEmail() {
        return mail;
    }

    public static String getPass() {
        return createPass;
    }

    @When("click on sign in and create another new account")
    public void click_on_sign_in_and_create_another_new_account() throws Exception {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        // mail
        fluentWaitForElement(user);
        Thread.sleep(3000);
        String mail1 = randomMail();
        sendKeys(user, mail1);
        sendKeysEnter(user, Keys.ENTER);
        // firstname
        fluentWaitForElement(first);
        Thread.sleep(3000);
        StringBuilder firstname1 = randomString();
        sendKeySB(first, firstname1 + "");
        // lastname
        fluentWaitForElement(last);
        Thread.sleep(3000);
        StringBuilder lastname1 = randomString();
        sendKeySB(last, lastname1 + "");
        // Password
        fluentWaitForElement(passwords);
        Thread.sleep(3000);
        String createPass1 = randomString().toString();
        sendKeySB(passwords, createPass1 + "12");
        // date
        String dob1 = dob();
        fluentWaitForElement(date);
        Thread.sleep(3000);
        sendKeys(date, dob1);
        try {
            fluentWaitForElement(billing);
            Thread.sleep(3000);
            if (findelement(billing).isDisplayed()) {
                // address
                fluentWaitForElement(add);
                Thread.sleep(3000);
                StringBuilder address1 = randomString();
                sendKeySB(add, address1 + "");
                // city
                fluentWaitForElement(city);
                Thread.sleep(3000);
                StringBuilder citys1 = randomString();
                sendKeySB(city, citys1 + "");
                // postal code
                fluentWaitForElement(pincode);
                Thread.sleep(3000);
                StringBuilder postal1 = randomString();
                sendKeySB(pincode, postal1 + "");
                fluentWaitForElement(check1);
                Thread.sleep(3000);
                clickOn(check1);
                fluentWaitForElement(check2);
                Thread.sleep(3000);
                clickOn(check2);
                fluentWaitForElement(createAccount);
                Thread.sleep(3000);
                clickOn(createAccount);
            }
        } catch (Exception e) {
            System.out.println("No such element exception");
            fluentWaitForElement(check1);
            Thread.sleep(3000);
            clickOn(check1);
            fluentWaitForElement(createAccount);
            Thread.sleep(3000);
            clickOn(createAccount);
            fluentWaitForElement(ok);
            Thread.sleep(3000);
            clickOn(ok);
            fluentWaitForElement(sign_in);
            Thread.sleep(3000);
            clickOn(sign_in);
        }
        System.out.println("click on sign in and create another new account");

    }

    @When("again login to the same account")
    public void again_login_to_the_same_account() throws Exception {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        fluentWaitForElement(user);
        Thread.sleep(3000);
        sendKeys(user, LoginSteps.getEmail());
        sendKeysEnter(user, Keys.ENTER);
        fluentWaitForElement(passwd);
        Thread.sleep(3000);
        sendKeys(passwd, LoginSteps.createPass + "12");
        sendKeysEnter(passwd, Keys.ENTER);
    }

    @When("login to with {string}")
    public void login_to_with(String password1) throws Exception {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        fluentWaitForElement(user);
        Thread.sleep(3000);
        //sendKeys(user, FriendsAndFamilySteps.searchEmail);
        sendKeysEnter(user, Keys.ENTER);
        // firstname
        fluentWaitForElement(first);
        Thread.sleep(3000);
        StringBuilder firstname = randomString();
        sendKeySB(first, firstname + "");
        // lastname
        fluentWaitForElement(last);
        Thread.sleep(3000);
        StringBuilder lastname = randomString();
        sendKeySB(last, lastname + "");
        // Password
        fluentWaitForElement(passwords);
        Thread.sleep(3000);
        StringBuilder createPass = randomString();
        sendKeySB(passwords, createPass + "12");
        // date
        fluentWaitForElement(date);
        Thread.sleep(3000);
        String dob = dob();
        //sendKeys(date, dob);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"2008");
        try {
            fluentWaitForElement(billing);
            Thread.sleep(3000);
            if (findelement(billing).isDisplayed()) {
                // address
                fluentWaitForElement(add);
                Thread.sleep(3000);
                StringBuilder address = randomString();
                sendKeySB(add, address + "");
                // city
                fluentWaitForElement(city);
                Thread.sleep(3000);
                StringBuilder citys = randomString();
                sendKeySB(city, citys + "");
                // postal code
                fluentWaitForElement(pincode);
                Thread.sleep(3000);
                StringBuilder postal = randomString();
                sendKeySB(pincode, postal + "");
                fluentWaitForElement(check1);
                Thread.sleep(3000);
                clickOn(check1);
                fluentWaitForElement(check2);
                Thread.sleep(3000);
                clickOn(check2);
                fluentWaitForElement(createAccount);
                Thread.sleep(3000);
                clickOn(createAccount);
            }
        } catch (Exception e) {
            System.out.println("No such element exception");
            fluentWaitForElement(check1);
            Thread.sleep(3000);
            clickOn(check1);
            fluentWaitForElement(createAccount);
            Thread.sleep(3000);
            clickOn(createAccount);
            fluentWaitForElement(ok);
            Thread.sleep(3000);
            clickOn(ok);
            fluentWaitForElement(sign_in);
            Thread.sleep(3000);
            clickOn(sign_in);
        }
        System.out.println("login to with password");
    }

    @And("again login to with {string}")
    public void again_login_by_entering_enter_and(String password1) throws Exception {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        fluentWaitForElement(user);
        Thread.sleep(3000);
       // sendKeys(user, FriendsAndFamilySteps.newEmail1);
        sendKeysEnter(user, Keys.ENTER);
        // firstname
        fluentWaitForElement(first);
        Thread.sleep(3000);
        StringBuilder firstname = randomString();
        sendKeySB(first, firstname + "");
        // lastname
        fluentWaitForElement(last);
        Thread.sleep(3000);
        StringBuilder lastname = randomString();
        sendKeySB(last, lastname + "");
        // Password
        fluentWaitForElement(passwords);
        Thread.sleep(3000);
        StringBuilder createPass = randomString();
        sendKeySB(passwords, createPass + "12");
        // date
        fluentWaitForElement(date);
        Thread.sleep(3000);
        String dob = dob();
       // sendKeys(date, dob);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"2008");
        try {
            fluentWaitForElement(billing);
            Thread.sleep(3000);
            if (findelement(billing).isDisplayed()) {

                // address
                fluentWaitForElement(add);
                Thread.sleep(3000);
                StringBuilder address = randomString();
                sendKeySB(add, address + "");
                // city
                fluentWaitForElement(city);
                Thread.sleep(3000);
                StringBuilder citys = randomString();
                sendKeySB(city, citys + "");
                // postal code
                fluentWaitForElement(pincode);
                Thread.sleep(3000);
                StringBuilder postal = randomString();
                sendKeySB(pincode, postal + "");
                fluentWaitForElement(check1);
                Thread.sleep(3000);
                clickOn(check1);
                fluentWaitForElement(check2);
                Thread.sleep(3000);
                clickOn(check2);
                fluentWaitForElement(createAccount);
                Thread.sleep(3000);
                clickOn(createAccount);
            }
        } catch (Exception e) {
            System.out.println("No such element exception");
            fluentWaitForElement(check1);
            Thread.sleep(3000);
            clickOn(check1);
            fluentWaitForElement(createAccount);
            Thread.sleep(3000);
            clickOn(createAccount);
            fluentWaitForElement(ok);
            Thread.sleep(3000);
            clickOn(ok);
            fluentWaitForElement(sign_in);
            Thread.sleep(3000);
            clickOn(sign_in);
        }
        System.out.println("again login to with password");
    }

    @And("again login to with another {string}")
    public void again_login_by_entering_enter_and_another(String password1) throws Exception {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        fluentWaitForElement(user);
        Thread.sleep(3000);
     //   sendKeys(user, FriendsAndFamilySteps.newEmail2);
        sendKeysEnter(user, Keys.ENTER);
        // firstname
        fluentWaitForElement(first);
        Thread.sleep(3000);
        StringBuilder firstname = randomString();
        sendKeySB(first, firstname + "");
        // lastname
        fluentWaitForElement(last);
        Thread.sleep(3000);
        StringBuilder lastname = randomString();
        sendKeySB(last, lastname + "");
        // Password
        fluentWaitForElement(passwords);
        Thread.sleep(3000);
        StringBuilder createPass = randomString();
        sendKeySB(passwords, createPass + "12");
        // date
        fluentWaitForElement(date);
        Thread.sleep(3000);
        String dob = dob();
        //sendKeys(date, dob);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"2008");
        try {
            fluentWaitForElement(billing);
            Thread.sleep(3000);
            if (findelement(billing).isDisplayed()) {
                // address
                fluentWaitForElement(add);
                Thread.sleep(3000);
                StringBuilder address = randomString();
                sendKeySB(add, address + "");
                // city
                fluentWaitForElement(city);
                Thread.sleep(3000);
                StringBuilder citys = randomString();
                sendKeySB(city, citys + "");
                // postal code
                fluentWaitForElement(pincode);
                Thread.sleep(3000);
                StringBuilder postal = randomString();
                sendKeySB(pincode, postal + "");
                fluentWaitForElement(check1);
                Thread.sleep(3000);
                clickOn(check1);
                fluentWaitForElement(check2);
                Thread.sleep(3000);
                clickOn(check2);
                fluentWaitForElement(createAccount);
                Thread.sleep(3000);
                clickOn(createAccount);
            }

        } catch (Exception e) {
            System.out.println("No such element exception");
            fluentWaitForElement(check1);
            Thread.sleep(3000);
            clickOn(check1);
            Thread.sleep(3000);
            fluentWaitForElement(createAccount);
            Thread.sleep(3000);
            clickOn(createAccount);
            Thread.sleep(3000);
            clickOn(ok);
            Thread.sleep(3000);
            clickOn(sign_in);
        }
        System.out.println("again login to with another password");
    }

    @When("click on login and enter {string} and {string}")
    public void click_on_login_and_enter_and(String username, String password) throws InterruptedException {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        // mail
        fluentWaitForElement(user);
        Thread.sleep(3000);
        sendKeys(user, "two_fnf@mailinator.com");
        sendKeysEnter(user, Keys.ENTER);
        // password
        fluentWaitForElement(passwd);
        Thread.sleep(3000);
        sendKeys(passwd, "disney123");
        clickOn(sign_in);
    }

    @And("again login to second invited account")
    public void again_login_to_second_invited_account() throws Exception {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        fluentWaitForElement(user);
        Thread.sleep(3000);
        //sendKeys(user, FriendsAndFamilySteps.newEmail2);
        sendKeysEnter(user, Keys.ENTER);
        // firstname
        fluentWaitForElement(first);
        Thread.sleep(3000);
        StringBuilder firstname = randomString();
        sendKeySB(first, firstname + "");
        // lastname
        fluentWaitForElement(last);
        Thread.sleep(3000);
        StringBuilder lastname = randomString();
        sendKeySB(last, lastname + "");
        // Password
        fluentWaitForElement(passwords);
        Thread.sleep(3000);
        StringBuilder createPass = randomString();
        sendKeySB(passwords, createPass + "12");
        // date
        fluentWaitForElement(date);
        Thread.sleep(3000);
        String dob = dob();
       // sendKeys(date, dob);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"2008");
        try {
            fluentWaitForElement(billing);
            Thread.sleep(3000);
            if (findelement(billing).isDisplayed()) {
                // address
                fluentWaitForElement(add);
                Thread.sleep(3000);
                StringBuilder address = randomString();
                sendKeySB(add, address + "");
                // city
                fluentWaitForElement(city);
                Thread.sleep(3000);
                StringBuilder citys = randomString();
                sendKeySB(city, citys + "");
                // postal code
                fluentWaitForElement(pincode);
                Thread.sleep(3000);
                StringBuilder postal = randomString();
                sendKeySB(pincode, postal + "");
                fluentWaitForElement(check1);
                Thread.sleep(3000);
                clickOn(check1);
                fluentWaitForElement(check2);
                Thread.sleep(3000);
                clickOn(check2);
                fluentWaitForElement(createAccount);
                Thread.sleep(3000);
                clickOn(createAccount);
            }

        } catch (Exception e) {
            System.out.println("No such element exception");
            fluentWaitForElement(check1);
            Thread.sleep(3000);
            clickOn(check1);
            Thread.sleep(3000);
            fluentWaitForElement(createAccount);
            Thread.sleep(3000);
            clickOn(createAccount);
            Thread.sleep(3000);
            clickOn(ok);
            Thread.sleep(3000);
            clickOn(sign_in);
        }
        System.out.println("again login to with another password");
    }

    @And("again login to first invited account")
    public void again_login_to_first_invited_account() throws Exception {
        fluentWaitForElement(signin);
        Thread.sleep(3000);
        clickOn(signin);
        fluentWaitForElement(frame);
        Thread.sleep(3000);
        WebElement iframeElement = findelement(frame);
        iframe(iframeElement);
        fluentWaitForElement(user);
        Thread.sleep(3000);
        //sendKeys(user, FriendsAndFamilySteps.newEmail1);
        sendKeysEnter(user, Keys.ENTER);
        // firstname
        fluentWaitForElement(first);
        Thread.sleep(3000);
        StringBuilder firstname = randomString();
        sendKeySB(first, firstname + "");
        // lastname
        fluentWaitForElement(last);
        Thread.sleep(3000);
        StringBuilder lastname = randomString();
        sendKeySB(last, lastname + "");
        // Password
        fluentWaitForElement(passwords);
        Thread.sleep(3000);
        StringBuilder createPass = randomString();
        sendKeySB(passwords, createPass + "12");
        // date
        fluentWaitForElement(date);
        Thread.sleep(3000);
        String dob = dob();
        //sendKeys(date, dob);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"09");
        Thread.sleep(3000);
        sendKeys(date,"2008");
        try {
            fluentWaitForElement(billing);
            Thread.sleep(3000);
            if (findelement(billing).isDisplayed()) {
                // address
                fluentWaitForElement(add);
                Thread.sleep(3000);
                StringBuilder address = randomString();
                sendKeySB(add, address + "");
                // city
                fluentWaitForElement(city);
                Thread.sleep(3000);
                StringBuilder citys = randomString();
                sendKeySB(city, citys + "");
                // postal code
                fluentWaitForElement(pincode);
                Thread.sleep(3000);
                StringBuilder postal = randomString();
                sendKeySB(pincode, postal + "");
                fluentWaitForElement(check1);
                Thread.sleep(3000);
                clickOn(check1);
                fluentWaitForElement(check2);
                Thread.sleep(3000);
                clickOn(check2);
                fluentWaitForElement(createAccount);
                Thread.sleep(3000);
                clickOn(createAccount);
            }

        } catch (Exception e) {
            System.out.println("No such element exception");
            fluentWaitForElement(check1);
            Thread.sleep(3000);
            clickOn(check1);
            Thread.sleep(3000);
            fluentWaitForElement(createAccount);
            Thread.sleep(3000);
            clickOn(createAccount);
            Thread.sleep(3000);
            clickOn(ok);
            Thread.sleep(3000);
            clickOn(sign_in);
        }
        System.out.println("again login to first invited account");
    }
}
