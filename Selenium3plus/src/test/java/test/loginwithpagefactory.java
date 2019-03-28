package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Drivers.getDrivers;
import Pages.HomepagePagefactory;

public class loginwithpagefactory {
	WebDriver driver;
	HomepagePagefactory hpf;
  @Test
  public void f() {
	  driver=getDrivers.drivername("chrome");
	  driver.get("http://newtours.demoaut.com");
	  hpf = PageFactory.initElements(driver, HomepagePagefactory.class);
	  hpf.enterun("mercury");
	  hpf.enterpsd("mercury");
	  hpf.clicklogin();
	  driver.quit();
  }
}
