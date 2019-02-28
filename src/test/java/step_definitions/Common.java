package step_definitions;

import constants.Constants;
import constants.RandomDate;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import support.TestBase;

/**
 * Created by ochesnokova on 2/16/16.
 */
public class Common extends TestBase{

    @Given("^tap on welcome picture$")
    public void tapOnWelcomePicture() {
        scr.welcomeScreen.welcomePicture.click();
    }


    @Then("^I tap on forward arrow$")
    public void iTapOnForwardArrow() throws Throwable {
        scr.morningStiffnessScreen.forwardArrow.click();
    }

    @Then("^I tap on Joint Pain Tile$")
    public void iTapOnJointPainTile() throws Throwable {
        scr.welcomeScreen.jointPainTile.click();
    }

    @And("^I tap on Back$")
    public void iTapOnBack() throws Throwable {
        scr.bigPictureScreen.back.click();
    }

    @Then("^I tap on Morning Stiffness Tile$")
    public void iTapOnMorningStiffnessTile() throws Throwable {
        scr.welcomeScreen.morningStiffness.click();
    }

    @Then("^I tap on Daily Functionality Tile$")
    public void iTapOnDailyFunctionalityTile() throws Throwable {
        scr.welcomeScreen.dailyFunctionality.click();
    }

    @Then("^I tap on Medications Tile$")
    public void iTapOnMedicationsTile() throws Throwable {
        scr.welcomeScreen.medications.click();
    }

    @Then("^I tap on Labs Tile$")
    public void iTapOnLabsTile() throws Throwable {
        scr.welcomeScreen.labs.click();
    }

    @Then("^I tap on Yesterday$")
    public void iTapOnYesterday() throws Throwable {
        scr.bigPictureScreen.yesterday.click();
    }

    @Then("^I tap on Select Date$")
    public void iTapOnSelectDate() throws Throwable {
        scr.bigPictureScreen.selectDate.click();
    }

    @Then("^I verify that I am on Select a Date screen$")
    public void iVerifyThatIAmOnSelectADateScreen() throws Throwable {
        scr.selectDateScreen.selectaDate.isDisplayed();
    }

    @Then("^I tap on the Left arrow button$")
    public void iTapOnTheLeftArrowButton() throws Throwable {
        scr.bigPictureScreen.leftArrow.click();
    }

    @Then("^I tap on the Right arrow button$")
    public void iTapOnTheRightArrowButton() throws Throwable {
        scr.bigPictureScreen.rightArrow.click();
    }

    @And("^I pick any date and year$")
    public void iPickAnyDateAndYear() throws Throwable {
        RandomDate.setRandomDate();

        scr.selectDateScreen.dataMonth.sendKeys(constants.Constants.months[RandomDate.getMonth()]);
        scr.selectDateScreen.dataDate.sendKeys(String.valueOf(RandomDate.getDay()));
        scr.selectDateScreen.dataYear.sendKeys(String.valueOf(RandomDate.getYear()));

    }

    @Given("^tap on allow notifications$")
    public void tapOnAllowNotifications() throws Throwable{

    }
}
