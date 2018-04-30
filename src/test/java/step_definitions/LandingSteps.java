package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
        WebElement desiredElement = scr.welcomeScreen.bigPictureTile;
        assertTrue(desiredElement.isDisplayed());
    }

    @Then("^I tap on Summary$")
    public void iTapOnSummary() throws Throwable {
        scr.trackBar.summary.click();
    }


    @And("^I verify \"([^\"]*)\" is present$")
    public void tVerifyIsPresent(String arg0) throws Throwable {
        Assert.assertTrue(scr.trackBar.summary.isDisplayed());
    }

    @Then("^I tap on Me$")
    public void iTapOnMe() throws Throwable {
        scr.trackBar.me.click();

    }

    @And("^I verify that I am on Me page$")
    public void iVerifyThatIAmOnMePage() throws Throwable {

        Assert.assertTrue(scr.meScreen.reminder.isDisplayed());



    }

    @Then("^I tap on Resources$")
    public void iTapOnResources() throws Throwable {
        scr.trackBar.resources.click();
    }

    @And("^I verify that I am on Resources page$")
    public void iVerifyThatIAmOnResourcesPage() throws Throwable {

        Assert.assertTrue(scr.resourcesScreen.rateThisApp.isDisplayed());

        // scr.resourcesScreen.rateThisApp.sendKeys("iwjfnsvkdfjnv");

        // Select select = new Select(driver.findElement(By.className(UIAPickerWheel\"")));

        //  select.selectByValue("1234");

        // driver.findElement(By.ByClassName("UIAPickerWheel")).select(14);
    }

    @And("^I turn on/off the Reminders$")
    public void iTurnOffTheReminders() throws Throwable {
        scr.meScreen.reminders.click();

    }
}

