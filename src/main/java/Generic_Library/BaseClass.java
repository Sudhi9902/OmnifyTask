package Generic_Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Repository.Login_page;
import Repository.Logout_page;

public class BaseClass {
	public WebDriver driver;
	protected WebDriverWait wait;

	@BeforeClass
	public void LaunchBrowser() throws IOException {
		// System.setProperty("webdriver.chrome.driver",
		// "./src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(Read_Data.Userdata("url"));

	}

	@BeforeMethod(alwaysRun = true)
	public void LoginUser() throws IOException {
		Login_page Login = new Login_page(driver);
		Login.getUsernameTextBox().sendKeys(Read_Data.Userdata("username"));
		Login.getPasswordTextBox().sendKeys(Read_Data.Userdata("password"), Keys.ENTER);
	}

	@AfterMethod
	public void Logout() {
		Logout_page Logout = new Logout_page(driver);
		Logout.getProfilepicture().click();
		Logout.getLogoutButton().click();
	}

	@AfterClass
	public void QuitBrowser() {
		driver.quit();
	}

}
