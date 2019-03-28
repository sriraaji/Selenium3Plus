package Drivers;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getDrivers {
	static WebDriver driver;
	public static WebDriver drivername(String browsername) {
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\s.muppalla\\Desktop\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver","C:\\Users\\s.muppalla\\Desktop\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
			 driver = new FirefoxDriver();
		}
		return driver;
	}

}
