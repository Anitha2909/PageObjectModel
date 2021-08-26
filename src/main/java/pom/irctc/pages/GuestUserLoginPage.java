package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers{

	public GuestUserLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
		public GuestUserLoginPage clickonlogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.login.Xpath"));
		return this;
		}
			 
		public GuestUserLoginPage clickonGuestuserlogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.Guestuserlogin.Xpath"));
		return this;
		}
			 
		public GuestUserLoginPage enteremail(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.email.Xpath"), data);
		return this;
		}
			 
		public GuestUserLoginPage entermobileNo(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.mobileNo.Xpath"), data);
		return this;
		}
			 
		public tourismLoginPage clickonLogin() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.Login.Xpath"));
		return new tourismLoginPage(driver,test);
		}
		
		 public GuestUserLoginPage newWindow() {
		switchToLastWindow();
		return this;
			 	}
}
