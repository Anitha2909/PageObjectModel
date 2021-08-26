package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PaymentPage extends GenericWrappers{

	public PaymentPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public PaymentPage clickonTermsAndConditions() {
	clickByXpath(prop.getProperty("PaymentPage.TermsAndConditions.Xpath"));
	return this;
	}
		
	public VerificationPage clickonMakePayment() {
	clickByXpath(prop.getProperty("PaymentPage.MakePayment.Xpath"));
	return new VerificationPage(driver,test);
	}
	
	public PaymentPage newWindow() {
	switchToLastWindow();
	return this;
	}
			
}
