package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Employee extends Driver {

	public Add_Employee(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement PIMButton;
	@FindBy(linkText = "Add Employee")
	private WebElement AddEmployeeButton;
	@FindBy(name = "firstName")
	private WebElement FirstNameTestBox;
	@FindBy(name = "lastName")
	private WebElement LastnametextBox;
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement SaveButton;
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement AdminButton;
	@FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']")
	private WebElement SearchBoxTextField;
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement SearchButton;
	@FindBy(xpath = "//div[@role='cell']")
	private WebElement TextMethod;

	public WebElement getTextMethod() {
		return TextMethod;
	}

	public WebElement getSearchBoxTextField() {
		return SearchBoxTextField;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getPIMButton() {
		return PIMButton;
	}

	public WebElement getAddEmployeeButton() {
		return AddEmployeeButton;
	}

	public WebElement getFirstNameTestBox() {
		return FirstNameTestBox;
	}

	public WebElement getLastnametextBox() {
		return LastnametextBox;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getAdminButton() {
		return AdminButton;
	}
}
