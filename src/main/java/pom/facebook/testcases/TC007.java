package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.facebook.pages.CreateNewAccountPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
	testCaseName="TC001";
	testCaseDescription="To Verify we can able to Create an Account in Facebook Application";
	author="Anitha";
	category="Family";
	browserName="chrome";
	appName="facebook";
	}
	
	@Test
	public void FacebookSignUp(){

	new CreateNewAccountPage(driver,test)
	.clickonEnglish()
	.clickonCreateNewAccount()
	.enterfirstname("Anitha")
	.enterlastname("Anandhan")
	.enteremail("anitha2909as@gmail.com")
	.enterremailconfirmation("anitha2909as@gmail.com")
	.enterrpasswd("ani29sha09@2021")
	.selectDay("29")
	.selectmonth("3")
	.selectYear("1997")
    .clickonsex("1")
	.clickonSignUp();
	
	}
}
