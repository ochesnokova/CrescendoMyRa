package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import support.TestBase;

/**
 * Created by ochesnokova on 4/18/16.
 */
public class LandingSteps extends TestBase{

    @Given("^I tap on Track$")
    public void iTapOnTrack() throws Throwable {
        scr.trackBar.track.click();
    }


    @Then("^I verify that I am on Track page$")
    public void iVerifyThatIAmOnTrackPage() throws Throwable {
        WebElement desiredElement = scr.mainMenuScreen.bigPicture;

        Assert.assertTrue(desiredElement.isDisplayed());
    }
}
