package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import support.TestBase;

import static org.testng.Assert.assertTrue;

/**
 * Created by ochesnokova on 4/18/16.
 */
public class LandingSteps extends TestBase{

    //@Given("^I tap on Track$")
    //public void iTapOnTrack() throws Throwable {
    //scr.trackBar.track.click();
    //}


    @Then("^I verify that I am on Track page$")
    public void iVerifyThatIAmOnTrackPage() throws Throwable {
        WebElement desiredElement = scr.welcomeScreen.bigPicture;
        assertTrue(desiredElement.isDisplayed());
    }

    @Then("^I tap on Summary$")
    public void iTapOnSummary() throws Throwable {
        scr.trackBar.summary.click();
    }


    @And("^T verify \"([^\"]*)\" is present$")
    public void tVerifyIsPresent(String arg0) throws Throwable {
        scr.trackBar.summary.findElementsByName("Average time with morning stiffness");

    }

    @Then("^I tap on Me$")
    public void iTapOnMe() throws Throwable {
        scr.trackBar.me.click();

    }

    @And("^I verify that I am on Me page$")
    public void iVerifyThatIAmOnMePage() throws Throwable {
        scr.trackBar.me.findElementsByName("Reminders");

    }

    @Then("^I tap on Resources$")
    public void iTapOnResources() throws Throwable {
        scr.trackBar.resources.click();
    }

    @And("^I verify that I am on Resources page$")
    public void iVerifyThatIAmOnResourcesPage() throws Throwable {
        scr.trackBar.resources.findElementsByName("Rate this App");
    }
}

