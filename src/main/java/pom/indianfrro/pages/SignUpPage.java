package pom.indianfrro.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{

	public SignUpPage (RemoteWebDriver driver, ExtentTest test) {
	this.driver=driver;
	this.test=test;
	}
	
public FormCRegisterPage clickonSignUp() {
		
	clickByXpath(prop.getProperty("SignUpPage.SignUp.Xpath"));
       
	return new FormCRegisterPage(driver,test);

}
}
