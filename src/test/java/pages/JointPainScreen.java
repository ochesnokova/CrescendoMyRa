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
public class JointPainScreen extends TestBase {

    //@AndroidFindBy(name = "")
    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIAButton[1]")
    public MobileElement noPain;


    // @AndroidFindBy(name = "")
    @iOSFindBy(id = "nav bar right arrow")
    public MobileElement forwardArrow;

    public JointPainScreen() {
        System.out.println("Initializing JointPainScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }


}