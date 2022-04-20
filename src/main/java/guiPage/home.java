package guiPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class home {

	// Variables

	private WebDriver driver;

	public final String url = System.getProperty("googleUrl");
	
	//private final String url = "https://www.google.com/";

	// locators

	public static By goolgeLoga_image() { // googleLogoImage
		return By.xpath("//img[@alt='Google']");
	}

	private static By searchBox() {
		return By.xpath("//input[@name='q']");
	}

	// Contractor
	public home(WebDriver driver) {
		this.driver = driver;
	}

	// Keywords
	
	/**
	 * Navigate to google home 
	 * @return Navigate to google home
	 */

	public home navegat() {

		BrowserActions.navigateToURL(driver, url);
		return this;
	}
	
	/**
	 * 
	 * @param query
	 * @return
	 */

	public results searchForQuery(String query) {

		(new ElementActions(driver)
				.type(searchBox(), query))
		        .keyPress(searchBox(), Keys.ENTER);

		return new results(driver);
	}
}
