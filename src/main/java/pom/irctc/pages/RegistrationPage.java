package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public RegistrationPage enteruserName(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.userName.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enterusrPwd(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.usrPwd.Xpath"), data);
	return this;
	}

	public RegistrationPage entercnfUsrPwd(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.cnfUsrPwd.Xpath"), data);
	return this;
	}

	public RegistrationPage clickonPreferredlanguage() {
	clickByXpath(prop.getProperty("RegistrationPage.Preferredlanguage.Xpath"));
	return this;
	}
	
	public RegistrationPage clickonlanguage(String option) {
	clickByXpath(prop.getProperty("RegistrationPage.language.Xpath"));
	return this;
	}

	public RegistrationPage clickonSecQues() {
	clickByXpath(prop.getProperty("RegistrationPage.SecQues.Xpath"));
	return this;
	}

	public RegistrationPage clickonSecQuestion(String option) {
	clickByXpath(prop.getProperty("RegistrationPage.SecQuestion.Xpath"));
	return this;
	}

	public RegistrationPage enterSecAns(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.SecAns.Xpath"), data);
	return this;
	}
	
	public RegistrationPage clickonContinue() {
	clickByXpath(prop.getProperty("RegistrationPage.Continue.Xpath"));
	return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.FirstName.Xpath"),data);
	return this;
	}
	
	public RegistrationPage entermiddleName(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.middleName.Xpath"), data);
	return this;
	}	
	
	public RegistrationPage enterlastname(String data) {
    enterByXpath(prop.getProperty("RegistrationPage.lastname.Xpath"), data);
	return this;
	}	
	
	public RegistrationPage clickonOcc() {
	clickByXpath(prop.getProperty("RegistrationPage.Occ.Xpath"));
	return this;
	}
	
	public RegistrationPage clickonOccupation(String option) {
	clickByXpath(prop.getProperty("RegistrationPage.Occupation.Xpath"));
	return this;
	}	
	
	public RegistrationPage enterDOB (String data){
	enterByXpath(prop.getProperty("RegistrationPage.DOB.Xpath"), data);
	return this;
	}	
	
	public RegistrationPage clickonMarrstatus(String option) {
	clickByXpath(prop.getProperty("RegistrationPage.Marrstatus.Xpath"));
	return this;
	}
	
	public RegistrationPage clickonGender(String option) {
	clickByXpath(prop.getProperty("RegistrationPage.Gender.Xpath"));
	return this;
	}
	
	public RegistrationPage enteremail(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.email.Xpath"), data);
	return this;
	}
	
	public RegistrationPage entermobile(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.mobile.Xpath"), data);
	return this;
	}
	
	public RegistrationPage selectnationality(String option) {
	selectyValueByXpath(prop.getProperty("RegistrationPage.nationality.Xpath"), option);
	return this;
	}
	
	public RegistrationPage clickonContinuee(){
	clickByXpath(prop.getProperty("RegistrationPage.Continuee.Xpath"));
	return this;
	}
	
	public RegistrationPage enterresAddress(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.resAddress1.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enterresAddress2(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.resAddress2.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enterresAddress3(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.resAddress3.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enterPincode(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.Pincode.Xpath"), data);
	return this;
	}
	
	public RegistrationPage clickOnState() {
	clickByXpath(prop.getProperty("RegistrationPage.State.Xpath"));
	return this;
	}
	
	public RegistrationPage selectresCity(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.resCity.Xpath"), Value);
	return this;
	}
	
	public RegistrationPage selectresPostOff(String Value) {
	selectVisibileTextByXpath(prop.getProperty("RegistrationPage.resPostOff.Xpath"), Value);
	return this;
	}
	
	public RegistrationPage enterresPhone(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.resPhone.Xpath"), data);
	return this;
	}
	
	public RegistrationPage clickonCopytoOffAddress(String option) {
	clickByXpath(prop.getProperty("RegistrationPage.CopytoOffAddress.Xpath"));
	return this;
	}

	public RegistrationPage enteroffAddress1(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.offAddress1.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enteroffAddress2(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.offAddress2.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enteroffAddress3(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.offAddress3.Xpath"), data);
	return this;
	}
	
	public RegistrationPage clickonSelectCountry() {
	clickByXpath(prop.getProperty("RegistrationPage.SelectCountry.Xpath"));
	return this;
	}
	
	public RegistrationPage clickonSelectCountry1(String option) {
	clickByXpath(prop.getProperty("RegistrationPage.SelectCountry1.Xpath"));
	return this;
	}
	
	public RegistrationPage enteroffPinCode(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.offPincode.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enteroffCity(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.offCity.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enteroffPostOff(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.offPostOff.Xpath"), data);
	return this;
	}
	
	public RegistrationPage enteroffPhone(String data) {
	enterByXpath(prop.getProperty("RegistrationPage.offPhone.Xpath"), data);
	return this;
	}
	
	public RegistrationPage clickontermCondition() {
	clickByXpath(prop.getProperty("RegistrationPage.termCondition.Xpath"));
	return this;
	}
	
	public RegistrationPage Waittime(long time) {
	waitProperty(time);
	return this;
	}
	
	public RegistrationPage Arrowdown() {
	arrowDown();
	return this;
	}



		
}


