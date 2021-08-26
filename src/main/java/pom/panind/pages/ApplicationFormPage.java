package pom.panind.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import pom.irctc.pages.tourismLoginPage;
import pom.panind.pages.ApplicationFormPage;
import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ApplicationFormPage extends GenericWrappers{
	
	public ApplicationFormPage (RemoteWebDriver driver, ExtentTest test) {
	this.driver=driver;
	this.test=test;
	}
	
	public ApplicationFormPage selecttitle(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.title.Xpath"), option);
	return this;	
	}

	public ApplicationFormPage enterfirstname(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.firstname.Xpath"), data);
	return this;	
	}

	public ApplicationFormPage entermiddlename(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.middlename.Xpath"), data);
	return this;	
	}

	public ApplicationFormPage enterlastname(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.lastname.Xpath"), data);
	return this;	
	}

	public ApplicationFormPage enterfatherfirstname(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.fatherfirstname.Xpath"), data);
	return this;	
	}
	
	public ApplicationFormPage enterfathermiddlename(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.fathermiddlename.Xpath"), data);
	return this;	
	}
	
	public ApplicationFormPage enterfatherlastname(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.fatherlastname.Xpath"), data);
	return this;	
	}
	
	public ApplicationFormPage entermobilenumber(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.mobilenumber.Xpath"), data);
	return this;	
	}
	
	public ApplicationFormPage enteremail(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.email.Xpath"), data);
	return this;	
	}
	
	public ApplicationFormPage selectsourceofincome(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.sourceofincome.Xpath"), option);
	return this;	
	}
	
	public ApplicationFormPage clickonoffice() {
	clickByXpath(prop.getProperty("ApplicationFormPage.office.Xpath"));
	return this;
	}
	
	public ApplicationFormPage enterdob(String date) {
	enterByXpath(prop.getProperty("ApplicationFormPage.dob.Xpath"), date);
	return this;
	}
	
	public ApplicationFormPage enteraddressline1(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.addressline1.Xpath"), data);
	return this;
	}
	
	public ApplicationFormPage enteraddressline2(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.addressline2.Xpath"), data);
	return this;
	}
	
	public ApplicationFormPage entercityname(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.cityname.Xpath"), data);
	return this;
	}
	
	public ApplicationFormPage selectstate(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.state.Xpath"), option);
	return this;
	}
	
	public ApplicationFormPage enterpincode(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.pincode.Xpath"), data);
	return this;
	}
	
	public ApplicationFormPage enterofficename(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.officename.Xpath"), data);
	return this;
	}
	
	public ApplicationFormPage enterofficeaddressline1(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.officeaddressline1.Xpath"), data);
	return this;
	}
	
	public ApplicationFormPage enterofficeaddressline2(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.officeaddressline2.Xpath"), data);
	return this;
	}
		
	public ApplicationFormPage enterofficecityname(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.officecityname.Xpath"), data);
	return this;
	}
		
	public ApplicationFormPage selectofficestate(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.officestate.Xpath"), option);
	return this;
	}
	
	public ApplicationFormPage enterofficepincode(String data) {
	enterByXpath(prop.getProperty("ApplicationFormPage.officepincode.Xpath"), data);
	return this;
	}
	
	public ApplicationFormPage selectidentityproof(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.identityproof.Xpath"), option);
	return this;
	}
	
	public ApplicationFormPage selectaddressproof(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.addressproof.Xpath"), option);
	return this;
	}
	
	public ApplicationFormPage selectDOBproof(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.DOBproof.Xpath"), option);
	return this;
	}
	
	public ApplicationFormPage selectaadhaarproof(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.aadhaarproof.Xpath"), option);
	return this;
	}
	
	public ApplicationFormPage selectofficeaddressproof(String option) {
	selectyValueByXpath(prop.getProperty("ApplicationFormPage.officeaddressproof.Xpath"), option);
	return this;
	}
	
	public ApplicationFormPage clickoncheckbox() {
	clickByXpath(prop.getProperty("ApplicationFormPage.checkbox.Xpath"));
	return this;
	}
	
	public ApplicationFormPage clickonnextbutton() {
	clickByXpath(prop.getProperty("ApplicationFormPage.nextbutton.Xpath"));
    return this;
	}
	public ApplicationFormPage pagedown() {
	pageDown("//html/body");
	return this;
	}
	
	
	public ApplicationFormPage Waittime (long time) {
		waitProperty(time);
		return this;
		}
		
	}

