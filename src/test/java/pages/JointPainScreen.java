package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import support.TestBase;

/**
 * Created by ochesnokova on 4/25/16.
 */
public class JointPainScreen extends TestBase {

    @iOSFindBy(name = "no pain")
    public MobileElement noPain;

    @iOSFindBy(name = "nav bar right arrow")
    public MobileElement forwardError;
}
