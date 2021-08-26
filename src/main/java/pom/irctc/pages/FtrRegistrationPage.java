package pom.irctc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrRegistrationPage extends GenericWrappers{

	public FtrRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public FtrRegistrationPage enteruserId(String data){
	enterByXpath(prop.getProperty("FtrRegistrationPage.userId.Xpath"), data);
	return this;
	}
		
	public FtrRegistrationPage enterpassword(String data) {
	enterByXpath(prop.getProperty("FtrRegistrationPage.password.Xpath"), data);
	return this;
	}
		
	public FtrRegistrationPage entercnfPassword(String data) {
	enterByXpath(prop.getProperty("FtrRegistrationPage.cnfpassword.Xpath"), data);
	return this;
    }

	public FtrRegistrationPage SelectsecQstn(String option) {
	selectyValueByXpath(prop.getProperty("FtrRegistrationPage.secQstn.Xpath"), option);
	return this;
    }

	public FtrRegistrationPage entersecAnswer(String data) {
	enterByXpath(prop.getProperty("FtrRegistrationPage.secAnswer.Xpath"), data);
	return this;
    }
	
	public FtrRegistrationPage clickondateOfBirth() {
	clickByXpath(prop.getProperty("FtrRegistrationPage.dateofBirth.Xpath"));
	return this;
    }
	
	public FtrRegistrationPage SelectYear(String text) {
	selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.Year.Xpath"), text);
	return this;
    }
	
	public FtrRegistrationPage SelectMonth(String text) {
	selectVisibileTextByXpath(prop.getProperty("FtrRegistrationPage.Month.Xpath"), text);
	return this;
    }
	
	public FtrRegistrationPage clickonDay(String option) {
	clickByXpath(prop.getProperty("FtrRegistrationPage.Day.Xpath"));
	return this;
    }
	
	public FtrRegistrationPage clickongender(String option) {
	clickByXpath(prop.getProperty("FtrRegistrationPage.gender.Xpath")); 
	return this;
	 }

	public FtrRegistrationPage clickonmaritalStatus(String option) {
	clickByXpath(prop.getProperty("FtrRegistrationPage.maritalStatus.Xpath"));
	return this;
	}
	    
	 public FtrRegistrationPage enteremail(String data) {
     enterByXpath(prop.getProperty("FtrRegistrationPage.email.Xpath"), data);
	 return this;
	  }
	
	 public FtrRegistrationPage Selectoccupation(String option) {
	 selectyValueByXpath(prop.getProperty("FtrRegistrationPage.occupation.Xpath"),option);
	 return this;
	  }
	
	 public FtrRegistrationPage enterfname(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.fname.Xpath"),data);
	 return this;
	 }
		    
     public FtrRegistrationPage entermname(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.mname.Xpath"),data);
	 return this;
	 }
		    
	 public FtrRegistrationPage enterlname(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.lname.Xpath"),data);
	 return this;
	 }
	 
	 public FtrRegistrationPage Selectnatinality(String option) {
	 selectyValueByXpath(prop.getProperty("FtrRegistrationPage.natinality.Xpath"),option);
	 return this;
	 }
	 
	 public FtrRegistrationPage enterflatNo(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.flatNo.Xpath"),data);
	 return this;
	 }
		    
	 public FtrRegistrationPage enterstreet(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.street.Xpath"),data);
	 return this;
	 }
			 
	 public FtrRegistrationPage enterarea(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.area.Xpath"), data);
	 return this;
	 }
	 
	 public FtrRegistrationPage Selectcountry(String option) {
	 selectyValueByXpath(prop.getProperty("FtrRegistrationPage.country.Xpath"),option);
	 return this;
	 }
	 
	 public FtrRegistrationPage entermobile(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.mobile.Xpath"),data);
	 return this;
	 }
	 
	 public FtrRegistrationPage enterpincode(String data) {
	 enterByXpathTab(prop.getProperty("FtrRegistrationPage.pincode.Xpath"), data, Keys.TAB);
	 return this;
	 }
	 
	 public FtrRegistrationPage SelectpostOffice(String data) {
	 selectyValueByXpath(prop.getProperty("FtrRegistrationPage.postOffice.Xpath"), data);
	 return this;
	 }
	 
	 public FtrRegistrationPage clickonaddress(String option) {
	 clickByXpath(prop.getProperty("FtrRegistrationPage.address.Xpath"));
	 return this;
	 }
			
	 public FtrRegistrationPage enterflatNoOffice(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.flatNoOffice.Xpath"),data);
	 return this;
	 }
			
	 public FtrRegistrationPage enterstreetOffice(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.streetOffice.Xpath"),data);
	 return this;
	 }
			
	 public FtrRegistrationPage enterareaOffice(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.areaOffice.Xpath"),data);
	 return this;
	 }
	 
	 public FtrRegistrationPage SelectcountryOffice(String option) {
	 selectyValueByXpath(prop.getProperty("FtrRegistrationPage.countryOffice.Xpath"),option);
	 return this;
	 }
	 
	 public FtrRegistrationPage entermobileOffice(String data) {
	 enterByXpath(prop.getProperty("FtrRegistrationPage.mobileOffice.Xpath"),data);
	 return this;
	 }
	 
	 public FtrRegistrationPage enterpincodeOffice(String data) {
     enterByXpathTab(prop.getProperty("FtrRegistrationPage.pincodeOffice.Xpath"), data, Keys.TAB);
	 return this;
	 }
	 
	 public FtrRegistrationPage SelectpostOfficeOff(String option) {
	 selectyValueByXpath(prop.getProperty("FtrRegistrationPage.postOfficeOff.Xpath"), option);
	 return this;
	 }
	 
	public FtrRegistrationPage waittime(long time) {
	waitProperty(time);
	return this;
	}
	
	public FtrRegistrationPage arrowdown() {
	arrowDown();
	return this;
	}
	
	public FtrRegistrationPage pageDown() {
	pageDown();
	return this;
	}
}
