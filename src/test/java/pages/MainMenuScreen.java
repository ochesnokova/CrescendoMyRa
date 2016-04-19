package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 4/12/16.
 */
public class MainMenuScreen extends TestBase{

    // @AndroidFindBy(name = "signUpButton")
    @iOSFindBy(name = "BigPictureScreen")
    public MobileElement bigPicture;




    public MainMenuScreen() {

        System.out.println("Initializing MainMenuScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}

