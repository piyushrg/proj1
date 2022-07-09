package Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class classA  {
	
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

	public void TC2() {
		driver.get("https://freecrm.com/");
	}
	
	public void TC3() {
		driver.get("https://www.facebook.com/");
	}
}
