package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.TestBase;

import static org.testng.Assert.assertTrue;

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

        // WebDriverWait wait = new WebDriverWait(driver, 30);
        // MobileElement element = scr.jointPainWelcomeScreen.getStarted;
        // wait.until(ExpectedConditions.elementToBeClickable(element));

        scr.jointPainWelcomeScreen.getStarted.click();

    }

    @Then("^I verify that I am on Joint Pain Screen$")
    public void iVerifyThatIAmOnJointPainScreen() {
        //assertTrue(scr.jointPainScreen.noPain.isDisplayed());
        // scr.jointPainScreen.noPain.findElementsByName("no pain");


        Boolean isDisplayed = scr.jointPainScreen.noPain.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @And("^I tap on no pain$")
    public void iTapOnNoPain() throws Throwable {
        scr.jointPainScreen.noPain.click();
    }

    @Then("^I tap on forward arrow on Joint Pain screen$")
    public void iTapOnForwardArrowOnJointPainScreen() throws Throwable {
        scr.jointPainScreen.forwardArrow.click();
    }

    @Then("^I verify that I am on Morning Stiffness screen$")
    public void iVerifyThatIAmOnMorningStiffnessScreen() {
        Boolean isDisplayed = scr.morningStiffnessScreen.howLongDidYourMorningStiffnessLast.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @And("^I tap on No Morning Stiffness$")
    public void iTapOnNoMorningStiffness() throws Throwable {
        scr.morningStiffnessScreen.noMorningStiffness.click();

    }

    @Then("^I tap on forward arrow on Morning Stiffness screen$")
    public void iTapOnForwardArrowOnMorningStiffnessScreen() throws Throwable {
        scr.morningStiffnessScreen.forwardArrow.click();
    }

    @And("^I verify that I am on Fatigue screen$")
    public void iVerifyThatIAmOnFatigueScreen() {
        Boolean isDisplayed = scr.fatigueScreen.howFatiguedWereYou.isDisplayed();
        Assert.assertTrue(isDisplayed);

    }
}

