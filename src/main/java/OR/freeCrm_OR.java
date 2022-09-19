package OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Driver.Driver;

public abstract class freeCrm_OR extends Driver {
	
	WebElement elm ;
	public WebElement contactManagment() {
		
		elm = driver.findElement(By.xpath("//i[contains(@class,'fa-user')]"));
		return elm;
		
	}
	
	public WebElement teamsandcondition() {
		elm = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		return elm;
	}
	
	public WebElement freecrmlogo() {
		elm = driver.findElement(By.xpath("//a[@class='navbar-brand']/img"));
		return elm;
	}

}
