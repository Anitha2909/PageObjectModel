package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
	    testCaseName="TC007";
		testCaseDescription="To verify we can able to saloontest in  irctc Application";
		author="Anitha";
		category="Fog";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void  Saloon() {
		
	new CovidAlertPage(driver,test)
	.clickonok()
	.mouseHoverOnHolidays()
	.mouseHoverOnStays()
	.clickOnLounge()
	.newWindow()
	.clickonmenu()
	.clickonCharter()
	.newWindow()
	.clickonEnquiryForm()
	.enterName("Anitha")
	.enterOrganisation("Modern")
	.enteraddress("Labour Colony")
	.enterMobilee("971010063")
	.enteremail("anitha2909@gmail.com")
	.selectrequestFor("Saloon Charter")
	.enteroriginStation("Chennai")
	.enterdestnStation("Kerela")
	.Waittime(3000)
	.clickonDateofdept()
	.Arrowdown()
	.Waittime(5000)
	.clickonDate("24")
	.Waittime(3000)
	.clickonDateofarrival()
	.Waittime(3000)
	.clickonoutDate("25")
	.enterdurationPeriod("3")
	.entercoachDetails("s1")
	.enternumPassenger("5")
	.entercharterPurpose("All")
	.enterservices("Yes")
	.clickonSubmit()
	.getmobile()
	.verifytextMobile();
	}		
}
