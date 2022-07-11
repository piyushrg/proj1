package Driver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import other.screenshots;

public class Driver {
	
	
	
	screenshots ss = new screenshots();
	public static WebDriver driver;
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public void takescreenshot(String filename) throws IOException {
		//take the screenshot and save it as a file format
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy the screenshot to desired location using copy file method
		FileUtils.copyFile(file, new File("D:\\\\StudyNew\\\\WorkSpace\\\\screenshot\\\\screenshot"+filename+".jpg"));
		
	}

	@BeforeSuite
	public void ExtentReport() {
		htmlreporter = new ExtentHtmlReporter("TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
				
	}
	
	@BeforeMethod
	public void  launchbrowser() {
				
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-infobars");
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			String temp = screenshots.takescreenshot(driver);
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"FAILED", ExtentColor.RED));
			test.log(Status.FAIL,result.getThrowable().getMessage());
			test.fail("Screenshot" + test.addScreenCaptureFromPath(temp));
		}
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
		driver.quit();
	}
	

	@AfterSuite
	public void After() {
		extent.flush();
	}
	
	public WebDriver getdriver() {
		return driver;
	}

}
