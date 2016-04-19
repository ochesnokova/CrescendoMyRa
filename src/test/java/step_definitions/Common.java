package step_definitions;

import cucumber.api.java.en.Given;
import support.TestBase;

/**
 * Created by ochesnokova on 2/16/16.
 */
public class Common extends TestBase{

    @Given("^tap on welcome picture$")
    public void tapOnWelcomePicture() {
        scr.mainScreen.welcomePicture.click();
    }



}
