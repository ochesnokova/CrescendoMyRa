package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import support.TestBase;

/**
 * Created by ochesnokova on 4/25/16.
 */
public class FatigueSteps extends TestBase {
    @Given("^I tap on Fatigue$")
    public void iTapOnFatigue() throws Throwable {
        scr.welcomeScreen.fatigue.click();
    }

    @Then("^I tap on No Fatigue$")
    public void iTapOnNoFatigue() throws Throwable {
        scr.fatigueScreen.noFatigue.click();
    }

    @And("^I verify number one No Fatigue$")
    public void iVerifyNumberOneNoFatigue() throws Throwable {
        scr.fatigueScreen.noFatigue.findElementsByName("NO FATIGUE");
    }

    @Then("^I tap on A Bit Tired$")
    public void iTapOnABitTired() throws Throwable {
        scr.fatigueScreen.bitTired.click();
    }

    @And("^I verify number two Bit Tired$")
    public void iVerifyNumberTwoBitTired() throws Throwable {
        scr.fatigueScreen.bitTired.findElementsByName("A BIT TIRED");
    }
}

