package homepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import base.*;

import static org.openqa.selenium.Keys.ENTER;

public class SearchPage extends BaseUtil {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.costco.com");
		driver.findElement(By.id("search-field")).sendKeys("Dell",ENTER);

	}
}
