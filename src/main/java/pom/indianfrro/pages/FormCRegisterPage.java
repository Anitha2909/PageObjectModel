package pom.indianfrro.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.GenericWrappers;

public class FormCRegisterPage extends GenericWrappers{

	public FormCRegisterPage (RemoteWebDriver driver, ExtentTest test) {
	this.driver=driver;
	this.test=test;
	}
	
	public FormCRegisterPage enterid(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.id.Xpath"), data);
    return this;
	}
	
	public FormCRegisterPage enterpwd(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.pwd.Xpath"), data);
	return this;
	}
	
	public FormCRegisterPage enterrepwd(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.repwd.Xpath"), data);
	return this;
	}
	
	public FormCRegisterPage selectsecques(String option) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.secques.Xpath"), option);
	return this;
	}
	
	public FormCRegisterPage entersecans(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.secans.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage enteruname(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.uname.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage selectgender(String option) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.gender.Xpath"), option);
	return this;
	}
	
	public FormCRegisterPage enterdob(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.dob.Xpath"), data);
	return this;
	}
	
	public FormCRegisterPage enterdesignation(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.designation.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage enteremailid(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.emailid.Xpath"),data);
	return this;
	}		
	
	public FormCRegisterPage entermobile(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.mobile.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage enterphone(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.phone.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage entername(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.name.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage entercapacity(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.capacity.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage enteraddress(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.address.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage selectstate(String option) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.state.Xpath"),option);
	return this;
	}
	
	public FormCRegisterPage selectcitydistr(String option) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.citydistr.Xpath"), option);
	return this;
	}

	public FormCRegisterPage selectaccotype(String option) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.accotype.Xpath"),option);
	return this;
	}
	
	public FormCRegisterPage selectstarrat(String option) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.starrat.Xpath"),option);
	return this;
	}
	
	public FormCRegisterPage enteremail(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.email.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage entermcontact(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.mcontact.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage entercontact(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.contact.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage enternameOff(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.nameoff.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage enteraddressOff(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.addressOff.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage selectstateOff(String data) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.stateOff.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage selectcitydistrOff(String option) {
	selectyValueByXpath(prop.getProperty("FormCRegisterPage.citydistrOff.Xpath"),option);
	return this;
	}
	
	public FormCRegisterPage enteremailidOff(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.mailifOff.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage enterphonenoOff(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.phonenoOff.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage entermobileOff(String data) {
	enterByXpath(prop.getProperty("FormCRegisterPage.mobileOff.Xpath"),data);
	return this;
	}
	
	public FormCRegisterPage clickonsubmitb() {
	clickByXpath(prop.getProperty("FormCRegisterPage.submitb.Xpath"));
	return this;
	}
	
	public FormCRegisterPage Waittime(long time) {
		waitProperty(time);
		return this;
		}
}
