package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Driver.Driver;
import Driver.classA;


public class testcases extends Driver {
	classA clA;
	//4ac7036dceb5488999b731270625e458
	
	
	@Test
	public void LaunchChrome() throws IOException, InterruptedException {
		//test = extent.createTest("Verify the test case 1");
		clA =new classA(driver);
		clA.TC1();
		test.log(Status.PASS, "launched google");
		Assert.assertTrue(driver.getTitle().contains("Piyush"));
		
	}
	
	@Test
	public void launchdifferent() {
		//test = extent.createTest("Verify the test case 2");
		clA =new classA(driver);
		clA.TC2();
		test.log(Status.PASS, "launched crm");
		
	}
	
}
