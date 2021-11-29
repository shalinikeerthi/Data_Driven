package com.org;

import org.testng.IRetryAnalyzer;
import org.testng.ITest;
import org.testng.ITestResult;

public class IretryAnalayzer implements IRetryAnalyzer {
	int count = 0;
	int limit = 4;
	@Override
	public boolean retry (ITestResult result){
		if (count<limit) {
			count++;
			return true;
			
		}
		return false;
	}

}
