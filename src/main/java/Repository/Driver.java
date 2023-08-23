package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Driver {
	public Driver(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
