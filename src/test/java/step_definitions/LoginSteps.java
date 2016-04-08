package step_definitions;

import com.thoughtworks.selenium.SeleneseTestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

/**
 * Created by ochesnokova on 4/7/16.
 */
public class LoginSteps extends TestBase{

    @Given("^launch home screen$")
    public void launchHomeScreen() throws Throwable {

        driver.get("www.google.com");

    }

    @Given("^login to app$")
    public void loginToApp() {
       driver.findElement(By.name("sfdgdf")).click();
    }

    @Given("^click red button$")
    public void clickRedButton() throws Throwable {
        driver.get("hello");
    }
}
