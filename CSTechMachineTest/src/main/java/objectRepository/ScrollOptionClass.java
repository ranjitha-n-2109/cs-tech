package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollOptionClass {
	WebDriver driver = null;

	public void scrollOperation() {
		WebElement ele = driver.findElement(By.xpath("(//td[contains(@class, 'MuiTableCell')])[34]"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
	}

}
