package Junit.Restassured;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Restassured implements IRetryAnalyzer{
	@Test(groups = "smoke")
	public void m1() {
		System.out.println("void m1");
	}
	int count=0;
	int max=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<max) {
			count++;
			return true;
		}
		return false;
	}

}
