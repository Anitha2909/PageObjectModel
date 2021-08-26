package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{

	public EnquiryFormPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public EnquiryFormPage clickonEnquiryForm() {
	clickByXpath(prop.getProperty("EnquiryFormPage.EnquiryForm.Xpath"));
    return this;
	}
	
	public EnquiryFormPage enterName(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.name.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage enterOrganisation(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.Organisation.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage enteraddress(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.address.Xpath"), data);
	return this;
	}

	public EnquiryFormPage enterMobilee(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.Mobilee.Xpath"), data);
	return this;
	}

	public EnquiryFormPage enteremail(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.email.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage selectrequestFor(String option) {
	selectyValueByXpath(prop.getProperty("EnquiryFormPage.requestFor.Xpath"), option);
	return this;
	}
	
	public EnquiryFormPage enteroriginStation(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.originStation.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage enterdestnStation(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.destnStation.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage clickonDateofdept() {
	clickByXpath(prop.getProperty("EnquiryFormPage.Dateofdept.Xpath"));
	return this;
	}
	
	public EnquiryFormPage clickonDate(String oprion) {
	clickByXpath(prop.getProperty("EnquiryFormPage.Date.Xpath"));
	return this;
	}
	
	public EnquiryFormPage clickonDateofarrival() {
	clickByXpath(prop.getProperty("EnquiryFormPage.Dateofarrival.Xpath"));
	return this;
	}
	
	
	public EnquiryFormPage clickonoutDate(String option) {
	clickByXpath(prop.getProperty("EnquiryFormPage.outDate.Xpath"));
	return this;
	}
	
	public EnquiryFormPage enterdurationPeriod(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.durationPeriod.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage entercoachDetails(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.coachDetails.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage enternumPassenger(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.numPassenger.Xpath"), data);	
	return this;
	}
	
	public EnquiryFormPage entercharterPurpose(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.charterPurpose.Xpath"), data);
	return this;
	}
	
	public EnquiryFormPage enterservices(String data) {
	enterByXpath(prop.getProperty("EnquiryFormPage.services.Xpath"), data);
	return this;
	}		
	
	public EnquiryFormPage clickonSubmit() {
	clickByXpath(prop.getProperty("EnquiryFormPage.Submit.Xpath"));
	return this;
	}

	public static String mobile;
	
	public EnquiryFormPage getmobile() {
	mobile = getTextByXpath(prop.getProperty("EnquiryFormPage.mobile.Xpath"));
	return this;	
	}
	public EnquiryFormPage verifytextMobile() {
	verifyTextByXpath(prop.getProperty("EnquiryFormPage.Mobile.Xpath"), EnquiryFormPage.mobile);
	return this;
	}
	
	public EnquiryFormPage newWindow() {
	switchToLastWindow();
	return this;
	}
	
	public EnquiryFormPage Arrowdown() {
	arrowDown();
	return this;
	}
	
	public EnquiryFormPage Waittime(long time) {
	waitProperty(time);
	return this;
	}
}
	
	
	
	
