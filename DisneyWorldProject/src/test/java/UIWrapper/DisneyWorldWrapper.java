package UIWrapper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.BaseClass;

public class DisneyWorldWrapper extends BaseClass {

    public static Random random = new Random();

    public DisneyWorldWrapper() {
        driver = new ChromeDriver();
    }

    public static void getUrl(String url) {
        driver.get(url);
    }

    public static String randomMail() {
        String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        randomString.append("@mailinator.com");
        return randomString.toString();
    }
public static void refreshPage(){
        driver.navigate().refresh();
}
    public static StringBuilder randomString() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }
        return randomString;
    }

    public static String dob() {
        Random random = new Random();

        // Generate year (between 1000 and 2009)
        int year = random.nextInt(2007 - 1000) + 1000;

        // Generate month (between 1 and 12)
        int month = random.nextInt(12) + 1;

        // Generate day (between 1 and 28, assuming all months have 28 days)
        int day = random.nextInt(28) + 1;

        // Format the date
        String date = String.format("%04d/%02d/%02d", year, month, day);
        return date;
    }
    public static String dateday(){
        Random random = new Random();
        int day = random.nextInt(28) + 1;
        String date= String.format("%02d",day);

        return date;
    }
    public static String datemonth(){
        Random random = new Random();
        int month = random.nextInt(12) + 1;
        String date= String.format("%02d",month);

        return date;
    }
    public static String dateyear(){
        Random random = new Random();
        int year = random.nextInt(2007 - 1000) + 1000;
        String date= String.format("%04d",year);

        return date;
    }

    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public static void clickOn(By locator) {
        driver.findElement(locator).click();
    }
    public static void cleartextbox(By locator)
    {
        driver.findElement(locator).clear();
    }

    public static void sendKeysEnter(By locator, Keys enter) {
        driver.findElement(locator).sendKeys(enter);
    }

    public static void sendKeys(By locator, String data) {
        driver.findElement(locator).sendKeys(data);
    }

    public static void sendKeySB(By locator, String data) {
        driver.findElement(locator).sendKeys(data);
    }

    public static WebElement findelement(By locator) {
        return driver.findElement(locator);
    }

    public static List<WebElement> findelements(By locator) {
        return driver.findElements(locator);
    }

    public static void iframe(WebElement e) {
        driver.switchTo().frame(e);
    }

    public static void actionScroll(WebElement e1) {
        Actions act = new Actions(driver);
        act.scrollToElement(e1);
        act.scrollByAmount(100, 1000);
    }

    public static void shadowRootClick(WebElement e, By locator) {
        SearchContext shadowRoot = e.getShadowRoot();
        shadowRoot.findElement(locator).click();
    }
    public static void shadowRootSendKeys(WebElement e, By locator, String data) {
        SearchContext shadowRoot = e.getShadowRoot();
        shadowRoot.findElement(locator).sendKeys(data);
    }

    public static void shadowRootisDisplayed(WebElement e, By locator) {
        SearchContext shadowRoot = e.getShadowRoot();
        shadowRoot.findElement(locator).isDisplayed();
    }

    public static void shadowRootSendKeySB(WebElement hostname1, By locator, StringBuilder data) {
        SearchContext shadowRoot = hostname1.getShadowRoot();
        shadowRoot.findElement(locator).sendKeys(data);
    }

    public static void isDisplayed(By locator) {
        driver.findElement(locator).isDisplayed();
    }

    public static void isNotDisplayed(By locator) {
        if (!driver.findElement(locator).isDisplayed()) {
            System.out.println("Element is not displayed as expected.");
        } else {
            System.out.println("Element is displayed, which is unexpected.");
        }
    }
    public static void javascriptClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public static void javascriptScroll() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");
    }

    public static void javascriptScrollMini() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200)", "");
    }

    public static void javascriptScrollUp() {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-700)", "");
    }

    public static String currentTab() {
        String currentTabHandle = driver.getWindowHandle();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        // Switch to the new tab
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(currentTabHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        return currentTabHandle;
    }

    public static void switchToFirstTab() throws Exception {
        driver.switchTo().window("");
        Thread.sleep(3000);
    }

    public static WebElement fluentWaitForElement(final By locator) {
        Wait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(140))
                .pollingEvery(Duration.ofSeconds(5)).ignoring(org.openqa.selenium.NoSuchElementException.class);

        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }
}
