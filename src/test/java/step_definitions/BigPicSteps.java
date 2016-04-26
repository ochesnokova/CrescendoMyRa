package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;
import support.TestBase;

/**
 * Created by ochesnokova on 4/18/16.
 */
public class BigPicSteps extends TestBase{

    @Given("^I tap on Big Picture$")
    public void iTapOnBigPicture() throws Throwable {
        scr.welcomeScreen.bigPicture.click();
    }

    @Then("^I tap on Very Good$")
    public void iTapOnVeryGood() throws Throwable {
        scr.bigPictureScreen.veryGood.click();

    }

    @And("^I verify number one")
    public void iVerifyBlueColor() throws Throwable {
       MobileElement button1 = scr.bigPictureScreen.buttonWithValue1();

        String expectedAttributeValue = button1.getAttribute("name");

        Assert.assertEquals("1", expectedAttributeValue);

    }

    @Then("^I tap on Good$")
    public void iTapOnGood() throws Throwable {
       scr.bigPictureScreen.good.click();
    }

    @And("^I verify number two")
    public void iVerifyGreenColor() throws Throwable {
        MobileElement button2 = scr.bigPictureScreen.buttonWithValue1();

        String expectedAttributeValue = button2.getAttribute("name");

        Assert.assertEquals("2", expectedAttributeValue);
    }


    @Then("^I tap on Okay$")
    public void iTapOnOkay() throws Throwable {
        scr.bigPictureScreen.okay.click();



    }

    @And("^I verify number three$")
    public void iVerifyYellowColor() throws Throwable {
        MobileElement button2 = scr.bigPictureScreen.buttonWithValue1();

        String expectedAttributeValue = button2.getAttribute("name");

        Assert.assertEquals("3", expectedAttributeValue);
    }

    @Then("^I tap on Bad$")
    public void iTapOnBad() throws Throwable {
        scr.bigPictureScreen.bad.click();

    }

    @And("^I verify number four$")
    public void iVerifyOrangeColor() throws Throwable {
        MobileElement button2 = scr.bigPictureScreen.buttonWithValue1();

        String expectedAttributeValue = button2.getAttribute("name");

        Assert.assertEquals("4", expectedAttributeValue);

    }


    @Then("^I tap on Very Bad$")
    public void iTapOnVeryBad() throws Throwable {
        scr.bigPictureScreen.veryBad.click();

    }

    @And("^I verify number five$")
    public void iVerifyRedColor() throws Throwable {

        MobileElement button2 = scr.bigPictureScreen.buttonWithValue1();

        String expectedAttributeValue = button2.getAttribute("name");

        Assert.assertEquals("5", expectedAttributeValue);


    }

    @Then("^I tap on text field$")
    public void iTapOnTextField() throws Throwable {
        scr.bigPictureScreen.textField.click();

    }

    @And("^I type \"([^\"]*)\" into text field$")
    public void iTypeIntoTextField(String name) {

        scr.bigPictureScreen.textField.sendKeys(name);


    }
}



