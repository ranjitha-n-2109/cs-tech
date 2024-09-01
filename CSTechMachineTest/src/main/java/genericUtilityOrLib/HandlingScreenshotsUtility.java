package genericUtilityOrLib;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;



public class HandlingScreenshotsUtility {
	
	public static void handlingScreenshot(WebDriver driver,String imageName) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\ScreenshotFolder\\"+imageName+".png");
		Files.copy(src, dest);
			
	}
}
