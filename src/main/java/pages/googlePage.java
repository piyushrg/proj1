package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import OR.googleOR;

import Driver.Driver;

public class googlePage extends googleOR{
	
	WebDriver driver;
	ExtentTest test = Driver.test;
	
	public googlePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void launchGoogle(String URL) throws Exception {
		driver.get(URL);
		test.log(Status.PASS, "google page launched");
		Thread.sleep(3000);
		searchbox.sendKeys("Piyush");
		test.log(Status.PASS, "search happened successfully");
	}

}
