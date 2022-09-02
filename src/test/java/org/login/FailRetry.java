package org.login;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRetry implements IRetryAnalyzer {

	int min = 1;
	int max = 5;

	@Override
	public boolean retry(ITestResult arg0) {
		if (min < max) {

			min++;
			return true;

		}
		return false;
	}

}
