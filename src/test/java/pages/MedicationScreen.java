package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 5/24/16.
 */
public class MedicationScreen extends TestBase {


    @iOSFindBy(id = "add button")
    public MobileElement addaMedication;

    @iOSFindBy(id = "Actemra®")
    public MobileElement actemra;

    public MedicationScreen() {

        System.out.println("Initializing MedicationScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }

}

