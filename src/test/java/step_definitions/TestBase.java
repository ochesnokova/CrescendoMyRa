package step_definitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ochesnokova on 4/7/16.
 */
public class TestBase {

    public static WebDriver driver;



    public TestBase(){
        String string = "fsgsfdgg";

        driver = new FirefoxDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL url = null;
        try {
            url = new URL("http://localhost:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        AppiumDriver driverApp = new AndroidDriver(url, capabilities);

    }
}

