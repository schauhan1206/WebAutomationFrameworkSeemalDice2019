package home;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(xpath = "//p[@id='banner-headline']")
    public static WebElement needTechTalent;



    public void checkNeedTechTalent() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        needTechTalent.click();
    }
    public void ClickSearchWebID() {
        driver.findElement(By.id("clearable_globalSearchInputField")).sendKeys("Find Blue");
        System.out.println("Test is good");


    }



}
