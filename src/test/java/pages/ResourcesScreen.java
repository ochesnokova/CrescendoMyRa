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
public class ResourcesScreen extends TestBase {


    @AndroidFindBy(id = "rate_this_app")
    @iOSFindBy(id = "Rate this App")
    public MobileElement rateThisApp;


    public ResourcesScreen() {
        System.out.println("Initializing ResourcesScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}
