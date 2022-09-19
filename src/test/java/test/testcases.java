package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Driver.Driver;
import Driver.classA;
import Driver.common;
import OR.freeCRM;
import OR.termsandconditionCRM;
import pages.googlePage;


public class testcases extends Driver {
	classA clA;
	common com;
	

	@Test
	public void LaunchChrome() throws Exception {
		
		googlePage gooPage =  PageFactory.initElements(driver, googlePage.class);
		gooPage.launchGoogle("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Piyush"));
		
	}
	
	@Test
	public void launchdifferent() throws InterruptedException {
		
		freeCRM CRMmain=PageFactory.initElements(driver, freeCRM.class);
		CRMmain.launchurl("https://freecrm.com/");
		CRMmain.waitforcrmlogo();
		CRMmain.clickoncontactmanagment();
		CRMmain.clickontermsandcondition();
		termsandconditionCRM terms = PageFactory.initElements(driver, termsandconditionCRM.class);
		terms.verifyacceptacne();
		
		

		
		
	}
	
}
