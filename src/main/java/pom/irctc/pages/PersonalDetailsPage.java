package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;
	
public class PersonalDetailsPage extends GenericWrappers{

	public PersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PersonalDetailsPage selecttitle(String option) {
	selectyValueByXpath(prop.getProperty("PersonalDetailsPage.title.Xpath"), option);
	return this;
	}
	
	public PersonalDetailsPage enterfirstName(String data) {
	enterByXpath(prop.getProperty("PersonalDetailsPage.firstName.Xpath"), data);
	return this;
	}
	
	public PersonalDetailsPage enterlastName(String data) {
	enterByXpath(prop.getProperty("PersonalDetailsPage.lastName.Xpath"), data);
	return this;
	}
	
	public PersonalDetailsPage selectstate(String option) {
	selectyValueByXpath(prop.getProperty("PersonalDetailsPage.state.Xpath"), option);
	return this;
	}
	
	public PersonalDetailsPage selectgst(String option) {
	selectyValueByXpath(prop.getProperty("PersonalDetailsPage.gst.Xpath"), option);
	return this;
	}
		
	public PersonalDetailsPage entercompanyName(String data) {
	enterByXpath(prop.getProperty("PersonalDetailsPage.companyName.Xpath"),data);
	return this;
	}
		
	public PersonalDetailsPage entercompanyAddress(String data) {
	enterByXpath(prop.getProperty("PersonalDetailsPage.companyAddress.Xpath"), data);
	return this;
	}
		
	
public static String gst;
	
	public PersonalDetailsPage getGST() {
	gst = getTextByXpath(prop.getProperty("PersonalDetailsPage.GST.Xpath"));
	return this;	
	}
	
	public PersonalDetailsPage verifygstNumber() {
	verifyTextByXpath(prop.getProperty("PersonalDetailsPage.gstNumber.Xpath"), PersonalDetailsPage.gst);
	return this;
	}
	
	public PaymentPage clickonContinue() {
	clickByXpath(prop.getProperty("PersonalDetailsPage.Continue.Xpath"));
	return new PaymentPage(driver,test);
	}
	
	public PersonalDetailsPage verifyhotelname() {
	verifyTextByXpath(prop.getProperty("PersonalDetailsPage.hotelname.Xpath"), HoteldetailsPage.hotelname);
	return this;
	}
		
	public PersonalDetailsPage verifyfareamount() {
	verifyTextByXpath(prop.getProperty("PersonalDetailsPage.fareamount.Xpath"), HoteldetailsPage.fareamount);
	return this;
	}
	
	public PersonalDetailsPage Waittime(long time) {
	waitProperty(time);
	return this;
	}
	
	public PersonalDetailsPage newWindow() {
	switchToLastWindow();
	return this;
	}
}


