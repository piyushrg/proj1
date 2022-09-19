package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import OR.freeCrm_OR;



public class common extends freeCrm_OR {
	
	WebDriver driver;
	
	
	public common(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void meth1() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("piyush");
		Thread.sleep(2000);
	}
	
	public void scrollintoview() throws InterruptedException {
		System.out.println("in method");
		WebElement elm = teamsandcondition();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", elm);
		//js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		elm.click();
	}
	
	
	
	


}
