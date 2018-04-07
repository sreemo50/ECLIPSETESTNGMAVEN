package Common;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestContext;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;

public class TestListeners implements ITestListener {
	ExtentReports extent; 
	ExtentTest logger;
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		extent.startTest(result.getName()); 		
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		/*
		logger=extent.startTest("passTest");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS,"Test case (failure) status is passed");
		*/
		
		extent.flush();
		
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		//System.out.println("The test has failed becoze : "+result.getName());should be uncommeneted
		/*logger=extent.startTest("failTest");
		Assert.assertTrue(false);
		logger.log(LogStatus.PASS,"Test case passed is passTest");*/
		extent.flush();		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		extent.flush();
		//logger=extent.startTest("skipTest");
		//throw new SkipException("Skipping - This is not ready for testing"); should be uncommeneted
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		
		// TODO Auto-generated method stub F:\Repo
		/*extent=new ExtentReports(System.getenv("user.dir")+"/test-output/STMExtentReport.html",true);
		extent
		.addSystemInfo("Host Name", "Software Automation Meterial")
		.addSystemInfo("Environment", "Automation Practice")
		.addSystemInfo("User Name", "Sreekanth");
		
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xaml"));
		*/
		//System.out.println("The test has folder : "+System.getenv("user.dir"));
		
		
		extent=new ExtentReports(".\\src\\extendR\\STMExtentReport.html",true);
		extent
		.addSystemInfo("Host Name", "Software Automation Meterial")
		.addSystemInfo("Environment", "Automation Practice")
		.addSystemInfo("User Name", "Sreekanth");
		
		
		//extent.loadConfig(new File("F://projects//TESTSDETSILS//PLAZAAUTOMALLTEST//src//extendR//extent-config.xaml"));
		extent.loadConfig(new File(".\\src\\extendR\\extent-config.xml"));
		
		
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("The test has failed becoze : "+context.getName());
		
	}
	

}
