package homepackagetests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import homepackage.TitlePage;

public class TitlePageTest extends TitlePage {

	@Test
	public void searchPage() {
		String expectedTitle = "Welcome to Costco Wholesale";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
}
