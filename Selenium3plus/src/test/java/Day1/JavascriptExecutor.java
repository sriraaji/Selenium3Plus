package Day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutor {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\s.muppalla\\Desktop\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://newtourse.demoaut.com");
		 driver.manage().window().maximize();
		 //Javascript --perform scroll down - window.scrollby(x,y)
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to tour')");
		driver.switchTo().alert().accept();
		js.executeScript("window.scrollBy(0,75)");
		//enter value when you are unablr to identify webelement
		WebElement un = driver.findElement(By.name("userName"))
				js.executeScript("arguments[0].value = 'mercury'," us)
				//get title
				String titlePage = js.executeScript("retunr document.title").toString();
		//highliting
		 js.executeScript("arguments[0].style.border = '7 px dotted red line'", un);
		 //Taking screen shot and place it some where it
		 TakesScreenshot screen = (TakesScreenshot)driver;
		 File src = screen.getScreenshotAs(OutputType.FILE);
		 //copy screenshot and desired location - FileUtils
		 FileUtils.copyFile(src, new File("error.png"));
			
		
				
  }

}
