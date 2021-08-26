package pom.panind.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panind.pages.ApplicationFormPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To Verify we can able to Register PanInd Application";
		author="Anitha";
		category="Function";
		browserName="chrome";
		appName="panind";
		}
	
	@Test
	public void PanInd(){

	new ApplicationFormPage(driver,test)
	
	.selecttitle("3")
	.enterfirstname("Anitha")
	.entermiddlename("A")
	.enterlastname("Anandhan")
	.enterfatherfirstname("Anandhan")
	.enterfathermiddlename("A")
	.enterfatherlastname("Viswanathan")
	.entermobilenumber("9710299309")
	.enteremail("anitha2909@gmail.com")
    .selectsourceofincome("2")	
    .clickonoffice()
    .enterdob("29031997")
    .pagedown()
    .Waittime(4000)
    .enteraddressline1("107")
    .enteraddressline2("Moogambigai Nagar")
    .entercityname("Kancheepuram")
    .selectstate("Tamil Nadu")
    .enterpincode("600069")
    .enterofficename("NOKIA")
    .Waittime(3000)
    //.enterofficeaddressline1("223")
    .enterofficeaddressline2("Rajaji")
    .enterofficecityname("Chennai")
    .selectofficestate("Tamil Nadu")
    .enterofficepincode("600028")
    .selectidentityproof("16")
    .selectaddressproof("21")
    .selectDOBproof("14")
    .selectaadhaarproof("Copy of Aadhaar Card/Letter")
    .selectofficeaddressproof("2")
    .clickoncheckbox()
    .clickonnextbutton();
    
	}   
}
