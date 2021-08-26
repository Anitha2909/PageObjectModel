package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import pom.irctc.pages.HomePage;
import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{

	public CovidAlertPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
public HomePage clickonok() {
		
	clickByXpath(prop.getProperty("CovidAlertPage.ok.Xpath"));
	       
	return new HomePage(driver,test);
}

}