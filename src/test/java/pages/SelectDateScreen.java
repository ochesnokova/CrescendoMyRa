package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 5/9/17.
 */
public class SelectDateScreen extends TestBase {


    @iOSFindBy(id = "Select a Date")
    public MobileElement selectaDate;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAPicker[1]/UIAPickerWheel[1]")
    public MobileElement dataMonth;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAPicker[1]/UIAPickerWheel[2]")
    public MobileElement dataDate;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAPicker[1]/UIAPickerWheel[3]")
    public MobileElement dataYear;

    public SelectDateScreen() {
        System.out.println("Initializing MedicationDetailScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }

}
