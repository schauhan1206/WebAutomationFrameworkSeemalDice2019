package homepackage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class CostcoMain extends BaseUtil {


	@FindBy(id="footer-email-offers-block") //1
	public static WebElement offersEmailGet;
	@FindBy(id="cart-d") //2
	public static WebElement selectCartGet;
	@FindBy(id="header_sign_in") //4
	public static WebElement RegisterCheck;
	@FindBy(xpath="//input[@id='footer-search-field']") //5
	public static WebElement locatedWhere;
	@FindBy(xpath ="//div[@class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']//img[@class='bc-logo logo-us']" ) //6
	public static WebElement logo;
	@FindBy(id = "warehouse-savings") //7
	public static WebElement viewWareHouseSavings;
	@FindBy(xpath="//ul[@class='social']//i[@class='fi-social-facebook']") //8
	public static WebElement facebookLogo;
	@FindBy(xpath ="//a[@id='country-select']" ) //9
	public static WebElement us;
	@FindBy(className="get-help")  //10
	public static WebElement getHelp;
	@FindBy(xpath="//a[@id='Home_Ancillary_7']") //11
	public static WebElement Membership;
	@FindBy(xpath="//a[@id='Home_Ancillary_4']") //12
	public static WebElement Services;
	@FindBy(xpath="//div[text()='Customer Service']") //13
	public static WebElement customerService;
	@FindBy(xpath="//a[@id='Home_Ancillary_0']") //14
	public static WebElement Grocery;
	@FindBy(id="warehouse-locations-dropdown") //15
	public static WebElement warehouseLocations;
	@FindBy(id="customer-service-link") //16
	public static WebElement CustomerService;
	@FindBy(id="search-dropdown-select") //17
	public static WebElement All;
	@FindBy(xpath="//a[@id='Home_Ancillary_2']") //18
	public static WebElement Optical;
	@FindBy(xpath="//a[@id='Home_Ancillary_5']") //20
	public static WebElement Photo;
	@FindBy(id="footer-find-warehouse-block") //21
	public static WebElement findaWarehouse;
	@FindBy(id="navigation-dropdown") //22
	public static WebElement ShopAllDepartment;
	@FindBy(xpath="//input[@id='footer-email-offers']") //23
	public static WebElement enterYourEmail;
	@FindBy(xpath="//div[text()='Follow Us']") //24
	public static WebElement followUs;
	@FindBy(xpath="//a[@id='Home_Ancillary_3']") //25
	public static WebElement Pharmacy;
	@FindBy(xpath="//a[@id='Home_Ancillary_6']") //26
	public static WebElement Travel;
	@FindBy(xpath="//ul[@class='social']//i[@class='fi-social-pinterest']") //27
	public static WebElement pLogo;
	@FindBy(xpath ="//input[@id='search-field']" ) //28
	public static WebElement search;
	@FindBy(id="email-signup-dropdown") //29
	public static WebElement GetEmailOffers;


	public void checkoffersEmailGet(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		offersEmailGet.click();
	} //1
	public void checkselectCartGet(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		selectCartGet.click();
	} //2
	public void checkRegisterCheck(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		RegisterCheck.click();
	} //4
	public void checklocatedWhere(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		locatedWhere.click();
	} //5
	public void checkLogo(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		logo.click();
	} //6
	public void checkviewWareHouseSavings(){ //7
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		viewWareHouseSavings.click();
	} //7
	public void facebookLogo(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		facebookLogo.click();
	} //8
	public void checkus(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		us.click();
	} //9
	public void getHelp(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		getHelp.click();
	} //10
	public void checkMembership(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		Membership.click();
	} //11
	public void checkServices(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		Services.click();
	} //12
	public void checkCustomerService(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		CustomerService.click();
	} //13
	public void checkGrocery(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		Grocery.click();
	} //14
	public void checkwarehouseLocations(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		warehouseLocations.click();
	} //15
	public void customerService(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		customerService.click();
	} //16
	public void checkAll(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		All.click();
	} //17
	public void checkOptical(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		Optical.click();
	} //18
	public void checkPhoto(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		Photo.click();
	} //20
	public void findaWarehouse(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		findaWarehouse.click();
	} //21
	public void checkShopAllDepartment(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		ShopAllDepartment.click();
	} //22
	public void enterYourEmail(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		enterYourEmail.click();
	} //23
	public void followUs(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		followUs.click();
	} //24
	public void checkPharmacy(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		Pharmacy.click();
	} //25
	public void checkTravel(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		Travel.click();
	} //26
	public void pLogo(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		pLogo.click();
	} //27
	public void checkSearch(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		search.click();
	} //28
	public void checkGetEmailOffers(){
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
		GetEmailOffers.click();
	} //29
}
