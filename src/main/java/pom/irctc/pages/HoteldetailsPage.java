package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HoteldetailsPage extends GenericWrappers{

	public HoteldetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public static String hotelname;
	public static String fareamount;
	
	public HoteldetailsPage gethotelname(String option) {
	hotelname = getTextByXpath(prop.getProperty("HoteldetailsPage.hotelname.Xpath"));
	return this;	
	}
	
	public HoteldetailsPage getfareamount(String option) {
	fareamount = getTextByXpath(prop.getProperty("HoteldetailsPage.fareamount.Xpath"));
	return this;	
	}
	
	public PersonalDetailsPage clickonContinuetoBook() {
	 clickByXpath(prop.getProperty("HoteldetailsPage.ContinuetoBook.Xpath"));
	 return new PersonalDetailsPage(driver,test);
	}
	
}
