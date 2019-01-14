package testHome;

import home.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends MainPage {

    MainPage mainPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testNeedTechTalent(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mainPage.checkNeedTechTalent();
    }
    @test
    public void ClickSearchWebID() {
        driver.findElement(By.id("clearable_globalSearchInputField")).sendKeys("Find Blue");
     }
     @test
    public void SearchStores() {
         driver.findElement(By.className("redesign-header-nav-list-item")).sendKeys(Click);
     }


    }
}
}