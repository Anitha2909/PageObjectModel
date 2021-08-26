package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {

	@Test
	public void GenerateReport(){
		
		//Start Report
		
		ExtentReports Report = new ExtentReports("./Reports/Result.html",false);
		
		//Start Test
		
		ExtentTest Test = Report.startTest("TC001", "Verify Pan Register");
		
		Test.assignAuthor("Anitha");
		Test.assignCategory("Family");
		
		//Log 
		
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		Test.log(LogStatus.PASS, "The Application got launched Successfully");
		
		//endTest
		
		Report.endTest(Test);
		
		//endReport
		
		Report.flush();
		
	}
}
