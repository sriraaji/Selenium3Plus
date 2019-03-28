package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadExcel {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\s.muppalla\\Desktop\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://newtourse.demoaut.com");
		 driver.manage().window().maximize();
		 
  }
}
