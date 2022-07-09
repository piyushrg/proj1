package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class common  {
	
	WebDriver driver;
	
	public common(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void meth1() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("piyush");
		Thread.sleep(2000);
	}
	


}
