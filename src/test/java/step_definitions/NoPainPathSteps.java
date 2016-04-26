package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;
import support.TestBase;

/**
 * Created by ochesnokova on 4/26/16.
 */
public class NoPainPathSteps extends TestBase {


    @Then("^I tap on forward arrow on Big Picture screen$")
    public void iTapOnForwardArrowOnBigPictureScreen() {
        scr.bigPictureScreen.forwardArrow.click();
    }

    @Then("^I tap on Get Started button on Joint Pain Welcome screen$")
    public void iTapOnGetStartedButtonOnJointPainWelcomeScreen() {
        scr.jointPainWelcomeScreen.getStarted.click();

    }
}

