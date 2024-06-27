package stepDefinition;

import io.cucumber.java.en.*;
import static Pages.ProfilePage.*;
import static UIWrapper.DisneyWorldWrapper.*;

import config.BaseClass;

public class ProfileSteps extends BaseClass{
    @Then("avatar and username of the profile is displayed")
    public void avatar_and_username_of_the_profile_is_displayed() {
    isDisplayed(avatar);
    isDisplayed(guestsname);
javascriptScroll();
isDisplayed(paymentname);
isDisplayed(cc);
    }
}
