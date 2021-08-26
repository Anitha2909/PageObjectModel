package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass(){
	    testCaseName="TC009";
		testCaseDescription="To verify we can able to GstValidation in  irctc Application";
		author="Anitha";
		category="Rainbow";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
public void  GstValidation() {
		
		new CovidAlertPage(driver,test)
		.clickonok()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.newWindow()
		.clickonirctchotels()
		.clickonlogin()
		.clickonGuestuserlogin()
		.enteremail("anithaanandan29@gmail.com")
		.entermobileNo("9710100245")
		.newWindow()
		.clickonLogin()
		.Waittime(4000)
		.enterHotelName("Chennai")
		.Arrowdown()
		.Waittime(4000)
		.clickonhotelname("Ginger Chennai (Tharamani, Iitm)")
		.clickonCheckinDate()
		.Waittime(5000)
		.clickoninDate("24")
		.Waittime(3000)
	    .clickonCheckoutDate()
	    .Waittime(4000)
	    .clickonoutDate("25")
	    .clickonguest()
	    .selecthotelRoom("1")
	    .selecthotelAdult("3")
	    .selecthotelChild("0")
	    .clickonDone()
	    .clickonFindHotel()
	    .gethotelname("Ginger Chennai (Tharamani, IITM) ")
		.getfareamount("₹ 3527 ")
		.clickonContinuetoBook()
		.newWindow()
		.selecttitle("3")
		.enterfirstName("Anitha")
		.enterlastName("Anandhan")
		.selectstate("TN")
		.selectgst("Yes")
		.entercompanyName("NOKIA")
		.entercompanyAddress("Navalur")
	    .getGST()
		.verifygstNumber();
}

}