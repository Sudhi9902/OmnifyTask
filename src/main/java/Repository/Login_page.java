package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends Driver {

	public Login_page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name = "username")
	private WebElement UsernameTextBox;
	@FindBy(name="password")
	private WebElement PasswordTextBox;
	@FindBy(xpath = "//button[text()=' Login '] ")
	private WebElement LoginButton;
	public WebElement getUsernameTextBox() {
		return UsernameTextBox;
	}
	public WebElement getPasswordTextBox() {
		return PasswordTextBox;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	

}
