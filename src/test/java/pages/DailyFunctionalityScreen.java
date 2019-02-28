package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 5/20/16.
 */
public class DailyFunctionalityScreen extends TestBase {

    @iOSFindBy(id = "add button")
    public MobileElement addAnActivity;

    @iOSFindBy(id = "Daily Life")
    public MobileElement dailyLife;

    @iOSFindBy(id = "Bathing")
    public MobileElement bathing;

    @iOSFindBy(id = "Done")
    public MobileElement done;

    @iOSFindBy(id = "EASY")
    public MobileElement easy;


    public DailyFunctionalityScreen() {

        System.out.println("Initializing DailyFunctionalityScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}