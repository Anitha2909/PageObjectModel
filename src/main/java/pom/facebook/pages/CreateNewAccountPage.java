package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CreateNewAccountPage extends GenericWrappers{

	public CreateNewAccountPage(RemoteWebDriver driver, ExtentTest test) {
	this.driver=driver;
	this.test=test;
	}
	
	public CreateNewAccountPage clickonEnglish() {
	clickByXpath(prop.getProperty("CreateNewAccountPage.English.Xpath"));
	return this;
	}
	
	public FacebookSignUpPage clickonCreateNewAccount() {
		clickByXpath(prop.getProperty("CreateNewAccountPage.CreateNewAccount.Xpath"));
		return new FacebookSignUpPage(driver,test);
		
	}

}
