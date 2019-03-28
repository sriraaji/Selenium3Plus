package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  WebDriver driver;
  //Webelements
  By un = By.name("userName");
  By psd = By.name("password");
  By signin = By.name("login");
  By registerlink = By.linkText("REGISTER");
  
  //constructor
  public HomePage(WebDriver driver) {
	  this.driver = driver;
  }
  
  //Methods
  
  public void typeun(String uid) {
	  driver.findElement(un).sendKeys(uid);
  }
  public void typepsw(String pass) {
	  driver.findElement(psd).sendKeys(pass);
  }
  public void clicksignin(){
		driver.findElement(signin).click();
	}
	public void clickregister(){
		driver.findElement(registerlink).click();
	}

		  
}
