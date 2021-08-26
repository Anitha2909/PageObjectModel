package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass(){
	    testCaseName="TC005";
		testCaseDescription="To verify we can able to signup in irctc Application";
		author="Anitha";
		category="Cloud";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void IrctcSignUp() {
	
		
		new CovidAlertPage(driver,test)
	
	    .clickonok()
	 	.clickonRegister()
		.enteruserName("Anitha")
		.enterusrPwd("ani29sha09@$")
		.entercnfUsrPwd("ani29sha09@$")
		.clickonPreferredlanguage()
		.clickonlanguage("English")
		.clickonSecQues()
		.clickonSecQuestion("Who was your Childhood hero?")
		.enterSecAns("Sham")
        .clickonContinue()
        .enterFirstName("Anitha")
        .entermiddleName("A")
        .enterlastname("Anandhan")
        .clickonOcc()
        .clickonOccupation("GOVERNMENT")
        .enterDOB("29-03-1997")
        .clickonMarrstatus("Unmarried")
        .clickonGender("Female")
        .enteremail("anitha2909@gmail.com")
        .entermobile("9710100287")
        .selectnationality("94")
        .clickonContinuee()
        .enterresAddress("107")
        .enterresAddress2("Moogambigai Nagar")
        .enterresAddress3("Sikkarayapuram")
        .enterPincode("600069")
        .clickOnState()
        .selectresCity("Kanchipuram")
        .selectresPostOff("Nandambakkam B.O")
        .enterresPhone("40209359")
        .clickonCopytoOffAddress("No")
        .enteroffAddress1("229")
        .enteroffAddress2("Rajaji")
        .enteroffAddress3("MRC")
        .clickonSelectCountry()
        .clickonSelectCountry1("India")
        .enteroffPinCode("600028")
        .enteroffCity("Chennai")
        .enteroffPostOff("600028")
        .enteroffPhone("40294039")
        .clickontermCondition();	
	}
}
