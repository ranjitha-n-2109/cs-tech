package genericUtilityOrLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePage;
import objectRepository.LoginPage;


public class BaseClass {

	public static WebDriver driver = null;
	SeleniumUtility SUTIL = new SeleniumUtility();
	PropertiesUtilityJava PUTIL = new PropertiesUtilityJava();

	@BeforeSuite(alwaysRun = true)
	public void createConnection() {
		System.out.println("connection establish");
	}

	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Exception {
		String URL = PUTIL.getDataFromProperties("url");
		SUTIL = new SeleniumUtility();
		driver = new ChromeDriver();

		SUTIL.implicitWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("Launching Successfully");
	}

	@BeforeMethod(alwaysRun = true)
	public void login() throws Exception {
		String USERNAME = PUTIL.getDataFromProperties("username");
		String PASSWORD = PUTIL.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginOpertaion(USERNAME, PASSWORD);
		System.out.println("Login Sucessufully!!");
	}

	@AfterMethod(alwaysRun = true)
	public void logout() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("Logout sucessfully!!");
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser closed sucessfully!!");
	}

	@AfterSuite(alwaysRun = true)
	public void closeConnection() {
		System.out.println("connection closed Sucessfully!!");
	}
}