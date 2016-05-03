package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 5/2/16.
 */
public class MorningStiffnessScreen extends TestBase {

    //@AndroidFindBy(name = "")
    @iOSFindBy(id = "How long did your morning stiffness last")
    public MobileElement howLongDidYourMorningStiffnessLast;


    //@AndroidFindBy(name = "")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIAButton[1]")
    public MobileElement noMorningStiffness;

    @iOSFindBy(name = "nav bar right arrow")
    public MobileElement forwardArrow;

    public MorningStiffnessScreen() {
        System.out.println("Initializing MorningStiffnessScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}