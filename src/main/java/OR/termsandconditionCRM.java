package OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Driver.Driver;

public class termsandconditionCRM {

	WebDriver driver;
	ExtentTest test = Driver.test;
	
	
	public termsandconditionCRM(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath = "//h1[text()='ACCEPTANCE OF TERMS']") WebElement acceptance;
	
	
	
	public void verifyacceptacne() {
		String act = acceptance.getText();
		String exp = "ACCEPTANCE OF TERMS";
		Assert.assertEquals(act, exp);
		test.log(Status.PASS, "actual and expected match on page");
	}
	
}
