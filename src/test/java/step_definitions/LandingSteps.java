package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
    public void printMessage() { System.out.println("Labs");
        }
    }
}
