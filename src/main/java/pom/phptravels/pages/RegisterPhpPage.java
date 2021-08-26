package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegisterPhpPage extends GenericWrappers{

	public RegisterPhpPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegisterPhpPage enterFirstName(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.FirstName.Xpath"), data);
	return this;
	}
		
	public RegisterPhpPage enterLastName(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.LastName.Xpath"), data);
	return this;
	}	
		
	public RegisterPhpPage enterEmail(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.email.Xpath"), data);	
	return this;
	}
	
	public RegisterPhpPage enterPhone(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.Phone.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterCompanyName(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.CompanyName.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterAddress1(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.Address1.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterAddress2(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.Address2.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterCity(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.City.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterstate(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.state.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterPostcode(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.postcode.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage selectCountry(String option) {
	selectyValueByXpath(prop.getProperty("RegisterPhpPage.Country.Xpath"), option);
	return this;
	}

	public RegisterPhpPage enterMobileNumber(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.MobileNumber.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterNewPassword1(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.NewPassword1.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage enterNewPassword2(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.NewPassword2.Xpath"),data);
	return this;
	}
	
	public RegisterPhpPage clickonbutton() {
	clickByXpath(prop.getProperty("RegisterPhpPage.button.Xpath"));
	return this;
	}
	
	public RegisterPhpPage enterpasslength(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.passlenght.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage entergeneratepass(String data) {
	enterByXpath(prop.getProperty("RegisterPhpPage.generatepass.Xpath"), data);
	return this;
	}
	
	public RegisterPhpPage clickongenaratepass() {
	clickByXpath(prop.getProperty("RegisterPhpPage.genaratepass.Xpath"));
	return this;
	}
	
	public RegisterPhpPage clickoncopy() {
	clickByXpath(prop.getProperty("RegisterPhpPage.copy.Xpath"));
	return this;
	}
	
	public RegisterPhpPage clickoncpytoclip() {
	clickByXpath(prop.getProperty("RegisterPhpPage.cpytoclip.Xpath"));
	return this;
	}
		
	public RegisterPhpPage clickonsubmit() {
	clickByXpath(prop.getProperty("RegisterPhpPage.submit.Xpath"));
	return this;
	}
	}
