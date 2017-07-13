package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.server.handler.interactions.touch.Up;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.TestBase;

import static org.testng.Assert.assertTrue;

/**
 * Created by ochesnokova on 4/26/16.
 */
public class NoPainPathSteps extends TestBase {


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


    @Then("^I verify that I am on Morning Stiffness screen$")
    public void iVerifyThatIAmOnMorningStiffnessScreen() {
        Boolean isDisplayed = scr.morningStiffnessScreen.howLongDidYourMorningStiffnessLast.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @And("^I tap on No Morning Stiffness$")
    public void iTapOnNoMorningStiffness() throws Throwable {
        scr.morningStiffnessScreen.noMorningStiffness.click();


    }

    @And("^I verify that I am on Fatigue screen$")
    public void iVerifyThatIAmOnFatigueScreen() {
        Boolean isDisplayed = scr.fatigueScreen.howFatiguedWereYou.isDisplayed();
        Assert.assertTrue(isDisplayed);


    }

    @And("^I verify that I am on Daily Functionality screen$")
    public void iVerifyThatIAmOnDailyFunctionalityScreen() throws Throwable {
        scr.dailyFunctionalityScreen.addAnActivity.isDisplayed();
    }

    @Then("^I tap on Add an Activity$")
    public void iTapOnAddAnActivity() throws Throwable {
        scr.dailyFunctionalityScreen.addAnActivity.click();
    }

    @And("^I verify that I am on Add Activities screen$")
    public void iVerifyThatIAmOnAddActivitiesScreen() throws Throwable {
        scr.dailyFunctionalityScreen.dailyLife.isDisplayed();
    }

    @Then("^I tap on Bathing$")
    public void iTapOnBathing() throws Throwable {
        scr.dailyFunctionalityScreen.bathing.click();
    }

    @And("^I tap Done$")
    public void iTapDone() throws Throwable {
        scr.dailyFunctionalityScreen.done.click();
    }

    @And("^I verify that I am on Daily Functionality screen and Bathing were added$")
    public void iVerifyThatIAmOnDailyFunctionalityScreenAndBathingWereAdded() throws Throwable {
        scr.dailyFunctionalityScreen.bathing.isDisplayed();


    }

    @Then("^I tap on number one Easy for Bathing$")
    public void iTapOnNumberOneEasyForBathing() throws Throwable {
        scr.dailyFunctionalityScreen.easy.click();
    }

    @And("^I verify that I am on Medication screen$")
    public void iVerifyThatIAmOnMedicationScreen() throws Throwable {
        scr.medicationScreen.addaMedication.isDisplayed();
    }

    @And("^I tap on Add a Medication$")
    public void iTapOnAddAMedication() throws Throwable {
        scr.medicationScreen.addaMedication.click();

    }

    @And("^I verify that I am on Add Medication screen$")
    public void iVerifyThatIAmOnAddMedicationScreen() throws Throwable {
        scr.medicationScreen.actemra.isDisplayed();
    }

    @Then("^I tap on Actemra$")
    public void iTapOnActemra() throws Throwable {
        scr.medicationScreen.actemra.click();
    }

    @And("^I verify that I am Actemra detailed page$")
    public void iVerifyThatIAmActemraDetailedPage() throws Throwable {
        scr.medicationDetailScreen.actemra.isDisplayed();
    }


    @Then("^I tap on amount field$")
    public void iTapOnAmountField() throws Throwable {
        scr.medicationDetailScreen.amountField.click();
    }

    @And("^I type \"([^\"]*)\" into amount field$")
    public void iTypeIntoAmountField(String arg0) {
        scr.medicationDetailScreen.amountField.sendKeys(new CharSequence[]{"30"});

    }

    @And("^I verify that I am on Labs screen$")
    public void iVerifyThatIAmOnLabsScreen() throws Throwable {
        scr.labsScreen.crp.isDisplayed();


    }

    @Then("^T tap on VectraDA$")
    public void tTapOnVectraDA() throws Throwable {
        scr.labsScreen.vectraDA.click();
    }

    @Then("^I tap on Unit field$")
    public void iTapOnUnitField() throws Throwable {
        scr.medicationDetailScreen.unitField.click();
    }

    @Then("^I type \"([^\"]*)\" into Unit field$")
    public void iTypeIntoUnitField(String arg0) throws Throwable {
        scr.medicationDetailScreen.unitField.sendKeys(new CharSequence[]{"ml"});
    }

    @Then("^I tap on Times field$")
    public void iTapOnTimesField() throws Throwable {
        scr.medicationDetailScreen.timesField.click();
    }

    @And("^I type \"([^\"]*)\" into Times field$")
    public void iTypeIntoTimesField(String arg0) throws Throwable {
        scr.medicationDetailScreen.timesField.sendKeys(new CharSequence[]{"2"});
    }

    @Then("^I tap on Days field$")
    public void iTapOnDaysField() throws Throwable {
        scr.medicationDetailScreen.daysField.click();
    }

    @And("^I type \"([^\"]*)\" into Days field$")
    public void iTypeIntoDaysField(String arg0) throws Throwable {
        scr.medicationDetailScreen.daysField.sendKeys(new CharSequence[]{"1"});
    }

    @And("^I make a swipe up gesture$")
    public void swipingVertical() throws InterruptedException {
        scr.labsScreen.vectraDA.sendKeys("31");

    }

    @Given("^I tap on Big Picture$")
    public void iTapOnBigPicture() throws Throwable {
        scr.welcomeScreen.bigPictureTile.click();
    }

    @And("^I verify that I am on Joint Pain Welcome Screen$")
    public void iVerifyThatIAmOnJointPainWelcomeScreen() throws Throwable {
        scr.jointPainWelcomeScreen.wholeImageJointPain.isDisplayed();

    }


}

