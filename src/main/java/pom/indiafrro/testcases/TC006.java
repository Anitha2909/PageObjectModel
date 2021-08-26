package pom.indiafrro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrro.pages.SignUpPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass(){
	    testCaseName="TC004";
		testCaseDescription="To verify we can able to Register in FormC Application";
		author="Anitha";
		category="Smoke";
		browserName="chrome";
		appName="indfrro";
	
	}
	
	@Test
	public void IndianFrro(){

		new SignUpPage(driver,test)
		
		.clickonSignUp()
		.enterid("Ani29@2021")
		.enterpwd("ani29sha09@$")
		.enterrepwd("ani29sha09@$")
		.selectsecques("1")
		.entersecans("Iraianbu")
		.entername("Anitha")
		.selectgender("F")
		.enterdob("29/03/1997")
		.enterdesignation("Junior Engg")
		.enteremailid("anitha2909@gmail.com")
		.entermobile("9710100356")
		.enterphone("49302919")
		.entername("Anitha")
		.entercapacity("4")
		.enteraddress("107, Moogambigai Nagar")
		.selectstate("28")
		.Waittime(5000)
		.selectcitydistr("2D")
		.selectaccotype("GH")
		.selectstarrat("5s")
		.enteremail("anitha2909@gmail.com")
		.entermcontact("9710200467")
		.entercontact("40102948")
		.enternameOff("Anitha")
		.enteraddressOff("229, Rajaji Street")
		.selectstateOff("28")
		.selectcitydistrOff("7D")
		.enteremailidOff("anithaanandan29@gmail.com")
		.enterphonenoOff("40284958")
		.entermobileOff("9710300487")
		.clickonsubmitb();
	}

}
