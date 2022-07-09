package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Driver.Driver;
import Driver.classA;

public class testcases1 extends Driver{
	classA clA;
	
	
	@Test
	public void launchFB() {
		test = extent.createTest("Verify the FB");
		clA =new classA(driver);
		clA.TC3();
		test.log(Status.PASS, "launched FB");
		
	}

}
