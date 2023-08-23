package Scripts;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import Repository.Add_Employee;

public class TestCase_01_Test extends BaseClass {
	@DataProvider
	public String[][] getCredentials() throws Exception {
		FileInputStream fis = new FileInputStream(new File("./src/test/resources/Omnify_EmployeeList.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet dataSheet = workbook.getSheet("Sheet1");
		int rowCount = dataSheet.getPhysicalNumberOfRows() - 1;
		int colCount = dataSheet.getRow(1).getPhysicalNumberOfCells() - 1;

		String[][] testData = new String[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				testData[i][j] = dataSheet.getRow(i).getCell(j).toString();
			}
		}
		return testData;

	}

	@Test(dataProvider = "getCredentials")
	public void Employees(String[] credentials) throws InterruptedException {
		wait = new WebDriverWait(driver, 20);
		Add_Employee addemployee = new Add_Employee(driver);
		addemployee.getPIMButton().click();
		addemployee.getAddEmployeeButton().click();
		wait.until(ExpectedConditions.elementToBeClickable(addemployee.getFirstNameTestBox()));
		addemployee.getFirstNameTestBox().sendKeys(credentials[0]);
		addemployee.getLastnametextBox().sendKeys(credentials[0]);
		addemployee.getSaveButton().click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		addemployee.getPIMButton().click();
		WebElement dta = addemployee.getSearchBoxTextField();
		Thread.sleep(2000);
		act.click(dta).sendKeys(credentials[0]).perform();
		Thread.sleep(2000);
		addemployee.getSearchButton().click();
	}

}
