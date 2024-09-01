package automationTest02;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class FunctionalTestingCase {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.dealsdray.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']"))
		.sendKeys("prexo.mis@dealsdray.com",Keys.TAB,"prexo.mis@dealsdray.com",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Order']")).click();
		driver.findElement(By.xpath("//span[text()='Orders']")).click();
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		driver.findElement(By.xpath("//input[@type='file']"))
     	.sendKeys("D:\\AssignmentFolder\\demo-data.xlsx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Import']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Robot r = new Robot();

		for (int i = 1; i <= 6; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(2000);
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY hh-mm-ss");
		String date = sdf.format(d);
		
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		File dest1=new File(".\\ScreenshotFolder\\"+"SS1"+date+".png");
		Files.copy(src1, dest1);
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("(//td[contains(@class, 'MuiTableCell')])[34]"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		Thread.sleep(2000);
		
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		File src2=ts2.getScreenshotAs(OutputType.FILE);
		File dest2=new File(".\\ScreenshotFolder\\"+"SS2"+date+".png");
		Files.copy(src2, dest2);
		Thread.sleep(2000);
		driver.quit();
	}

}
