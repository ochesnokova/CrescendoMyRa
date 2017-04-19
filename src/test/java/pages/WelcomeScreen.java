package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 2/16/16.
 */
public class WelcomeScreen extends TestBase {

    @AndroidFindBy(id = "rl_intro_screen")
    @iOSFindBy(id = "intro_screen_letterbox.png")
    public MobileElement welcomePicture;

    @AndroidFindBy(id = "track_list_big_pic")
    @iOSFindBy(id = "Big Picture")
    public MobileElement bigPictureTile;

    @iOSFindBy(id = "Fatigue")
    public MobileElement fatigueTile;


    @iOSFindBy(id = "Joint Pain")
    public MobileElement jointPainTile;


    @iOSFindBy(id = "Morning Stiffness")
    public MobileElement morningStiffness;


    @iOSFindBy(id = "Daily Functionality")
    public MobileElement dailyFunctionality;


    @iOSFindBy(id = "Medications")
    public MobileElement medications;

    @iOSFindBy(id = "Labs")
    public MobileElement labs;


    public WelcomeScreen() {

        System.out.println("Initializing WelcomeScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}
