package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import junit.framework.Test;
import org.openqa.selenium.support.PageFactory;
import support.TestBase;

import java.util.concurrent.TimeUnit;

/**
 * Created by ochesnokova on 4/18/16.
 */
public class TrackBar extends TestBase {


    @iOSFindBy(name = "Track")
    public MobileElement track;

    @iOSFindBy(name = "Summary")
    public MobileElement summary;

    @iOSFindBy(name = "Me")
    public MobileElement me;

    @iOSFindBy(name = "Resources")
    public MobileElement resources;


    public TrackBar() {

        System.out.println("Initializing TrackBar elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

    }
}

