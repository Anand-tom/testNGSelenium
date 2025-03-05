package TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
	public void onStart(ITestContext result) {
		System.out.println(result.getName()+" onStart");
	}
	
	public void onFinishTwo(ITestContext result) {
		System.out.println(result.getName()+" onFinish");
	}
	
	
	
	public void onTestFailureTwo(ITestResult result) {
		System.out.println(result.getName()+" got failed");
	}
	
	public void onTestStartTwo(ITestResult result) {
		System.out.println(result.getName()+" got Started");
	}
	
	public void onTestSuccessTwo(ITestResult result) {
		System.out.println(result.getName()+" got Passed");	}
}
