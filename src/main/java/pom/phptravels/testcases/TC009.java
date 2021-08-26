package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.RegisterPhpPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass(){
	    testCaseName="TC003";
		testCaseDescription="To verify we can able to Register in PhpTravels Application";
		author="Anitha";
		category="Nature";
		browserName="chrome";
		appName="phptravels";
		
	}
	
	@Test
	public void PhpTravels(){

		new RegisterPhpPage(driver,test)
		
		.enterFirstName("Anitha")
		.enterLastName("A")
		.enterEmail("anitha2909@gmail.com")
		.enterPhone("9710200748")
		.enterCompanyName("SunNetwork")
		.enterAddress1("107")
		.enterAddress2("Moogambigai Nagar")
        .enterCity("Chennai")
        .enterstate("Tamil Nadu")
        .enterPostcode("600028")
		.selectCountry("IN")
		.enterMobileNumber("9710100278")
		.enterNewPassword1("sha09ani29@2018")
		.enterNewPassword2("sha09ani29@2018")
		.clickonbutton()
		.enterpasslength("12")
		.entergeneratepass("ani29sha09@$")
		.clickongenaratepass()
		.clickoncopy()
		.clickoncpytoclip()
		.clickonsubmit();
		
}
}