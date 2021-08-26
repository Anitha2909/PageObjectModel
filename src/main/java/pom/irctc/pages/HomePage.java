package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public RegistrationPage clickonRegister() {
	clickByXpath(prop.getProperty("HomePage.Register.Xpath"));
	return new RegistrationPage(driver,test);
	}
	
	public HomePage mouseHoverOnHolidays() {
	mouseHoverByXpath(prop.getProperty("HomePage.Holidays.Xpath"));
	return this;
    }

	public HomePage mouseHoverOnStays() {
	mouseHoverByXpath(prop.getProperty("HomePage.Stays.Xpath"));
	return this;
	}

	public AccomodationPage clickOnLounge() {
	clickByXpath(prop.getProperty("HomePage.Lounge.Xpath"));
	return new AccomodationPage(driver,test);
	}
	

}