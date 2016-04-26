package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import support.TestBase;

/**
 * Created by ochesnokova on 4/25/16.
 */
public class FatigueScreen extends TestBase {


    @iOSFindBy(name = "NO FATIGUE")
    public MobileElement noFatigue;

    @iOSFindBy(name = "BIG TIRED")
    public MobileElement bitTired;
}
