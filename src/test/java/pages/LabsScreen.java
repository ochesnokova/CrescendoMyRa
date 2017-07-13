package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 7/19/16.
 */
public class LabsScreen extends TestBase {

    @iOSFindBy(id = "CRP")
    public MobileElement crp;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIATextField[1]")
    public MobileElement vectraDA;

    @iOSFindBy(id = "ESR")
    public MobileElement esr;

    public LabsScreen() {
        System.out.println("Initializing LabsScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }
}
