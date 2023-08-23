package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_page extends Driver {

	public Logout_page(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//img[@alt='profile picture']")
	private WebElement Profilepicture;
	@FindBy(linkText = "Logout")
	private WebElement LogoutButton;
	public WebElement getProfilepicture() {
		return Profilepicture;
	}
	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	
}
