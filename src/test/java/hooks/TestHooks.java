package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import support.TestBase;
import utils.CommonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class
TestHooks extends TestBase{

    public static AppiumDriver getDriver() {
        return driver;
    }

    @Before
    public void startDriver() throws Exception {

        Properties prop = new Properties();

        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/properties/platform.properties");
        prop.load(file);

        String platform = prop.getProperty("platform");

        if (driver == null) {

            if (platform.equals("iOS")) {
                CommonUtils.setIOSCapabilities();
                driver = CommonUtils.createIOSDriver();
            }
            if (platform.equals("Android")) {
                CommonUtils.setAndroidCapabilities();
                driver = CommonUtils.createAndroidDriver();
            }

            scr.initialize();

        }
        else {
            driver.resetApp();
        }

    }

    @After
    public void stopDriver(Scenario scenario) {
        File scrFile = null;

        if (scenario.isFailed()) {
            String name = scenario.getId();
            createDir(name);
            scrFile = takeScreenshot(name);
            embedScreenShot(scenario ,scrFile);
        }

        driver.closeApp();
    }

    private void embedScreenShot(Scenario scenario, File scrFile) {

        byte[] convertedScreen = new byte[(int) scrFile.length()];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(scrFile);
            fileInputStream.read(convertedScreen);
        } catch (Exception e) {
            e.printStackTrace();
        }

        scenario.embed(convertedScreen, "image/png");
    }

    private void createDir(String name) {
        File dir = new File("./target/screenshots/" + name);
        if (dir.exists() && dir.isDirectory()){
            System.out.printf("ok");
        } else {
            dir.mkdirs();
        }
    }

    private File takeScreenshot(String name) {
        String path;
        File source = null;
        try {
            source = driver.getScreenshotAs(OutputType.FILE);
            path = "./target/screenshots/" + name + "/screen" + TimeNow() + ".png";
            FileUtils.copyFile(source, new File(path));
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return source;
    }

    private String TimeNow(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
}
