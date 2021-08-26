package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class NewUserSignUpPage extends GenericWrappers{

	public NewUserSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FtrRegistrationPage clickonnewusersignup() {
		
		clickByXpath(prop.getProperty("NewUserSignUpPage.newusersignup.Xpath"));
        return new FtrRegistrationPage(driver,test);
	}
	
	public NewUserSignUpPage newWindow() {
	switchToLastWindow();
	return this;
	}
	}
