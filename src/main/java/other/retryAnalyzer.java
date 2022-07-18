package other;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer{

	int icount = 0;
	int retrycount = 1;
	
	public boolean retry(ITestResult result) {
		
		while(icount<retrycount) {
			icount++;
			return true;
		}
		return false;
	}

}
