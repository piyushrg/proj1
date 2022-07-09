package other;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.utils.FileUtil;


public class screenshots  {
	
	public static String takescreenshot(WebDriver driver) throws IOException {
		
		//take the screenshot and save it as a file format
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//copy the screenshot to desired location using copy file method
		String path = "D:\\StudyNew\\WorkSpace\\screenshot"+System.currentTimeMillis()+".png";
		FileUtils.copyFile(file, new File(path));
		return path;
	}

}
