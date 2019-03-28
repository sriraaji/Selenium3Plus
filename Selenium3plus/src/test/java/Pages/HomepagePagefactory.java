package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepagePagefactory {
 WebDriver driver;
 
 @FindBy(name = "userName") WebElement username;
 @FindBy(name = "password") WebElement password;
 @FindBy(xpath="//input[@value='Login']") WebElement signin;
 
//construtor
	public HomepagePagefactory(WebDriver driver){
		this.driver=driver;
	}
//Methods
	public void enterun(String uid){
		username.sendKeys(uid);
	}
	public void enterpsd(String psd){
		password.sendKeys(psd);
	}
	public void clicklogin(){
		signin.click();
	}
	

 
}
