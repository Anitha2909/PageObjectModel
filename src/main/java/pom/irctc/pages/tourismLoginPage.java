package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class tourismLoginPage extends GenericWrappers{
	
	public tourismLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public tourismLoginPage enterHotelName(String data) {
	enterByXpath(prop.getProperty("tourismLoginPage.HotelName.Xpath"), data);
	return this;
	}
			
	public tourismLoginPage clickonhotelname(String option) {
	clickByXpath(prop.getProperty("tourismLoginPage.hotelname.Xpath"));
	return this;
	}
	
	public tourismLoginPage clickonCheckinDate() {
	clickByXpath(prop.getProperty("tourismLoginPage.CheckinDate.Xpath"));
	return this;
	}
	
	public tourismLoginPage clickoninDate(String option) {
	clickByXpath(prop.getProperty("tourismLoginPage.inDate.Xpath"));
	return this;
	}
	
	public tourismLoginPage Waittime (long time) {
	waitProperty(time);
	return this;
	}
	
	public tourismLoginPage clickonCheckoutDate() {
	clickByXpath(prop.getProperty("tourismLoginPage.CheckoutDate.Xpath"));
	return this;
	}
	
	public tourismLoginPage clickonoutDate(String option) {
	clickByXpath(prop.getProperty("tourismLoginPage.outDate.Xpath"));
	return this;
	}
	
	public tourismLoginPage clickonguest() {
	clickByXpath(prop.getProperty("tourismLoginPage.guest.Xpath"));
	return this;
	}
	
	public tourismLoginPage selecthotelRoom(String option) {
    selectyValueByXpath(prop.getProperty("tourismLoginPage.hotelRoom.Xpath"), option);
    return this;
	}
	
	public tourismLoginPage selecthotelAdult(String option) {
	selectyValueByXpath(prop.getProperty("tourismLoginPage.hotelAdult.Xpath"), option);
	return this;
	}
	
	public tourismLoginPage selecthotelChild(String option) {
	selectyValueByXpath(prop.getProperty("tourismLoginPage.hotelChild.Xpath"), option);
	return this;
    }
	
	public tourismLoginPage clickonDone() {
    clickByXpath(prop.getProperty("tourismLoginPage.Done.Xpath"));
    return this;
    }
	
	public HoteldetailsPage clickonFindHotel() {
	clickByXpath(prop.getProperty("tourismLoginPage.FindHotel.Xpath"));
	return new HoteldetailsPage(driver,test);
    }
	
	public tourismLoginPage newWindow() {
	switchToLastWindow();
	return this;
   }

	public tourismLoginPage Arrowdown() {
	arrowDown();
	return this;
    }
	}


