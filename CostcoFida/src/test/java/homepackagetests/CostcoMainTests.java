package homepackagetests;

import homepackage.CostcoMain;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CostcoMainTests extends CostcoMain {

	CostcoMain mainPage;

	@BeforeMethod
	public void initElements() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage = PageFactory.initElements(driver, CostcoMain.class);
	}
	@Test
	public void offersEmailGet() { //selects the email box at the page bottom
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkoffersEmailGet();
	}
	@Test
	public void selectCartGet() { //shows what is in your shopping cart
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkselectCartGet();
	}
	@Test
	public void testSignInRegister() { //Takes you to the log on form
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkRegisterCheck();
	}
	@Test
	public void testlocatedWhere() { //Takes you to locating a warehouse box at page bottom
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checklocatedWhere();
	}
	@Test
	public void testLogo() { //clicks on the main Costco Logo on top left corner
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkLogo();
	}
	@Test
	public void testerWareHouseSavings() { //selects and shows options Warehouse Savings
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkviewWareHouseSavings();
	}
	@Test
	public void facebookLogo() { //selects the facebook logo and takes you to Costco's Facebook page
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.facebookLogo();
	}
	@Test
	public void testus() { //Selects the country page user wants, in this case the US
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkus();
	}
	@Test
	public void getHelp() { //Takes to customer support page for assistance
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.getHelp();
	}
	@Test
	public void testMembership() { //Gives user details about joining the Costco Program
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkMembership();
	}
	@Test
	public void testServices() { //Gives the services provided by Costco
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkServices();
	}
	@Test
	public void customerService() { //Navigates to page bottom to customer service link
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.customerService();
	}
	@Test
	public void testGrocery() { //Selects grocery options
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkGrocery();
	}
	@Test
	public void testwarehouseLocations() { //expands warehouse locations dropdown menu
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkwarehouseLocations();
	}
	@Test
	public void testCustomerService() { //Takes to customer service
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkCustomerService();
	}
	@Test
	public void testAll() { //Selects "All" options from dropdown menu next to search bar
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkAll();
	}
	@Test
	public void testOptical() { //Takes to Costco's optical section
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkOptical();
	}
	@Test
	public void testPhoto() { //Takes to Costco's photo section
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkPhoto();
	}
	@Test
	public void findaWarehouse() { //redundant, takes you down to warehouse finder at page bottom
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.findaWarehouse();
	}
	@Test
	public void testShopAllDepartment() { //expands All departments on the top left
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkShopAllDepartment();
	}
	@Test
	public void enterYourEmail() { //redundant, takes you down to email offers
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.enterYourEmail();
	}
	@Test
	public void followUs() { //Navigates down to "Follow Us" where you can access social media options for Costco
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.followUs();
	}
	@Test
	public void testPharmacy() { //Navigates to Costco Pharmacy page
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkPharmacy();
	}
	@Test
	public void testTravel() { //Navigates to Costco travel page
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkTravel();
	}
	@Test
	public void pLogo() { //Navigates to Costco Pinterest Social Media Page
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.pLogo();
	}
	@Test
	public void testSearch() { //Navigates to Costco Search bar
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkSearch();
	}
	@Test
	public void testGetEmailOffers() { //Navigates to the to top of the page to "Get email offers"
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkGetEmailOffers();
	}
}
