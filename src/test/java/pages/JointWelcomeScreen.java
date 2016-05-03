package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 4/26/16.
 */
public class JointWelcomeScreen extends TestBase {


    //@AndroidFindBy(name = "")
    @iOSFindBy(name = "joint_pain_ftux_letterbox.png")
    public MobileElement wholeImageJointPain;

    //@AndroidFindBy(name = "")
    @iOSFindBy(name = "Get Started")
    public MobileElement getStarted;

    public JointWelcomeScreen() {
        System.out.println("Initializing JointWelcomeScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

    }

}
