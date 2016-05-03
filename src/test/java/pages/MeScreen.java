package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 5/2/16.
 */
public class MeScreen extends TestBase {

    @AndroidFindBy(name = "Reminder")
    @iOSFindBy(name = "Reminder")
    public MobileElement reminder;

    public MeScreen() {
        System.out.println("Initializing MeScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}