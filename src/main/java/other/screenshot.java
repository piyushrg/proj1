package other;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import Driver.Driver;

public class screenshot{
	
	public String takescreenshot(ITestResult result) {
		
		String path = System.getProperty("user.dir") + File.separator + "screenshot" + File.separator + result.getMethod().getMethodName() + ".png";
		System.out.println(path);
		
		TakesScreenshot Ss = (TakesScreenshot)Driver.driver;
		File src  = Ss.getScreenshotAs(OutputType.FILE);
		
		//File file = ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src , new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	


}
