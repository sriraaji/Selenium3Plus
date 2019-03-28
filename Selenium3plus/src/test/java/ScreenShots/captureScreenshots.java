package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenshots { 
 public static void capturescreen(WebDriver driver) throws IOException {
	 TakesScreenshot ts = (TakesScreenshot) driver; 
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src, new File("C:\\Users\\s.muppalla\\Desktop\\Selenium\\Screenshots\\" + "error.png"));
 }
}
