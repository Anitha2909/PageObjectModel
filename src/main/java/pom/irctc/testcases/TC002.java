package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass(){
	    testCaseName="TC006";
		testCaseDescription="To verify we can able to Bookyourcoach irctc Application";
		author="Anitha";
		category="Climate";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void BookYourCoach() {
	
	new CovidAlertPage(driver,test)
	
	.clickonok()
	.mouseHoverOnHolidays()
	.mouseHoverOnStays()
	.clickOnLounge()
	.newWindow()
	.clickonmenu()
	.clickonBookurcoach()
	.newWindow()
	.clickonnewusersignup()
    .enteruserId("AniSha")
	.enterpassword("Aniapril@2021")
	.entercnfPassword("Aniapril@2021")
	.SelectsecQstn("0")
	.entersecAnswer("Jacky")
	.clickondateOfBirth()
	.waittime(3000)
	.SelectYear("1970")
	.waittime(3000)
	.SelectMonth("May")
	.clickonDay("29")
	.clickongender("F")
	.clickonmaritalStatus("UnMarried")
	.enteremail("anitha2909@gmail.com")
	.Selectoccupation("Government")
	.enterfname("Anitha")
	.entermname("A")
	.enterlname("Anandhan")
	.Selectnatinality("94")
	.enterflatNo("107")
	.enterstreet("Moogambigai Nagar")
	.enterarea("Sikkarayapuram")
	.Selectcountry("94")
	.entermobile("9710200387")
	.enterpincode("600069")
	.SelectpostOffice("Nandambakkam B.O")
	.clickonaddress("sameAddresses1")
	.enterflatNoOffice("229")
	.enterstreetOffice("Rajaji Street")
	.enterareaOffice("MRC Nagar")
	.SelectcountryOffice("94")
	.entermobileOffice("9043200045")
	.enterpincodeOffice("600028")
	.SelectpostOfficeOff("Raja Annamalaipuram S.O");
	}
}

