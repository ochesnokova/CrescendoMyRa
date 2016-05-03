package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 4/25/16.
 */
public class FatigueScreen extends TestBase {

    //@AndroidFindBy(name = "")
    @iOSFindBy(name = "NO FATIGUE")
    public MobileElement noFatigue;

    //@AndroidFindBy(name = "")
    @iOSFindBy(name = "BIG TIRED")
    public MobileElement bitTired;

    //@AndroidFindBy(name = "")
    @iOSFindBy(name = "How fatigued were you")
    public MobileElement howFatiguedWereYou;


    public FatigueScreen() {
        System.out.println("Initializing FatigueScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

    }
}
