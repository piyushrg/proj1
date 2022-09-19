package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import OR.freeCrm_OR;


public class classA extends freeCrm_OR {
	
	WebDriver driver;
	common com;
	public classA(WebDriver driver) {
		this.driver = driver;
		com = new common(driver);
	}
	
	


	public void TC1() throws InterruptedException {
		driver.get("https://www.google.com/");
		com.meth1();
	}

	public void TC2() throws InterruptedException {
		driver.get("https://freecrm.com/");
		Thread.sleep(5000);	
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(teamsandcondition()));
		
	
	}
	
	public void TC3() {
		driver.get("https://www.facebook.com/");

	}
	
	
}
