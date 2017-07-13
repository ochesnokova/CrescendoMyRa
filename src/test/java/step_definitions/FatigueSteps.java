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
    @Given("^I tap on Fatigue Tile$")
    public void iTapOnFatigueTile() throws Throwable {
        scr.welcomeScreen.fatigueTile.click();
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

    @Then("^I tap on Sluggish$")
    public void iTapOnSluggish() throws Throwable {
        scr.fatigueScreen.sluggish.click();
    }

    @And("^I verify number three Sluggish$")
    public void iVerifyNumberThreeSluggish() throws Throwable {
        scr.fatigueScreen.sluggish.findElementsByName("SLUGGISH");
    }

    @Then("^I tap on Exhausted$")
    public void iTapOnExhausted() throws Throwable {
        scr.fatigueScreen.exhausted.click();
    }

    @And("^I verify number four Exhausted$")
    public void iVerifyNumberFourExhausted() throws Throwable {
        scr.fatigueScreen.exhausted.findElementsByName("EXHAUSTED");
    }
}

