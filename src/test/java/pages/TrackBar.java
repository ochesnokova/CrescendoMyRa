package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
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

    @AndroidFindBy(id = "fragment_home_track")
    @iOSFindBy(id = "Track")
    public MobileElement track;


    @AndroidFindBy(id = "fragment_home_summary")
    @iOSFindBy(id = "Summary")
    public MobileElement summary;

    @AndroidFindBy(id = "fragment_home_me")
    @iOSFindBy(id = "Me")
    public MobileElement me;

    @AndroidFindBy(id = "fragment_home_resources")
    @iOSFindBy(id = "Resources")
    public MobileElement resources;


    public TrackBar() {

        System.out.println("Initializing TrackBar elements....");
        PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

    }
}

