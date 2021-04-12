package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	

	public void onTestStart(ITestResult result) {
		
		System.out.println("New Test Started");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Successfully Finished"+result.getName() );
		
	}
 
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed" +" "+result.getName());
		
	}
 
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Skipped" );
		
	}

}
