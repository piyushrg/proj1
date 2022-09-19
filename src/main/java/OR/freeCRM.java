package OR;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class freeCRM {
	
	WebDriver driver;
	ExtentTest test = Driver.test;
	
	
	public freeCRM(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath = "//i[contains(@class,'fa-user')]") WebElement contactmanagment;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']") WebElement tearmsandcondition;
	
	@FindBy(xpath = "//a[@class='navbar-brand']/img") WebElement crmlogo;
	
	public void launchurl(String url) {
		driver.get(url);
		test.log(Status.PASS,"Url is opened");
	}
	
	public void waitforcrmlogo() {
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(crmlogo));	
		test.log(Status.PASS, "crm logo successfully validated on page");
	}
	
	public void clickoncontactmanagment() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", contactmanagment);
		//contactmanagment.click();
		test.log(Status.PASS, "contact managment link is clicked");
	}
	
	public void clickontermsandcondition() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", tearmsandcondition);
		tearmsandcondition.click();
		test.log(Status.PASS, "tearms and condition link is clicked");
	}
		

}
