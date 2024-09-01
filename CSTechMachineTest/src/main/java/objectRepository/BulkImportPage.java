package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLib.IconstantUtility;
 

public class BulkImportPage {

	@FindBy(xpath = "//input[@type='file']")
	private WebElement chooseFile;

	@FindBy(xpath = "//button[text()='Import']")
	private WebElement importFile;

	@FindBy(xpath = "//button[text()='Validate Data']")
	private WebElement validateData;

	@FindBy(xpath = "//div[contains(@class, 'MuiAvatar-root')]")
	private WebElement profile;

	@FindBy(xpath = "//span[text()=' Logout ']")
	private WebElement logoutOption;

	public BulkImportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getChooseFile() {
		return chooseFile;
	}

	public WebElement getImportFile() {
		return importFile;
	}

	public WebElement getValidateData() {
		return validateData;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public void clickonChooseFile() {
		chooseFile.sendKeys(IconstantUtility.filePath);
	}

	public void clickonImportFile() {
		importFile.click();
	}

	public void clickonValidateData() {
		validateData.click();
	}

}