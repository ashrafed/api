package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import guiPage.home;
import guiPage.results;

@Test
public class newClass {
	
	private WebDriver driver;
	
	public JSONFileManager testData = new 
		   JSONFileManager("src/test/resource/TestDataFile/google/gooleTestData.json");
	
	@Test
	public void checkthisgoogleLogaIsdisplayed() {

		Validations.assertThat()
		.element(driver, home.goolgeLoga_image())
		.matchesReferenceImage()
		.withCustomReportMessage("this is logo image")
		.perform();
		
	}

	@Test
	public void checkThisResultNotEmpty() {
		
		
		
		new home(driver).searchForQuery(testData.getTestData("searchForQuery"));

		Validations.assertThat()
		.element(driver,results.resulstStust_lebel())
		.text()
		.doesNotEqual(driver)
		.withCustomReportMessage("assert this not emety reults")
		.perform();
		
	}

	@BeforeMethod
	public void beforMethod() {
		driver = DriverFactory.getDriver();
		new home(driver).navegat();

	}
	
	@AfterMethod
	public void aftermethod() {
		BrowserActions.closeCurrentWindow(driver);
	}
}
