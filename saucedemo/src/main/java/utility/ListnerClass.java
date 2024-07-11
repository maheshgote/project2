package utility;


import base.TestBase;

import java.io.IOException;

import org.testng.ITestListener;
import base.TestBase;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListnerClass extends TestBase implements ITestListener {

	
	
	 public ListnerClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	    public void onTestFailure(ITestResult result) {
	        // Capture screenshot on test failure
		try {
			
			TestUtil.takeScreenshotAtEndOfTest();
			}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	    

	    @Override
	    public void onTestStart(ITestResult result) {}{
	    	System.out.println("Testing started listner log");
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {}

	    @Override
	    public void onTestSkipped(ITestResult result) {}

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

	    @Override
	    public void onStart(ITestContext context) {}

	    @Override
	    public void onFinish(ITestContext context) {}
	
	
	

}
