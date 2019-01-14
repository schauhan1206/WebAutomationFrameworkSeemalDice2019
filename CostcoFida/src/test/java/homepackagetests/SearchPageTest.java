package homepackagetests;

import homepackage.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest extends SearchPage {

	@Test
	public void searchPage() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.costco.com");
		String expectedTitle = "Welcome to Costco Wholesale";
		Assert.assertEquals("Condition is true", driver.getTitle(), expectedTitle);

	}
}
