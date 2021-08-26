package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class VerificationPage extends GenericWrappers{

	public VerificationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public static String otp;
	
	public VerificationPage getotp() {
	otp = getTextByXpath(prop.getProperty("VerificationPage.otp.Xpath"));
	return this;	
	}
	public VerificationPage clickonVerify() {
	clickByXpath(prop.getProperty("VerificationPage.Verify.Xpath"));
	return this;
	}

	public VerificationPage verifyOTP() {
    verifyTextByXpath(prop.getProperty("VerificationPage.OTP.Xpath"), VerificationPage.otp);
	return this;
	}
	
}
