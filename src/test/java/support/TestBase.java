package support;


import hooks.TestHooks;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.*;
import pages.ScreenBase;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestBase {

	public static AppiumDriver driver;
	public static ScreenBase scr;


	@BeforeSuite
	public void setUp(){

		System.out.println("Starting Appium driver.....");
		driver = TestHooks.getDriver();

		System.out.println("ScreenBase constructor starting....");
		scr = new ScreenBase();

	}

	@Test
	public void testFirst() {

		System.out.println("   wait to dismiss any system location dialogs");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {                wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.err.println("   no alert visible after 10 sec.");            }

	}

	@AfterSuite
	public void tearDown(){
		System.out.println(".......Stopping Appium driver");
		driver.quit();
	}
}