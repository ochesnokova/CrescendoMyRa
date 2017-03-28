package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 6/1/16.
 */
public class MedicationDetailScreen extends TestBase {

    @iOSFindBy(id = "Actemra")
    public MobileElement actemra;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIATextField[2]")
    public MobileElement amountField;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIATextField[3]")
    public MobileElement unitField;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIATextField[4]")
    public MobileElement timesField;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIATextField[5]")
    public MobileElement daysField;


    {
        System.out.println("Initializing MedicationDetailScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }

}