package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
	    testCaseName="TC008";
		testCaseDescription="To verify we can able to OtpValidation in  irctc Application";
		author="Anitha";
		category="Home";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void  OtpValidation() {
		
		new CovidAlertPage(driver,test)
		.clickonok()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.newWindow()
		.clickonirctchotels()
		.newWindow()
		.clickonlogin()
		.clickonGuestuserlogin()
		.enteremail("anithaanandan29@gmail.com")
		.entermobileNo("9710100245")
		.clickonLogin()
		.Waittime(5000)
		.enterHotelName("chennai")
		.Arrowdown()
		.Waittime(5000)
		.clickonhotelname("Ginger Chennai (Tharamani, Iitm)")
		.clickonCheckinDate()
		.Waittime(5000)
		.clickoninDate("24")
		.Waittime(5000)
	    .clickonCheckoutDate()
	    .Waittime(5000)
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
		.selectgst("No")
		.Waittime(5000)
		.verifyhotelname()
		.verifyfareamount()
		.clickonContinue()
		.newWindow()
		.clickonTermsAndConditions()
		.clickonMakePayment()
		.clickonVerify()
		.getotp()
		.verifyOTP();
	}    
}
