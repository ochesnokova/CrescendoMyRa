package step_definitions;

import cucumber.api.PendingException;
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
        //scr.bigPictureTile.back.click();
    }
}
