package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryAnalyzer implements IRetryAnalyzer  {
	
	private int initialRetryCount = 0;
	private static final int maxRetryCount = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if (initialRetryCount < maxRetryCount) {
			initialRetryCount++;
			//System.out.println("Retrying test: " + result.getName() + " | Attempt: " + (initialRetryCount));
			return true;
		}
				
		return false;
	}
  
	
	
	
}
