package genericUtilityOrLib;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility {
	WebDriver driver=null;
	Actions act=null;
	Select s=null;
	/**
	 * This is generic method for implicit wait
	 * @param particularSeconds
	 */
	public void implicitWait(WebDriver driver,int particularSeconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
	}
	/*
	 * this is a generic method to maximize window
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/*--------------------Actions class generic functions----------------------------*/
	/**
	 * this generic method to right click on an Element
	 * @param element
	 */
	public void rightClickOnAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * this is generic method to click on an element
	 * 
	 * @param element
	 */
	public void clickOnAnElement(WebDriver driver,WebElement element) {
	act=new Actions(driver);
	act.click(element).perform();
	}
	public void dragAndDropAnElement(WebDriver driver,WebElement src,WebElement target) {
		act=new Actions(driver);
		act.dragAndDrop(src, target).perform();;
		
	}
	public void dragAPointer(WebDriver driver,WebElement src,int xOffset, int yOffset) {
		act=new Actions(driver);
		act.dragAndDropBy(src, xOffset, yOffset).perform();
		
	}
	public void scrollToparticularElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	public void moveCursorToAnElement(WebDriver driver,WebElement element) {
	act =new Actions(driver);
	act.moveToElement(element).perform();
	}
	
	public void holdAnElement(WebDriver driver,WebElement element) {
		act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	
	public void releaseAnElement(WebDriver driver,WebElement element){
		act=new Actions(driver);
		act.release(element).perform();
	}
	/**
	 * this generic method to select an option based on index value
	 * 
	 * @param element
	 * @param indexNum
	 */
	public void selectElementByIndex(WebElement element,int indexNum) {
		s=new Select(element);
		s.selectByIndex(indexNum);
	}
	/**
	 * this generic method to select an option based on visible text
	 * 
	 * @param element
	 * @param text
	 */
	public void selectElementByVisibleText(WebElement element,String text) {
		s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * this generic method to select an option based on value
	 * 
	 * @param element
	 * @param value
	 */
	public void selectElementByValue(WebElement element,String value) {
		s=new Select(element);
		s.selectByValue(value);
	}
	/** this generic  method  to de-select */
	public void deselectElementByIndex(WebElement element,int indexNum) {
		s=new Select(element);
		s.deselectByIndex(indexNum);
	}
	public void deselectElementByVisibleText(WebElement element,String text) {
		s=new Select(element);
		s.deselectByVisibleText(text);
	}
	public void deselectElementByValue(WebElement element,String value) {
		s=new Select(element);
		s.deselectByValue(value);
	}
	public void deselectAllOptions(WebElement element) {
		s=new Select(element);
		s.deselectAll();
	}
	public List<WebElement> fetchAllSelectOptions(WebElement element) {
		s=new Select(element);
		List<WebElement> all=s.getAllSelectedOptions();
		return all;
		}
	
	public List<WebElement> fetchAllOptions(WebElement element) {
		s=new Select(element);
		List<WebElement> all=s.getOptions();
		return all;
		}
	/*--------------Alert----------*/
	/**
	 * this is a generic method to accept the alert
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * this is a generic method to dismiss the alert
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/*----------------Frame--------------*/
	/**
	 * this is generic method to Switch frame based on child index
	 * @param childFrameindex
	 */
	public void switchTochildFrame(int childFrameindex)   
	{
		driver.switchTo().frame(childFrameindex);
	}
}






