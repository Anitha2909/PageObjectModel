package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers{

	public FacebookSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FacebookSignUpPage enterfirstname(String data) {
	enterByXpath(prop.getProperty("FacebookSignUpPage.firstname.Xpath"), data);
	return this;
	}	
		
	public FacebookSignUpPage enterlastname(String data) {
	enterByXpath(prop.getProperty("FacebookSignUpPage.lastname.Xpath"),data);
	return this;
	}	
	
	public FacebookSignUpPage enteremail(String data) {
	enterByXpath(prop.getProperty("FacebookSignUpPage.email.Xpath"),data);
	return this;
	}
	
	public FacebookSignUpPage enterremailconfirmation(String data) {
	enterByXpath(prop.getProperty("FacebookSignUpPage.emailconfirmation.Xpath"),data);
	return this;
	}	
	
	public FacebookSignUpPage enterrpasswd(String data) {
	enterByXpath(prop.getProperty("FacebookSignUpPage.rpasswd.Xpath"),data);
	return this;
	}
	
	public FacebookSignUpPage selectDay(String date) {
	selectyValueByXpath(prop.getProperty("FacebookSignUpPage.selectDay.Xpath"), date);
	return this;
	}
	
	public FacebookSignUpPage selectmonth(String month) {
	selectyValueByXpath(prop.getProperty("FacebookSignUpPage.selectmonth.Xpath"),month);
	return this;
	}

	public FacebookSignUpPage selectYear(String Year) {
	selectyValueByXpath(prop.getProperty("FacebookSignUpPage.selectYear.Xpath"),Year);
	return this;
	}
	
	public FacebookSignUpPage clickonsex(String option){
	clickByXpath(prop.getProperty("FacebookSignUpPage.sex.Xpath"));
	return this;
	}
	
	public FacebookSignUpPage clickonSignUp() {
	clickByXpath(prop.getProperty("FacebookSignUpPage.SignUp.Xpath"));
	return this;
	}	
	
}
