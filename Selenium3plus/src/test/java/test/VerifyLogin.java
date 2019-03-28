package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Drivers.getDrivers;
import Pages.HomePage;
import ScreenShots.captureScreenshots;

public class VerifyLogin {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver = getDrivers.drivername("chrome");
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  HomePage hp = new HomePage(driver);
	  hp.typeun("mercury");
	  hp.typepsw("mercury");
	  hp.clicksignin();
	  Thread.sleep(2000);
	  captureScreenshots.capturescreen(driver);
	  driver.close();
  }
}
