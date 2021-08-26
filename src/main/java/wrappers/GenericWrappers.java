package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	public RemoteWebDriver driver;
	
	int i=1;

	String modifiedXpath=null;
	
public static Properties prop;
	
	public void loadObjects() {
		
		    try {
				prop = new Properties();
				prop.load(new FileInputStream("./src/test/java/object.properties"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public void unloadObject() {
		prop=null;
	}
	
	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firfox")){
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver","./drivers/IEDriverserver.exe");
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//System.out.println("The Browser "+browser+" is launched successfully with the given URL: "+url);
			reportStep("The Browser "+browser+" is launched successfully with the given URL: "+url, "pass");
			
		} catch (SessionNotCreatedException e) {
			//System.err.println("The Browser "+browser+" is not launched due to session not created");
			reportStep("The Browser "+browser+" is not launched due to session not created","Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Browser "+browser+" is not launched due to unknown error");
			reportStep("The Browser "+browser+" is not launched due to unknown error", "Fail");
		}
	}


	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The Element with id "+idValue+" is entered with data "+data);
			reportStep("The Element with id "+idValue+" is entered with data "+data, "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+idValue+" is not found in the DOM");
			reportStep("The Element with id "+idValue+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+idValue+" is not visible in the application");
			reportStep("The Element with id "+idValue+" is not visible in the application", "Fail");
					
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with id "+idValue+" is not interactable in the application");
			reportStep("The Element with id "+idValue+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with id "+idValue+" is not stable in the application");
			reportStep("The Element with id "+idValue+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The Element with id "+idValue+" is not entered with data "+data+" due to unknown error" ,"Fail");
		} 
	}

	public void enterByName(String nameValue, String data) {
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The Element with name "+nameValue+" is entered with data "+data);
			reportStep("The Element with name "+nameValue+" is entered with data "+data, "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with name "+nameValue+" is not found in the DOM");
			reportStep("The Element with name "+nameValue+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with name "+nameValue+" is not visible in the application");
			reportStep("The Element with name "+nameValue+" is not visible in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with name "+nameValue+" is not interactable in the application");
			reportStep("The Element with name "+nameValue+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with name "+nameValue+" is not stable in the application");
			reportStep("The Element with name "+nameValue+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
		    reportStep("The Element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "Fail");
		} 
		
	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The Element with xpath "+xpathValue+" is entered with data "+data);
			reportStep("The Element with xpath "+xpathValue+" is entered with data "+data, "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathValue+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The Element with xpath "+xpathValue+" is not visible in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The Element with xpath "+xpathValue+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The Element with xpath "+xpathValue+" is not stable in the application" ,"Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
		    reportStep("The Element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "Fail");
		} 
	}

	public void verifyTitle(String title) {
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with expected title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with expected title "+title, "Pass");
			} else if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is not matched with the expected "+title);
				reportStep("The title of the page "+actualTitle+" is not matched with the expected "+title, "Fail");
			}
		} catch (WebDriverException e) {
			//System.err.println("The title of the page "+title+" is not verfied due to unknown error");
			reportStep("The title of the page "+title+" is not verfied due to unknown error", "Fail");
		}
	}

	public void verifyTextById(String id, String text) {
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The Element with id " +id+ " is holding the text "+actualText+" is matched with the expected text "+text);
				reportStep("The Element with id " +id+ " is holding the text "+actualText+" is matched with the expected text "+text, "Pass");
				
			}else if(actualText.equals(text)) {
				//System.out.println("The Element with id " +id+ "is holding the text" +actualText+" is not matched with the expected text "+text);
			    reportStep("The Element with id " +id+ "is holding the text" +actualText+" is not matched with the expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+id+ "is not found in the DOM");
			reportStep("The Element with id "+id+ "is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+id+ "is not visible in the application");
			reportStep("The Element with id "+id+ "is not visible in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with id "+id+ "is not interactable in the application");
			reportStep("The Element with id "+id+ "is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with id "+id+ "is not stable in the application");
			reportStep("The Element with id "+id+ "is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with id "+id+ "is not verified with the expected text "+text+" due to unknown error");
	        reportStep("The Element with id "+id+ "is not verified with the expected text "+text+" due to unknown error", "Fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The Element with xpath "+xpath+" is holding the text "+actualText+" is exactly matched with the expected text "+text);
				reportStep("The Element with xpath "+xpath+" is holding the text "+actualText+" is exactly matched with the expected text "+text, "Pass");
				
			} else if(actualText.equals(text)) {
				//System.out.println("The Element with xpath "+xpath+" is holding the text "+actualText+" is not exactly matched with the expected text "+text);
				reportStep("The Element with xpath "+xpath+" is holding the text "+actualText+" is not exactly matched with the expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with xpath "+xpath+" is not found in the DOM");
			reportStep("The Element with xpath "+xpath+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with xpath "+xpath+" is not visible in the application");
			reportStep("The Element with xpath "+xpath+" is not visible in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with xpath "+xpath+" is not interatable in the application ");
			reportStep("The Element with xpath "+xpath+" is not interatable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with xpath "+xpath+" is not stable in the application");
			reportStep("The Element with xpath "+xpath+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with xpath "+xpath+" is not verified with the expected text "+text+" due to unknown error");
		    reportStep("The Element with xpath "+xpath+" is not verified with the expected text "+text+" due to unknown error", "Fail");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.contains(text)) {
				//System.out.println("The Element with xpath "+xpath+" is holding the text "+actualText+" is approximately matched with the expected text "+text);
				reportStep("The Element with xpath "+xpath+" is holding the text "+actualText+" is approximately matched with the expected text "+text, "Pass");
				
			} else if(actualText.contains(text)) {
				//System.out.println("The Element with xpath "+xpath+" is holding the text "+actualText+" is not approximately matched with the expected text "+text);
			    reportStep("The Element with xpath "+xpath+" is holding the text "+actualText+" is not approximately matched with the expected text "+text, "Fail");
			}
		} catch (NoSuchElementException e) {
		    // System.err.println("The Element with xpath "+xpath+" is not found in the DOM");
		     reportStep("The Element with xpath "+xpath+" is not found in the DOM", "Fail");
		     
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with xpath "+xpath+" is not visible in the Application");
			reportStep("The Element with xpath "+xpath+" is not visible in the Application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with xpath "+xpath+" is not interactable in the application");
			reportStep("The Element with xpath "+xpath+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Elemen with xpath "+xpath+" is not stable in the application");
			reportStep("The Elemen with xpath "+xpath+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with xpath "+xpath+" is not verified with the expected text "+text+" due to unknown error");
		    reportStep("The Element with xpath "+xpath+" is not verified with the expected text "+text+" due to unknown error", "Fail");
		} 
	}

	public void clickById(String id) {

		try {
			driver.findElementById(id).click();
			//System.out.println("The Element with id "+id+" is clicked successfully");
			reportStep("The Element with id "+id+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "Fail");
			
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element with id "+id+" is not clicked properly in the application");
			reportStep("The Element with id "+id+" is not clicked properly in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with id "+id+" is not interactable in the application");
			reportStep("The Element with id "+id+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with id" +id+ "is not clicked due to unknown error");
			reportStep("The Element with id" +id+ "is not clicked due to unknown error", "Fail");
		} 
	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The Element with classname "+classVal+" is clicked successfully");
			reportStep("The Element with classname "+classVal+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with classname "+classVal+" is not found in the DOM");
			reportStep("The Element with classname "+classVal+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with classname "+classVal+" is not visible in the application");
			reportStep("The Element with classname "+classVal+" is not visible in the application", "Fail");
			
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element with classname "+classVal+" is not clicked properly in the application");
			reportStep("The Element with classname "+classVal+" is not clicked properly in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with classname "+classVal+" is not interactable in the application");
			reportStep("The Element with classname "+classVal+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with classname "+classVal+" is not stable in the application");
			reportStep("The Element with classname "+classVal+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with classname "+classVal+" is not clicked due to unknown error");
			reportStep("The Element with classname "+classVal+" is not clicked due to unknown error", "Fail");
		} 
	}

	public void clickByName(String name) {
		try {
			driver.findElementByName(name).click();
			//System.out.println("The Element with name "+name+" is clicked successfully");
			reportStep("The Element with name "+name+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with name "+name+" is not found in the DOM");
			reportStep("The Element with name "+name+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with name "+name+" is not visible in the application");
			reportStep("The Element with name "+name+" is not visible in the application", "Fail");
			
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element with name "+name+" is not clicked properly in the application");
			reportStep("The Element with name "+name+" is not clicked properly in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with name "+name+" is not interactable in the application");
			reportStep("The Element with name "+name+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with name "+name+" is not stable in the application");
			reportStep("The Element with name "+name+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with name "+name+" is not clicked due to unknown error");
			reportStep("The Element with name "+name+" is not clicked due to unknown error", "Fail");
		} 	
	}

	public void clickByLink(String name) {
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with Link "+name+" is clicked successfully");
			reportStep("The Element with Link "+name+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with Link "+name+" is not found in the DOM");
			reportStep("The Element with Link "+name+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with Link "+name+" is not visible in the application");
			reportStep("The Element with Link "+name+" is not visible in the application", "Fail");
			
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element with Link "+name+" is not clicked properly in the application");
			reportStep("The Element with Link "+name+" is not clicked properly in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with Link "+name+" is not interactable in the application");
			reportStep("The Element with Link "+name+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with Link "+name+" is not stable in the application");
			reportStep("The Element with Link "+name+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with Link "+name+" is not clicked due to unknown error");
			reportStep("The Element with Link "+name+" is not clicked due to unknown error", "Fail");
		} 
	}

	public void clickByLinkNoSnap(String name) {
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with Link "+name+" is clicked successfully");
			reportStep("The Element with Link "+name+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with Link "+name+" is not found in the DOM");
			reportStep("The Element with Link "+name+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with Link "+name+" is not visible in the application");
			reportStep("The Element with Link "+name+" is not visible in the application", "Fail");
			
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element with Link "+name+" is not clicked properly in the application");
			reportStep("The Element with Link "+name+" is not clicked properly in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with Link "+name+" is not interactable in the application");
			reportStep("The Element with Link "+name+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with Link "+name+" is not stable in the application");
			reportStep("The Element with Link "+name+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with Link "+name+" is not clicked due to unknown error");
			reportStep("The Element with Link "+name+" is not clicked due to unknown error", "Fail");	
		}
		
	}


	public void clickByXpath(String xpathVal, String value) {
		try {
			
			if(xpathVal.contains("option")) {
			 modifiedXpath = xpathVal.replace("option", value);
			 System.out.println(modifiedXpath);
			}
			
			driver.findElementByXPath(modifiedXpath).click();
			System.out.println(modifiedXpath);
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+modifiedXpath+" is clicked successfully", "pass");
			
		}catch (NoSuchElementException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+modifiedXpath+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with xpath "+modifiedXpath+" is not visible in the application", "Fail");
			
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not clicked properly in the application");
			reportStep("The Element with xpath "+modifiedXpath+" is not clicked properly in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The Element with xpath "+modifiedXpath+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
		   //System.err.println("The Element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The Element with xpath "+modifiedXpath+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The Element with xpath "+modifiedXpath+" is not clicked due to unknown error", "Fail");
		} 
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The Element with xpath "+xpathVal+" is clicked successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The Element with xpath "+xpathVal+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The Element with xpath "+xpathVal+" is not visible in the application", "Fail");
			
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not clicked properly in the application");
			reportStep("The Element with xpath "+xpathVal+" is not clicked properly in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The Element with xpath "+xpathVal+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The Element with xpath "+xpathVal+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The Element with xpath "+xpathVal+" is not clicked due to unknown error", "Fail");
		}
	}

	public String getTextById(String idVal) {
		
		String txt = null;
	   try {
		 txt = driver.findElementById(idVal).getText();
			//System.out.println("The Element with id "+idVal+"is fetched the text "+txt+" successfully" );
			reportStep("The Element with id "+idVal+"is fetched the text "+txt+" successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+idVal+" is not found in the DOM");
			reportStep("The Element with id "+idVal+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+idVal+" is not visible in the Application");
			reportStep("The Element with id "+idVal+" is not visible in the Application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with id "+idVal+" is not fetched the text "+txt+" due to unknown error");
			reportStep("The Element with id "+idVal+" is not fetched the text "+txt+" due to unknown error", "Fail");
		}
		return txt;
	}

	public String getTextByXpath(String xpathVal) {
		String text = null;
		try {
			 text = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Element with xpath "+xpathVal+" is fetched the text "+text+" successfully");
			reportStep("The Element with xpath "+xpathVal+" is fetched the text "+text+" successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not found in the Application");
			reportStep("The Element with xpath "+xpathVal+" is not found in the Application", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The ELement with xpath "+xpathVal+" is not visible in the Application");
			reportStep("The ELement with xpath "+xpathVal+" is not visible in the Application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with xpath "+xpathVal+" is not fetched the text "+text+" due to unknown error");
			reportStep("The Element with xpath "+xpathVal+" is not fetched the text "+text+" due to unknown error", "Fail");
		}
		return text;
	}

	public void selectVisibileTextById(String id, String value) {
		 try {
			WebElement text = driver.findElementById(id);
			 Select sel= new Select(text);
			 sel.selectByVisibleText(value);
			//System.out.println("The Element with id "+id+" is Selected the visibletext "+value+" successfully");
			 reportStep("The Element with id "+id+" is Selected the visibletext "+value+" successfully", "Pass");
			 
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "Fail");
			
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element with id "+id+ " is not selectable in the application");
			reportStep("The Element with id "+id+ " is not selectable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "Fail");
			
		} catch (NoSuchFrameException e) {
	       //System.err.println("The Element with id "+id+" frame is not available in the Application ");
	       reportStep("The Element with id "+id+" frame is not available in the Application ", "Fail");
	       
		}catch (WebDriverException e) {
			//System.err.println("The Element with id "+id+" is not selected the visible text "+value+" due to unknown error");
			reportStep("The Element with id "+id+" is not selected the visible text "+value+" due to unknown error", "Fail");
		} 
	}

	public void selectIndexById(String id, int value) {
		try {
			WebElement txt = driver.findElementById(id);
			Select sel = new Select(txt);
			sel.selectByIndex(value);
			//System.out.println("The Element with id "+id+" is selected the Index "+value+" successfully");
			reportStep("The Element with id "+id+" is selected the Index "+value+" successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "Fail");
			
		} catch (ElementNotSelectableException e) {
		  //System.err.println("The Elementw with id "+id+" is not selectable in the application");
		  reportStep("The Elementw with id "+id+" is not selectable in the application", "Fail");
		  
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "Fail");
			
		} catch (NoSuchFrameException e) {
			//System.err.println("The Element with id "+id+" frame is not available in the Application ");
			reportStep("The Element with id "+id+" frame is not available in the Application ", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with id "+id+" is not selected the Index "+value+" due to unknown error");
			reportStep("The Element with id "+id+" is not selected the Index "+value+" due to unknown error", "Fail");
		} 
	}

	public void switchToParentWindow() {
		 
			try {
				Set<String> allWinIdAfterClick = driver.getWindowHandles();
				  for( String eachID :allWinIdAfterClick)
					{
						driver.switchTo().window(eachID);
					    break;
					}
				// System.out.println("The Element with window is successfully switched to ParentWindow");
				 reportStep("The Element with window is successfully switched to ParentWindow", "Pass");
				 
			} catch (NoSuchWindowException e) {
				//System.err.println("The Element with window is not available in the application ");
				reportStep("The Element with window is not available in the application ", "Fail");
				
			} catch (SessionNotCreatedException e) {
				//System.err.println("The Element with window is not launched due to Session ID not created");
				reportStep("The Element with window is not launched due to Session ID not created", "Fail");
				
			} catch (WebDriverException e) {
				//System.err.println("The Element with window is not switched to ParentWindow due to unknown error");
				reportStep("The Element with window is not switched to ParentWindow due to unknown error", "Fail");
			} 
	}

	public void switchToLastWindow() {
		
			try {
				Set<String> allWinIdAfterClick = driver.getWindowHandles();
				  for( String eachID :allWinIdAfterClick)
					{
						driver.switchTo().window(eachID);
					}
				 //System.out.println("The Element with Window is successfully switched to LastWindow");
				 reportStep("The Element with Window is successfully switched to LastWindow", "Pass");
				 
			} catch (NoSuchWindowException e) {
				//System.err.println("The Element with Window is not available in the Application ");
				reportStep("The Element with Window is not available in the Application ", "Fail");
				
			} catch (SessionNotCreatedException e) {
				//System.err.println("The Element with Window is not launched due to Session ID not created");
				reportStep("The Element with Window is not launched due to Session ID not created", "Fail");
				
			} catch (WebDriverException e) {
				//System.err.println("The Element with Window is not switched to LastWindow due to unknown error");
				reportStep("The Element with Window is not switched to LastWindow due to unknown error", "Fail");	
			} 
	}

	public void acceptAlert() {
		 try {
			driver.switchTo().alert().accept();
			//System.out.println("The Element with acceptalert is successfully accepted the alert ");
			reportStep("The Element with acceptalert is successfully accepted the alert ", "Pass");
			
		} catch (NoAlertPresentException e) {
			//System.err.println("The Element with acceptalert is unable to find the alert in the application");
			reportStep("The Element with acceptalert is unable to find the alert in the application", "Fail");
			
		} catch (UnhandledAlertException e) {
			//System.err.println("The Element with acceptalert is unable to handle the alert in the application ");
			reportStep("The Element with acceptalert is unable to handle the alert in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with acceptalert is not accepted the alert due to unknown error");
			reportStep("The Element with acceptalert is not accepted the alert due to unknown error", "Fail");
		} 
	}

	public void dismissAlert() {
		 try {
			driver.switchTo().alert().dismiss();
			 //System.out.println("The Element with dismissalert is successfully dismissed the alert ");
			 reportStep("The Element with dismissalert is successfully dismissed the alert ", "Pass");
			 
		} catch (NoAlertPresentException e) {
			//System.err.println("The Element with dismissalert is unable to find the alert in the application");
			reportStep("The Element with dismissalert is unable to find the alert in the application", "Fail");
			
		} catch (UnhandledAlertException e) {
		    //System.err.println("The Element with dismissalert is unable to handle the alert in the application");
		    reportStep("The Element with dismissalert is unable to handle the alert in the application", "Fail");
		    
		} catch (WebDriverException e) {
			//System.err.println("The Element with dismissalert is not dismissed the alert due to unknown error");
			reportStep("The Element with dismissalert is not dismissed the alert due to unknown error", "Fail");
		}
	}

	public String getAlertText() {
		String str = null;
		try {
		str = driver.switchTo().alert().getText();
		//System.out.println("The Element with the Alerttext fetched the text "+str+" successfully");
		reportStep("The Element with the Alerttext fetched the text "+str+" successfully", "Pass");
		
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with Alerttext is not found in the DOM");
			reportStep("The Element with Alerttext is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with Alerttext is not visisble in the application");
			reportStep("The Element with Alerttext is not visisble in the application", "Fail");
			
		} catch (UnhandledAlertException e) {
          //System.err.println("The Element with Alerttext is unable to handle in the application ");
			reportStep("The Element with Alerttext is unable to handle in the application ", "Fail");
			
		} catch (NoAlertPresentException e) {
			//System.err.println("The Element with Alerttext is unable to find the alert in the application");
			reportStep("The Element with Alerttext is unable to find the alert in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with Alerttext is not fetched text "+str+" due to unknown error");
			reportStep("The Element with Alerttext is not fetched text "+str+" due to unknown error", "Fail");
		} 
		return str;
	} 
	
	public long takeSnap() {
		
		long number=0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File ("./report/screenshots/"+number+".png");
			FileUtils.copyFile(tmp,dest);
			//System.out.println("The Element with takesnap is successfully taken screenshot");
			//reportStep("The Element with takesnap is successfully taken screenshot", "Pass");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with takesnap is unable to take screenshot due to unknown error");
			//reportStep("The Element with takesnap is unable to take screenshot due to unknown error", "Fail");
			
		} catch (IOException e) {
			//System.err.println("The Element with takesnap is unable to take screenshot due to IO error");
			//reportStep("The Element with takesnap is unable to take screenshot due to IO error", "Fail");
		}
		return number;
	}
	
	public void closeBrowser() {
		try {
			driver.close();
			//System.out.println("The Element with Browser is closed successfully");
			reportStep("The Element with Browser is closed successfully", "Pass");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with Browser is not closed due to unknown error");
			reportStep("The Element with Browser is not closed due to unknown error", "Fail");
		} 
		
	}

	public void closeAllBrowsers() {
		 try {
			driver.quit();
			 //System.out.println("The Element with Browser is closed successfully");
			 reportStep("The Element with Browser is closed successfully", "Pass");
			 
		} catch (WebDriverException e) {
			//System.err.println("The Element with Browser is not closed due to unknown error");
			reportStep("The Element with Browser is not closed due to unknown error", "Fail");
	    } 
	}


	public void waitProperty(long time) {
		try {
			Thread.sleep(time);
			//System.out.println("The Element with waitPropert is waited Successfully");
			reportStep("The Element with waitPropert is waited Successfully", "Pass");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with waitPropert is not worked due to unknown error");
			reportStep("The Element with waitPropert is not waited due to unknown error", "Fail");
			
		} catch (InterruptedException e) {
			reportStep("The Element with waitPropert is not worked due to unknown error", "Fail");
		}
	}
	
	public void pageDown(String xpath) {
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The Element with pageDown is worked successfully");
			reportStep("The Element with pageDown is worked successfully", "Pass");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with pageDown is not worked due to unknown error");
			reportStep("The Element with pageDown is not worked due to unknown error", "Fail");
		}
	}

	public void arrowDown() {
		 try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.ARROW_DOWN);
			//System.out.println("The Element with arrowDown is worked successfully");
			reportStep("The Element with arrowDown is worked successfully", "Pass");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with arrowDown is not worked due to unknown error");
			reportStep("The Element with arrowDown is not worked due to unknown error", "Fail");
			
		}
	}
	
	
	
	public void selectValueById (String id, String value) {
	
		try {
			WebElement txt = driver.findElementById(id);
			Select sel = new Select(txt);
			sel.selectByValue(value);
			//System.out.println("The Element with id "+id+" is Selected the value "+value+" successfully");
			reportStep("The Element with id "+id+" is Selected the value "+value+" successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "Fail");
			
		} catch (ElementNotSelectableException e) {
         //System.err.println("The Elementw with id "+id+" is not selectable in the application");
		  reportStep("The Elementw with id "+id+" is not selectable in the application", "Fail");
		  
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "Fail");
			
		} catch (NoSuchFrameException e) {
			//System.err.println("The Element with id "+id+" frame is not available in the Application ");
			reportStep("The Element with id "+id+" frame is not available in the Application ", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with id "+id+" is not selected the Value "+value+" due to unknown error");
			reportStep("The Element with id "+id+" is not selected the Value "+value+" due to unknown error", "Fail");
		}
	}
	
	
	public void enterByIdTab(String idValue, String data, Keys tab) {
		
		try {
			driver.findElementById(idValue).sendKeys(data,Keys.TAB);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "Pass");
			
		} catch (NoSuchElementException e) {
		   // System.err.println("The element with id "+idValue+" is not found in DOM");
		    reportStep("The element with id "+idValue+" is not found in DOM", "Fail");
		    
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+idValue+" is not visisble in the application");
			reportStep("The element with id "+idValue+" is not visisble in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The element with id "+idValue+"is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+"is not entered with data "+data+" due to unknown error", "Fail");
		}
	}


	public void enterByNameTab(String String, String String2, Keys tab) {
	
	    try {
			driver.findElementByName(String).sendKeys(String2,Keys.TAB);
			//System.out.println("The element with name "+String+" is entered with data "+String2);
			reportStep("The element with name "+String+" is entered with data "+String2, "Pass");
			
		} catch (NoSuchElementException e) {
		    //System.err.println("The element with name "+String+" is not found in DOM");
		    reportStep("The element with name "+String+" is not found in DOM", "Fail");
		    
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+String+" is not visisble in the application");
			reportStep("The element with name "+String+" is not visisble in the application", "Fail");
			
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with name "+String+" is not interactable in the application");
			reportStep("The element with name "+String+" is not interactable in the application", "Fail");
			
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+String+" is not stable in the application");
			reportStep("The element with name "+String+" is not stable in the application", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The element with name "+String+"is not entered with data "+String2+" due to unknown error");
			reportStep("The element with name "+String+"is not entered with data "+String2+" due to unknown error", "Fail");
		}
	}
	  public  void selectyValueByXpath(String Xpath, String Value) {
		
		try {
			WebElement actualXpath = driver.findElementByXPath(Xpath);
			Select sel = new Select(actualXpath);
			sel.selectByValue(Value);
			
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(actualXpath));
			
			reportStep("The Element with Xpath "+Xpath+" is selected the "+Value+" successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with id "+Xpath+" is not found in the DOM");
			reportStep("The Element with Xpath "+Xpath+" is not found in the DOM", "Fail");
			
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id "+Xpath+" is not visible in the application");
			reportStep("The Element with Xpath "+Xpath+" is not visible in the application", "Fail");
			
		} catch (ElementNotSelectableException e) {
		  //System.err.println("The Elementw with id "+Xpath+" is not selectable in the application");
		  reportStep("The Elementw with Xpath "+Xpath+" is not selectable in the application", "Fail");
		  
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with id "+Xpath+" is not stable in the application");
			reportStep("The Element with Xpath "+Xpath+" is not stable in the application", "Fail");
			
		} catch (NoSuchFrameException e) {
			//System.err.println("The Element with id "+Xpath+" frame is not available in the Application ");
			reportStep("The Element with Xpath "+Xpath+" frame is not available in the Application ", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with id "+Xpath+" is not selected the Index "+Value+" due to unknown error");
			reportStep("The Element with Xpath "+Xpath+" is not selected the Value "+Value+" due to unknown error", "Fail");
		} 
	  }

	  public void mouseHoverByXpath(String Xpath) {
		  try {
			WebElement Move = driver.findElementByXPath(Xpath);
			  Actions action = new Actions(driver);
			  action.moveToElement(Move).perform();
			  //System.out.println("The Element with MouseHover moved succesfully");
			  reportStep("The Element with MouseHover moved succesfully", "Pass");
			  
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with MouseHover is not moved succesfully");
			reportStep("The Element with MouseHover is not moved succesfully", "Fail");
			
		} catch (WebDriverException e) {
			//System.err.println("The Element with MouseHover is not moved due to unknown error");
			reportStep("The Element with MouseHover is not moved due to unknown error", "Fail");
		}
	  }

	  public  void selectVisibileTextByXpath(String Xpath, String Text) {
			
			try {
				WebElement actualXpath = driver.findElementByXPath(Xpath);
				Select sel = new Select(actualXpath);
				sel.selectByVisibleText(Text);
			
				reportStep("The Element with Xpath "+Xpath+" is selected the "+Text+" successfully", "Pass");
				
			} catch (NoSuchElementException e) {
				//System.err.println("The Element with id "+Xpath+" is not found in the DOM");
				reportStep("The Element with Xpath "+Xpath+" is not found in the DOM", "Fail");
				
			} catch (ElementNotVisibleException e) {
				//System.err.println("The Element with id "+Xpath+" is not visible in the application");
				reportStep("The Element with Xpath "+Xpath+" is not visible in the application", "Fail");
				
			} catch (ElementNotSelectableException e) {
			  //System.err.println("The Elementw with id "+Xpath+" is not selectable in the application");
			  reportStep("The Elementw with Xpath "+Xpath+" is not selectable in the application", "Fail");
			  
			} catch (StaleElementReferenceException e) {
				//System.err.println("The Element with id "+Xpath+" is not stable in the application");
				reportStep("The Element with Xpath "+Xpath+" is not stable in the application", "Fail");
				
			} catch (NoSuchFrameException e) {
				//System.err.println("The Element with id "+Xpath+" frame is not available in the Application ");
				reportStep("The Element with Xpath "+Xpath+" frame is not available in the Application ", "Fail");
				
			} catch (WebDriverException e) {
				//System.err.println("The Element with id "+Xpath+" is not selected the Index "+Value+" due to unknown error");
				reportStep("The Element with Xpath "+Xpath+" is not selected the text "+Text+" due to unknown error", "Fail");
			} 
		  }

	  
	  public void enterByXpathTab(String Xpath, String Option, Keys tab) {
			
		    try {
				driver.findElementByXPath(Xpath).sendKeys(Option,Keys.TAB);
				//System.out.println("The element with name "+String+" is entered with data "+String2);
				reportStep("The element with Xpath "+Xpath+" is entered with data "+Option, "Pass");
				
			} catch (NoSuchElementException e) {
			    //System.err.println("The element with name "+String+" is not found in DOM");
			    reportStep("The element with Xpath "+Xpath+" is not found in DOM", "Fail");
			    
			} catch (ElementNotVisibleException e) {
				//System.err.println("The element with name "+String+" is not visisble in the application");
				reportStep("The element with Xpath "+Xpath+" is not visisble in the application", "Fail");
				
			} catch (ElementNotInteractableException e) {
				//System.err.println("The element with name "+String+" is not interactable in the application");
				reportStep("The element with Xpath "+Xpath+" is not interactable in the application", "Fail");
				
			} catch (StaleElementReferenceException e) {
				//System.err.println("The element with name "+String+" is not stable in the application");
				reportStep("The element with Xpath "+Xpath+" is not stable in the application", "Fail");
				
			} catch (WebDriverException e) {
				//System.err.println("The element with name "+String+"is not entered with data "+String2+" due to unknown error");
				reportStep("The element with Xpath "+Xpath+"is not entered with data "+Option+" due to unknown error", "Fail");
			}
	  }

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	}



	






