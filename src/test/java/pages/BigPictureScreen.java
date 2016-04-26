package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.remote.MobileBrowserType;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 4/12/16.
 */
public class BigPictureScreen extends TestBase {

    @iOSFindBy(name = "Very Good")
    public MobileElement veryGood;

    @iOSFindBy(name = "Good")
    public MobileElement good;

    @iOSFindBy(name = "Okay")
    public MobileElement okay;

    @iOSFindBy(name = "Bad")
    public MobileElement bad;

    @iOSFindBy(name = "Very Bad")
    public MobileElement veryBad;


    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]/UIATextView[1]")
    public MobileElement textField;

    @iOSFindBy(name = "nav bar right arrow")
    public MobileElement forwardArrow;


    public MobileElement buttonWithValue1(){

        List<MobileElement> list = driver.findElements(By.className("UIATableCell"));

        MobileElement button1 = new IOSElement();

        for(MobileElement each : list){
            if(each.getAttribute("value").equals("1")){
                button1 = each;
            }
        }

        return button1;
    }



    public BigPictureScreen() {

        System.out.println("Initializing BigPictureScreen elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
    }



}
