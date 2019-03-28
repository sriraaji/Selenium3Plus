package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ActionTest1 {
	WebDriver driver;
  @Test
  public void f() {
	  //Switching to Frame
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  WebElement Drag = driver.findElement(By.id("draggable"));
	  WebElement Drop = driver.findElement(By.id("droppable"));
	  Actions act = new Actions(driver);
	  act.dragAndDrop(Drag, Drop).build().perform();
	  //Using clickAndHold and release
	  //act.clickAndHold(Drag).release(Drop).build().perform();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\s.muppalla\\Desktop\\Selenium\\Drivers\\Chrome Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://jqueryui.com/droppable/");
	 driver.manage().window().maximize();
  }


@AfterMethod
  public void afterMethod() {
	driver.quit();
  }

}
