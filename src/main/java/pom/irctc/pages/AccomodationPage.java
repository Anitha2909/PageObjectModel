package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers{

	public AccomodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
     public AccomodationPage clickonmenu() {
     clickByXpath(prop.getProperty("AccomodationPage.menu.Xpath"));
     return this;
     }
	
     public NewUserSignUpPage clickonBookurcoach() {
     clickByXpath(prop.getProperty("AccomodationPage.Bookurcoach.Xpath"));
     return new NewUserSignUpPage(driver,test);
     }
     
     public EnquiryFormPage clickonCharter() {
     clickByXpath(prop.getProperty("AccomodationPage.Charter.Xpath"));
     return new EnquiryFormPage(driver,test);
     }
     
     public GuestUserLoginPage clickonirctchotels() {
     clickByXpath(prop.getProperty("AccomodationPage.irctchotels.Xpath"));
     return new GuestUserLoginPage(driver,test);
    }

    public AccomodationPage newWindow() {
 	switchToLastWindow();
 	 return this;
 	}
   
}
