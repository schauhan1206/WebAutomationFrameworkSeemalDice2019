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
	public void offersEmailGet() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkoffersEmailGet();
	}
	@Test
	public void selectCartGet() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkselectCartGet();
	}
	@Test
	public void testSignInRegister() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkRegisterCheck();
	}
	@Test
	public void testlocatedWhere() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checklocatedWhere();
	}
	@Test
	public void testLogo() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkLogo();
	}
	@Test
	public void testerWareHouseSavings() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkviewWareHouseSavings();
	}
	@Test
	public void facebookLogo() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.facebookLogo();
	}
	@Test
	public void testus() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkus();
	}
	@Test
	public void getHelp() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.getHelp();
	}
	@Test
	public void testMembership() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkMembership();
	}
	@Test
	public void testServices() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkServices();
	}
	@Test
	public void customerService() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.customerService();
	}
	@Test
	public void testGrocery() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkGrocery();
	}
	@Test
	public void testwarehouseLocations() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkwarehouseLocations();
	}
	@Test
	public void testCustomerService() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkCustomerService();
	}
	@Test
	public void testAll() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkAll();
	}
	@Test
	public void testOptical() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkOptical();
	}
	@Test
	public void testLocation() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkLocation();
	}
	@Test
	public void testPhoto() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkPhoto();
	}
	@Test
	public void findaWarehouse() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.findaWarehouse();
	}
	@Test
	public void testShopAllDepartment() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkShopAllDepartment();
	}
	@Test
	public void enterYourEmail() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.enterYourEmail();
	}
	@Test
	public void followUs() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.followUs();
	}
	@Test
	public void testPharmacy() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkPharmacy();
	}
	@Test
	public void testTravel() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkTravel();
	}
	@Test
	public void pLogo() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.pLogo();
	}
	@Test
	public void testSearch() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkSearch();
	}
	@Test
	public void testGetEmailOffers() {
		TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
		}.getClass().getEnclosingMethod().getName()));
		mainPage.checkGetEmailOffers();
	}//current
}
